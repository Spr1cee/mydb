package ua.com.mydb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.mydb.entity.Route;
import ua.com.mydb.repository.RouteRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

@Service
public class RouteService {

    private final RouteRepository routeRepository;

    @Autowired
    public RouteService(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Cacheable(cacheNames = {"route"})
    public List<Route> getAllRoute(){

//        List<Route> Routes = new ArrayList<>();
//        Routes = RouteRepository.findAll();
//        return Routes;

        return routeRepository.findAll();
    }

    @Cacheable(cacheNames = "cate", key = "#pageable.pageNumber")
    public Page<Route> getAllPageRoute(Pageable pageable){
        return RouteRepository.findAll(pageable);
    }

}
