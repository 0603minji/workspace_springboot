package com.m2j2.haruseoul.controller.host;

import com.m2j2.haruseoul.entity.Program;
import com.m2j2.haruseoul.entity.ProgramView;
import com.m2j2.haruseoul.service.ProgramService.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("host/program")
public class ProgramController {;

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


    @Autowired
    private ProgramService programService;

    @GetMapping("list")
    public String list(
            @RequestParam(value = "hostId",required = false) long hostId,
            Model model) {
        List<ProgramView> programs = programService.getList(hostId);

        System.out.println(programs);

        model.addAttribute("programs", programs);
        return "host/program/list";
    }

}
