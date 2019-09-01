package com.andres.Controller;

import com.andres.Entity.Users;
import com.andres.Service.UsersService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping("/users")
public class usersController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public Collection<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public Users getUsersById(@PathVariable("id") int id) {
        return this.usersService.getUserById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void removeUsersById(@PathVariable("id") int id) {
        this.usersService.removeUsersById(id);
    }

    @PutMapping
    public void updateUser(@RequestBody Users user){
        usersService.updateUser(user);
    }

    @PostMapping
    public void createUser(@RequestBody Users user){
        usersService.createUser(user);
    }
}
