package com.lothebys;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/index")
    public String Index(HttpServletRequest request) {
        return "index";
    }

    // 메인 페이지 설정
    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }// 메인 페이지 설정

    // test page
    @GetMapping("/test")
    public String test() {
        return "test";
    }

    // test page
    @GetMapping("/admin/home")
    public String adminHome() {
        return "admin/home";
    }
}
