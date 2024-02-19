package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test() {
        System.out.println("test...");
        return "views/test";
    }

    @GetMapping("/select")
    public String selectTest(){
        System.out.println("selectTest");
        return "views/dept_list";
    }
}