package com.example.backend.model;

import lombok.Data;

@Data
public class Comment {

    private User user;
    private Location location;

    public Comment(User user, Location location) {
        this.user = user;
        this.location = location;
    }

}
