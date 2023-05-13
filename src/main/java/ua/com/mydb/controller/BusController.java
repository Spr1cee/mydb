package ua.com.mydb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.com.mydb.entity.Bus;
import ua.com.mydb.entity.Route;
import ua.com.mydb.service.BusService;

import java.util.List;

@Controller
public class BusController {

    private final BusService busService;

    @Autowired
    public BusController(BusService busService){
        this.busService = busService;
    }
    @GetMapping("/route/{id}")
    public String getAllBusByRoute(@PathVariable(name = "id") Route route, Model model){

        List<Bus> busList = busService.getBusByRoute(route);
        model.addAttribute("allBusByRoute", busList);

        String name = (busList.isEmpty()) ? route.getName() : " ";
        model.addAttribute("route", name);
        return "busByRoute";
    }
}
