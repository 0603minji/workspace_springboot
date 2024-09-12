package com.newlecture.web.cohourt8th.controller;

import com.newlecture.web.cohourt8th.entity.Category;
import com.newlecture.web.cohourt8th.entity.Menu;
import com.newlecture.web.cohourt8th.entity.MenuView;
import com.newlecture.web.cohourt8th.service.CategoryService;
import com.newlecture.web.cohourt8th.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller

@RequestMapping("menu")
public class MenuController {
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private MenuService menuService;

    @GetMapping("list")
    public String list(
            @RequestParam(value = "q", required = false) String query,
            @RequestParam(value = "c", required = false) Integer categoryId,
            Model model) {


        List<Category> categories = categoryService.getList();
        List<MenuView> menus = menuService.getList(query, categoryId);
        model.addAttribute("categories", categories);
        model.addAttribute("menus", menus);

        return "menu/list";
    }
}
