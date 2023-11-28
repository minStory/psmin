package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //MVC 방식
    //ViewResolver 작동(resources:templates/+(ViewName)+.html 찾아감)
    @GetMapping("hello") // url에 들어갈 부분
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "hello";
        //return값이 hello이므로 templates의 hello.html을 찾아가도록 spring에서 설정되어있다.
    }
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name",name);
        return "hello-template";
    }

    //API 방식
    //HttpMessageConverter 작동(@ResponseBody)
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("key") String name){
        return "hello "+name;
        //return값이 문자열이므로 StringConverter 작동
    }
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("key") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
        //return값이 객체이므로 JsonConverter(MappingJackson2HttpMessageConverter) 작동
    }
    static class Hello{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
