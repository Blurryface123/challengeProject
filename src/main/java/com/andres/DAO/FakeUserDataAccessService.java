package com.andres.DAO;

import com.andres.Entity.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDAO")
public class FakeUserDataAccessService implements UsersDAO {

    private static List<Users> DB = new ArrayList<>();

    @Override
    public int createUser(UUID id, Users user) {
        DB.add(new Users(id,user.getName(),user.getAge(),user.getUserName(),user.getEmail(),user.getPassword()));
        return 1;
    }

    @Override
    public List<Users> getAllUsers() {
        return DB;
    }

}
