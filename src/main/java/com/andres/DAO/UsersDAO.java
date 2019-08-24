package com.andres.DAO;

import com.andres.Entity.Users;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class UsersDAO {
    private static Map<Integer, Users> users;

    static {
        users = new HashMap<Integer, Users>() {
            {
                put(1, new Users(1, "Ana", 26, "assassin", "ana@gmail.com", "1234"));
                put(2, new Users(2, "Juan", 22, "juanito", "juan@gmail.com", "12345"));
                put(3, new Users(3, "Pedro", 24, "pedrito", "pedro@gmail.com", "123456"));
            }
        };
    }

    public Collection<Users> getAllUsers() {
        return this.users.values();
    }

    public Users getUserById(int id) {
        return this.users.get(id);
    }

    public void removeUsersById(int id) {

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
    }

    public void createUser(Users user) {
        this.users.put(user.getId(),user);
    }
}