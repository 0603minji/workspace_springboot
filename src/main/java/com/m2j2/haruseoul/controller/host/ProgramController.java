package com.m2j2.haruseoul.controller.host;

import com.m2j2.haruseoul.entity.Program;
import com.m2j2.haruseoul.entity.ProgramView;
import com.m2j2.haruseoul.service.host.ProgramService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/host/program")
public class ProgramController {

    @Autowired
    private ProgramService programService;

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

    @GetMapping("/list")
    public String list(
            @RequestParam(value = "category", required = false) List<String> category,
            Model model) {
        System.out.println("/list controller 호출");

        /**
         * todo. 컨트롤러의 역할
         * 1. 파라미터(@RequestParam) validation 검사
         *      ex. 음수가 들어오지는 않았는지
         *          2개 들어와야하는데 3개가 들어오지는 않았는지
         * 2. 서비스를 호출한다.
         * 3. 서비스가 준 값을 반환한다.
          */
        model.addAttribute("programs", programService.getCategory(category));
        return "host/program/list";         // 페이지 반환
    }
}
