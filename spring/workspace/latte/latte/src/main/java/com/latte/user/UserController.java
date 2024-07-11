package com.latte.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RequestMapping("/user")
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;

    @GetMapping("/home")
    public String list() {
        return null;
    }

    @GetMapping("/signup")
    public String signup(UserCreateForm userCreateForm) {
        return "user/signup_form";
    }

    @PostMapping("/signup")
    public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "user/signup_form";
        }

        try {
            String full_phone = "(" + userCreateForm.getMobile_carrier() + ")"
                            + userCreateForm.getPhone1()
                            + userCreateForm.getPhone2()
                            + userCreateForm.getPhone3();
            User user = new User();
            user.setPwd(userCreateForm.getPwd());
            user.setName(userCreateForm.getName());
            user.setPhone(full_phone);
            user.setEmail(userCreateForm.getEmail());
            user.setSignup_date(LocalDateTime.now());

            userService.create(user);

        } catch (Exception e) {
            e.printStackTrace();
            return "user/signup_form";
        }

        return "redirect:/";
    }
}
