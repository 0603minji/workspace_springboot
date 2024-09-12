package com.newlecture.web.cohourt8th.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/mainController")
    public String mainController() {
        return "/practice/main";
    }

    @GetMapping("/categoryController")
    public String categoryController() {
        return "/practice/category";
    }

    @GetMapping("/index")
    public String indexController() {
        return "index";
    }


}
