package com.example.backend.model;


import lombok.Data;

@Data
public class User {

    private String id;
    private String email;
    private String username;
//    private List<PhotoSpot> spots;


    public User(String id, String email, String username) {
        this.id = id;
        this.email = email;
        this.username = username;
    }
}
