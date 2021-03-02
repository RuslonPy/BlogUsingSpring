package uz.ruslan.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("posts", "Page");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        model.addAttribute("posts", "Page");
        return "about";
    }
}
