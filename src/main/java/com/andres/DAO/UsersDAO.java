package com.andres.DAO;

import com.andres.Entity.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface UsersDAO {
    int createUser(UUID id, Users user);

    default int createUser(Users user){
        UUID id = UUID.randomUUID();
        return createUser(id, user);
    }

    List<Users> getAllUsers();
    Optional<Users> getUserById(UUID id);
    int deleteUsersById(UUID id);
    int updateUserById(UUID id, Users user) ;
/*
    public Users getUserById(int id) {
        return this.users.get(id);
    }

    public void deleteUsersById(int id) {

        this.users.remove(id);
    }
    public void updateUser(Users user){
        Users updatedUser = users.get(user.getId());
        updatedUser.setName(user.getName());
        updatedUser.setAge(user.getAge());
        updatedUser.setUserName(user.getUserName());
        updatedUser.setEmail(user.getEmail());
        updatedUser.setPassword(user.getPassword());
        users.put(user.getId(),user);
    }*/

}