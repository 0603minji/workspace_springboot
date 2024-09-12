package com.newlecture.web.cohourt8th.controller.admin;

import com.newlecture.web.cohourt8th.entity.Category;
import com.newlecture.web.cohourt8th.entity.Menu;
import com.newlecture.web.cohourt8th.entity.MenuView;
import com.newlecture.web.cohourt8th.model.MenuDetailModel;
import com.newlecture.web.cohourt8th.service.MenuService;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import static java.awt.SystemColor.menu;


@Controller("adminMenuController")
@RequestMapping("admin/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("list")
    public String list(
            Model model)
    {
        List<MenuView> menuView = menuService.getList();
        model.addAttribute("menuView", menuView);
        return "admin/menu/list";
    }

    @GetMapping("detail/{id}")
    public String detail(Model model,
                         @PathVariable(value = "id")
                         long id){

        Menu menu = menuService.getById(id);
        MenuDetailModel  menuModel = menuService.getDetailById(id);
        model.addAttribute("menu", menuModel.getMenu());
        model.addAttribute("imgs", menuModel.getImages());
        model.addAttribute("rcmds", menuModel.getRcmdMenus());
        model.addAttribute("menu", menu);
        return "admin/menu/detail";
    }

    @GetMapping("reg")
    public String reg() {
        return "admin/menu/reg";
    }

    @PostMapping("reg")
    public String reg(MultipartFile img,
                      HttpServletRequest request,
                      Menu menu,
                      @RequestParam("kor-name")
                          String korName,
                      @RequestParam("eng-name")
                          String engName,
                      @RequestParam("category-id")
                          Long categoryId)
    {
        System.out.println(menu);

        if(img.isEmpty())
            return "redirect:list";

        String path = request.getServletContext().getRealPath("/image/product");
//        System.out.println(path);

        File pathFile = new File(path);
        if(!pathFile.exists())
            pathFile.mkdirs();

        String fileName = img.getOriginalFilename();
//        String fullPath = path + File.pathSeparator +fileName;
        String fullPath = Paths.get(path, fileName).toString();

        try {
            img.transferTo(new File(fullPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        System.out.println(fullPath);
//        img.transferTo(new File(filename));

        menuService.reg(menu);

        return "redirect:list";
    }



}
