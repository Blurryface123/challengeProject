package com.andres.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Users {
    private UUID id;
    @NotBlank
    private String name;
    @NotBlank
    private int age;
    @NotBlank
    private String userName;
    @NotBlank
    private String email;
    @NotBlank
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


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id : ").append(this.id).append("\n");
        sb.append("name : ").append(this.name).append("\n");
        sb.append("Age : ").append(this.age).append("\n");
        sb.append("Username : ").append(this.userName).append("\n");
        sb.append("Email : ").append(this.email).append("\n");
        sb.append("Password : ").append(this.password).append("\n");
        return sb.toString();
    }

}
