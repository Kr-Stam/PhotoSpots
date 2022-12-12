package com.example.backend.model;


import com.example.backend.util.Utils;
import lombok.Data;

@Data
public class User {

    private long id;
    private String email;
    private String username;
    private String password;
//    private List<Location> spots;


    public User(long id, String email, String username, String password) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }
    public User(String email, String username, String password) {
        this.id = Utils.UserId++;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    //Getters

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
