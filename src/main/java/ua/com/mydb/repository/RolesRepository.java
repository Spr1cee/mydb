package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.mydb.entity.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {
}