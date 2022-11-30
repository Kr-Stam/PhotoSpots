package com.example.backend.model;

import lombok.Data;

@Data
public class Comments {

    private User user;
    private PhotoSpot photoSpot;

    public Comments(User user, PhotoSpot photoSpot) {
        this.user = user;
        this.photoSpot = photoSpot;
    }

}
