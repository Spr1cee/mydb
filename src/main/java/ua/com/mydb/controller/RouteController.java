package ua.com.mydb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ua.com.mydb.entity.Route;
import ua.com.mydb.service.RouteService;

import java.util.List;

@Controller
public class RouteController {

    private final RouteService routeService;

    @Autowired
    public RouteController(RouteService routeService){
        this.routeService = routeService;
    }

    @GetMapping("/routes")
    public String getPageHome(Model model){

      List<Route> routeList = routeService.getAllRoute();
   //   model.addAtribute("allRoute", routeList);

        return "route";
    }
}
