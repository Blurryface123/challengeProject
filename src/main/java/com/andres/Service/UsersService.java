package com.andres.Service;
import com.andres.DAO.UsersDAO;
import com.andres.Entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;


@Service
public class UsersService {

    @Autowired
    private UsersDAO usersDAO;

    public Collection<Users> getAllUsers(){
        return usersDAO.getAllUsers();
    }

    public Users getStudentById(int id){
        return this.usersDAO.getStudentById(id);
    }
}
