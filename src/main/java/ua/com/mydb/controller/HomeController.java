package ua.com.mydb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String getPageHome(Model model){

        model.addAttribute("hello", "Hello world");

        return "home";
    }
}

