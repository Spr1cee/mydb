package ua.com.mydb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.com.mydb.entity.Users;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {

    List<Users> findAllByUsernameAndPassword(String username, String pass);

    Users findByUsernameAndPassword(String user, String pass);
}

