package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello") // url의 hello와 일치하는지 맵핑
    public String hello(Model model){
        model.addAttribute("data","spring!!");
        return "hello";
        //viewResolver(뷰 리졸버) : resources:templates/+(ViewName))+.html
        //return값이 hello이므로 templates의 hello.html을 찾아가게 spring에서 설정되어있다.
    }
}
