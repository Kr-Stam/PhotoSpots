package com.example.backend.bootstrap;

import com.example.backend.model.PhotoSpot;
import com.example.backend.model.User;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

public class DataHolder {

    public static List<PhotoSpot> spots = new ArrayList<>();
    public static List<User> users = new ArrayList<>();

    @PostConstruct
    public void init(){
        spots.add(new PhotoSpot("123", "TestSpot1", "url1", 12, 15, 8, 8));
        spots.add(new PhotoSpot("5125215", "TestSpot2", "url2", 12, 15, 8, 8));
        spots.add(new PhotoSpot("123123", "TestSpot3", "url3", 12, 15, 8, 8));

        users.add(new User("123", "email", "username1"));
        users.add(new User("123444", "emailll", "usssername1"));
    }
}
