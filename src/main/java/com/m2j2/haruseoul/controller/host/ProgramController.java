package com.m2j2.haruseoul.controller.host;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("host/program")
public class ProgramController {

    @GetMapping("info/create")
    public String info() {
        return "host/program/create/info";
    }

    @GetMapping("parties/create")
    public String parties() {
        return "host/program/create/parties";
    }

    @GetMapping("cost/create")
    public String cost() {
        return "host/program/create/cost";
    }

    @GetMapping("spots/create")
    public String spots() {
        return "host/program/create/spots";
    }

    @GetMapping("image/create")
    public String image() {
        return "host/program/create/image";
    }

    @GetMapping("schedule/create")
    public String schedule() {
        return "host/program/create/schedule";
    }

    @GetMapping("list")
    public String list() {
        return "host/program/list";
    }

}
