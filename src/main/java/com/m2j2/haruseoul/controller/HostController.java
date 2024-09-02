package com.m2j2.haruseoul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("host")
public class HostController {

    @GetMapping("create/info")
    public String info() {
        return "host/create/info";
    }

    @GetMapping("create/parties")
    public String parties() {
        return "host/create/parties";
    }

    @GetMapping("create/cost")
    public String cost() {
        return "host/create/cost";
    }

    @GetMapping("create/spots")
    public String spots() {
        return "host/create/spots";
    }


    @GetMapping("login")
    public String login() {
        return "host/login";
    }

    @GetMapping("create/image")
    public String image() {
        return "host/create/image";
    }

    @GetMapping("create/schedule")
    public String schedule() {
        return "host/create/schedule";
    }

    @GetMapping("program/list")
    public String list() {
        return "host/program/list";
    }

}
