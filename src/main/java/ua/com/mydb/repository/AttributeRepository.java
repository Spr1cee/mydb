package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.mydb.entity.Attribute;

public interface AttributeRepository extends JpaRepository<Attribute, Long> {
}