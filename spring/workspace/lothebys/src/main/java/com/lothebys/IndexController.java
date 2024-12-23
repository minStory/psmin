package com.lothebys;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class IndexController {

    @GetMapping("/index")
    public String Index(Model model) {
        return "index";
    }

    // 기본 페이지 설정
    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }
}
