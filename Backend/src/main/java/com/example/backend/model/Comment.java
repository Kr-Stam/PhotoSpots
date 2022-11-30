package com.example.backend.model;

import lombok.Data;

@Data
public class Comment {

    private User user;
    private PhotoSpot photoSpot;

    public Comment(User user, PhotoSpot photoSpot) {
        this.user = user;
        this.photoSpot = photoSpot;
    }

}
