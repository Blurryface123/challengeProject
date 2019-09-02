package com.andres.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Users {
    private UUID id;
    private String name;
    private int age;
    private String userName;
    private String email;
    private String password;

    public Users(@JsonProperty("id") UUID id, @JsonProperty("name") String name,
                 @JsonProperty("age") int age, @JsonProperty("username") String userName,
                 @JsonProperty("email") String email, @JsonProperty("password") String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public Users(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
