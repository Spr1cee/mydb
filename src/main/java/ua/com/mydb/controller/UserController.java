package ua.com.mydb.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.mydb.entity.*;
import ua.com.mydb.service.UserService;

@Controller
public class UserController {


    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public String getPageOrder(@RequestParam(name = "username") String users,
                               @RequestParam(name = "password") String password,
                               HttpServletRequest request){

        if(userService.getLogicByUsernameAndPassword(users, password)){

            Users users1 = userService.getUserByUsernameAndPassword(users, password);
            HttpSession session = request.getSession();

            session.setAttribute("user", users1);

            return "redirect:/index";
        } else {
            return "redirect:/registration";
        }

    }

    @GetMapping("/login")
    public String getPageAuth(){
        return "login";
    }

    @GetMapping("/registration")
    public String getPageRegistration(){
        return "registration";
    }
}