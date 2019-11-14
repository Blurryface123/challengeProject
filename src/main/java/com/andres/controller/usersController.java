package com.andres.controller;

import com.andres.entity.Users;
import com.andres.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/users")
public class usersController {


    private final UsersService usersService;

    @Autowired
    public usersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @PostMapping
    public void createUser(@Valid @NonNull @RequestBody Users user) {
        usersService.createUser(user);
    }

    @GetMapping
    public List<Users> getAllUsers() {
        return usersService.getAllUsers();
    }

    @GetMapping(path = "/{id}")
    public Users getUserById(@PathVariable("id") UUID id){
        return usersService.getUserById(id)
                .orElse(null);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(path = "/delete/{id}")
    public void deleteUserById(@PathVariable("id") UUID id){
        if(!HttpStatus.values().equals(200)){
            System.out.println("THE USER DOES NOT EXIST");
        }
        usersService.deleteUser(id);
    }

    @PutMapping(path = "/{id}")
    public void updateUserById(@PathVariable("id") UUID id,@Valid @NonNull @RequestBody Users updatedUser){
        usersService.updateUser(id,updatedUser);
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
