package com.andres.DAO;

import com.andres.Entity.Users;
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
}