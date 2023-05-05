package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.mydb.entity.Route;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long > {
}
