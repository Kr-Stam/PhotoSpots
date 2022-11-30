package com.example.backend.model;

import lombok.Data;

import java.util.List;

@Data
public class PhotoSpot {

    private String id;
    private String name;
    private String image;
    private double longitude;
    private double latitude;
    private int downvotes;
    private int upvotes;

//    private List<String> comments;

    public PhotoSpot(String id, String name, String image, double longitude, double latitude, int downvotes, int upvotes) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.longitude = longitude;
        this.latitude = latitude;
        this.downvotes = downvotes;
        this.upvotes = upvotes;
    }
}
