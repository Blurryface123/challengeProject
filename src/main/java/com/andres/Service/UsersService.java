package com.andres.Service;

import com.andres.DAO.UsersDAO;
import com.andres.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service
public class UsersService {

    private final UsersDAO usersDAO;

    @Autowired
    public UsersService(@Qualifier("fakeDAO") UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }
    public int createUser(Users user) {

        return usersDAO.createUser(user);
    }

    public List<Users> getAllUsers() {
        return usersDAO.getAllUsers();
    }
/*
    public Users getUserById(int id) {
        return this.usersDAO.getUserById(id);
    }

    public void removeUsersById(int id) {
        this.usersDAO.removeUsersById(id);
    }
    public void updateUser(Users user){
        this.usersDAO.updateUser(user);
    }*/


}
