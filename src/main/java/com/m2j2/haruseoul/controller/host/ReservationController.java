package com.m2j2.haruseoul.controller.host;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("host/reservation")
public class ReservationController {

    @GetMapping("list")
    public String list() {
        return "host/reservation/list";
    }

    @GetMapping("calender")
    public String calender() {
        return "host/reservation/calender";
    }
}
