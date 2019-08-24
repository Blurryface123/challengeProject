package com.andres.Service;

import com.andres.DAO.UsersDAO;
import com.andres.Entity.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class UsersService {

    @Autowired
    private UsersDAO usersDAO;

    public Collection<Users> getAllUsers() {
        return usersDAO.getAllUsers();
    }

    public Users getUserById(int id) {
        return this.usersDAO.getUserById(id);
    }

    public void removeUsersById(int id) {
        this.usersDAO.removeUsersById(id);
    }
    public void updateUser(Users user){
        this.usersDAO.updateUser(user);
    }

    public void createUser(Users user) {
        usersDAO.createUser(user);
    }
}
