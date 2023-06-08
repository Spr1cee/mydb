package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.mydb.entity.Route;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ua.com.mydb.service.RouteService;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long > {
    Page<Route> findAll(Pageable pageable);

}