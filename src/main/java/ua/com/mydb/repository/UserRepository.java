package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.mydb.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
