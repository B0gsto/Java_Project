package com.bogdan.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {
    @GetMapping("/test")
    public String test(Model model) {
        model.addAttribute("m", "Bogdan");
        return "testing.html";
    }

    @GetMapping("/home")
    public String home(Model model) {

        return "home.html";
    }
}
