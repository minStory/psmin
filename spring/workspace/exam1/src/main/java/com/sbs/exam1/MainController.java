package com.sbs.exam1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/sbs")
    @ResponseBody
    public String index() {
        return "안녕하세요 sbs에 오신 것을 환영합니다.";
    }

    // 최우선 페이지 강제 설정 -> 기본 index.html
//    @GetMapping("/")
//    public String root() {
//        return "redirect:/question/list";
//    }
}
