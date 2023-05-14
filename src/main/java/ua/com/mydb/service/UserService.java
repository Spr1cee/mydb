package ua.com.mydb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.mydb.entity.Users;
import ua.com.mydb.repository.UsersRepository;

@Service
public class UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public boolean getLogicByUsernameAndPassword(String user, String pass){

        boolean logic = false;

        if(!usersRepository.findAllByUsernameAndPassword(user, pass).isEmpty()) logic = true;

        return logic;
    }


    public Users getUserByUsernameAndPassword(String username, String password){

        Users users = new Users();
        users = (Users) usersRepository.findByUsernameAndPassword(username, password);

        return users;
    }



}