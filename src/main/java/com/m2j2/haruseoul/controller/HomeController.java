package com.m2j2.haruseoul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/aside")
    public String aside() {
        return "inc/aside";
    }
  
    @GetMapping("/host/aside")
    public String asideHost() {
        return "inc/aside-host";
    }


}
