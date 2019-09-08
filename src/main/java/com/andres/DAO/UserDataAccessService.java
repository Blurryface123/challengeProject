package com.andres.DAO;

import com.andres.Entity.Users;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository("postgres")
public class UserDataAccessService implements UsersDAO {
    @Override
    public int createUser(UUID id, Users user) {
        return 0;
    }

    @Override
    public List<Users> getAllUsers() {
        //REPLACE THIS VALUES WITH RESULTSETS FROM DB
        UUID id = null;
        String name= null;
        int age= 0;
        String userName= null;
        String email= null;
        String password= null;
        return List.of(new Users(UUID.randomUUID(),name,age,userName,email,password));
    }

    @Override
    public Optional<Users> getUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUsersById(UUID id) {
        return 0;
    }

    @Override
    public int updateUserById(UUID id, Users user) {
        return 0;
    }
}
