package com.m2j2.haruseoul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CreateController {

    @GetMapping("/host/createCount")
    public String createCount() {
        return "host/createCount";
    }

    @GetMapping("/host/createCost")
    public String createCost() {
        return "host/createCost";
    }
}
