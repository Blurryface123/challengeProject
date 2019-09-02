package com.andres.Controller;

import com.andres.Entity.Users;
import com.andres.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;


@RestController
@RequestMapping("/users")
public class usersController {


    private final UsersService usersService;

    @Autowired
    public usersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping
    public void createUser(@RequestBody Users user) {
        usersService.createUser(user);
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }
/*
    @GetMapping(value = "/{id}")
    public Users getUsersById(@PathVariable("id") int id) {
        return this.usersService.getUserById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void removeUsersById(@PathVariable("id") int id) {
        this.usersService.removeUsersById(id);
    }

    @PutMapping
    public void updateUser(@RequestBody Users user) {
        usersService.updateUser(user);
    }
*/

}
