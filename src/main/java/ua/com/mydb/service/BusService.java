package ua.com.mydb.service;

import org.springframework.stereotype.Service;
import ua.com.mydb.entity.Bus;
import ua.com.mydb.entity.Route;
import ua.com.mydb.repository.BusRepository;

import java.util.List;

@Service
public class BusService {

    private final BusRepository busRepository;

    public BusService(BusRepository busRepository){
        this.busRepository = busRepository;
    }

    public List<Bus> getBusByRoute(Route route){

        return busRepository.findAllByRoutes(route);

    }
}
