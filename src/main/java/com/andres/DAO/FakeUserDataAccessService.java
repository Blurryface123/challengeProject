package com.andres.DAO;

import com.andres.Entity.Users;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @Override
    public Optional<Users> getUserById(UUID id) {
        return DB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteUsersById(UUID id) {
        Optional<Users> checkUserExist = getUserById(id);
        if(!checkUserExist.isPresent()){
            return 0;
        }
            DB.remove(checkUserExist.get());
        return 1;
    }

    @Override
    public int updateUserById(UUID id, Users updatedUser) {
        //We get the User with the id
       return  getUserById(id)
               //Here we create the variable userId to store the user
                .map(user ->{
                    //IndexOf will return the first index of the parameter given (will return 0 if correct or -1 if incorrect)
                    int indexOfPersonToUpdate = DB.indexOf(user);
                    System.out.println("index: "+ indexOfPersonToUpdate);
                    if(indexOfPersonToUpdate >= 0){
                        DB.set(indexOfPersonToUpdate, new Users(id, updatedUser.getName(),updatedUser.getAge(),
                                updatedUser.getUserName(),updatedUser.getEmail(),updatedUser.getPassword()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

}
