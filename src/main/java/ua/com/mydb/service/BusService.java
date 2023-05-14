package ua.com.mydb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.mydb.entity.Bus;
import ua.com.mydb.entity.Route;
import ua.com.mydb.repository.BusRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class BusService {

    private final BusRepository busRepository;

    @Autowired
    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Cacheable(cacheNames = "bu", key = "#route.getId()")
    public List<Bus> getBusesByRoute(Route route){
        return busRepository.findAllByRoutes(route);
    }

    @Cacheable(cacheNames = "Busesbycategory", key = "#pageable.pageNumber")
    public Page<Bus> getPageBusByRoute(Route route, Pageable pageable){
        return busRepository.findAllByRoutes(pageable, route);
    }
}