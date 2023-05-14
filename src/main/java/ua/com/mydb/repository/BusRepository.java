package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.mydb.entity.Bus;
import ua.com.mydb.entity.Route;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {

    List<Bus> findAllByRoutes(Route route);

    Page<Bus> findAllByRoutes(Pageable pageable, Route route);

}
