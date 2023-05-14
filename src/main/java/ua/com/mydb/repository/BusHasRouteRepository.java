package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.mydb.entity.BusHasRoute;

public interface BusHasRouteRepository extends JpaRepository<BusHasRoute, Long> {
}

