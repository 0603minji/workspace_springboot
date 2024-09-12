package com.newlecture.web.cohourt8th.controller.teacher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller("teacherLectureController")
@RequestMapping("/teacher/lecture")
public class LectureController {
    @GetMapping("list")
    public String teacherLectureList() {
        return "teacher/lecture/list";
    }

    @GetMapping("detail")
    public String teacherLectureDetail() {
        return "teacher/lecture/detail";
    }
}
