package com.newlecture.web.cohourt8th.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.newlecture.web.cohourt8th.entity.Notice;
import com.newlecture.web.cohourt8th.repository.NoticeRepository;
import com.newlecture.web.cohourt8th.service.NoticeService;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/admin/notice")
public class NoticeController {
    
    @Autowired
    private NoticeService service;

    @GetMapping("list")
    //@ResponseBody
    public String list(@RequestParam(name = "p", defaultValue = "0") Integer page, Model model) throws SQLException, ClassNotFoundException {   int offset = page+1;
        List<Notice> notices = service.getList();
        model.addAttribute("notices", notices);
        model.addAttribute("test", "hello");
        System.out.println(offset);
        //return service.getList();
        return "admin/notice/list";
    }

  
//    @GetMapping("index")
//    public void index(HttpServletResponse response){
//
//        try (PrintWriter pw = response.getWriter()) {
//            pw.write("i babo ya");
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//

//    }
       
    }



