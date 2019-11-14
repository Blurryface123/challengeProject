package com.andres.service;

import com.andres.userDAO.UsersDAO;
import com.andres.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Service
public class UsersService {

    private final UsersDAO usersDAO;

    @Autowired
    public UsersService(@Qualifier("postgres") UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }
    public int createUser(Users user) {

        return usersDAO.createUser(user);
    }

    public List<Users> getAllUsers() {
        return usersDAO.getAllUsers();
    }

    public Optional<Users> getUserById(UUID id){
        return usersDAO.getUserById(id);
    }

    public int deleteUser(UUID id){
        return usersDAO.deleteUsersById(id);
    }

    public int updateUser(UUID id, Users updatedUser){
        return usersDAO.updateUserById(id, updatedUser);
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
