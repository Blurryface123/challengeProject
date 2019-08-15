package com.andres.Controller;

import com.andres.Entity.Users;
import com.andres.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/users")
public class usersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Users getUsersById(@PathVariable("id") int id){
        return this.usersService.getUserById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void removeUsersById(@PathVariable("id") int id){
        this.usersService.removeUsersById(id);
    }
}
