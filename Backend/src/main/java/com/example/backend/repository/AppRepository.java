package com.example.backend.repository;

import com.example.backend.model.Comment;
import com.example.backend.model.PhotoSpot;
import com.example.backend.model.User;

import java.util.List;

public class AppRepository {

    public User getUserById(String id){
        //TODO IMPLEMENT
        return null;
    }

    public PhotoSpot getPhotoSpotsInArea(double latitude, double longitude){
        //TODO IMPLEMENT
        //get all photospots where lat, long +-1
        return null;
    }

    //komentarite se baraat samo vo photospot detailed view
    public List<Comment> getCommentsForPhotoSpot(String photoSpotID){
        //TODO IMPLEMENT
        //get all comments where photospot_id
        return null;
    }


}
