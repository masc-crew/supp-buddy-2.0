package io.suppbuddy.suppbuddy_20.communication.controller;

import io.suppbuddy.suppbuddy_20.model.User;
import io.suppbuddy.suppbuddy_20.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/signup")
    public String showSignUpForm(User user) {
        return "signup";
    }

    @PostMapping("/signup")
    public String signUp(User user) {
        userService.save(user);
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

    @GetMapping("/admin")
    public String adminIndex() {
        return "admin/index";
    }
}
