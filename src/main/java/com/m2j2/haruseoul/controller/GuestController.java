package com.m2j2.haruseoul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("guest")
public class GuestController {

    @GetMapping("login")
    public String login() {
        return "guest/login";
    }
}
