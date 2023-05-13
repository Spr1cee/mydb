package ua.com.mydb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.mydb.entity.Route;
import ua.com.mydb.repository.RouteRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService {

    private final RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository){
        this.routeRepository = routeRepository;
    }

    public List<Route> getAllRoute(){

//        List<Route> routes = new ArrayList<>();
//        routes = routeRepository.findAll();
//        return routes;

        return routeRepository.findAll();
    }
}
