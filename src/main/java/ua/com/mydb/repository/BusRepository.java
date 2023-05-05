package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.mydb.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
}
