package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.mydb.entity.Interval;

@Repository
public interface IntervalRepository extends JpaRepository<Interval, Long> {
}
