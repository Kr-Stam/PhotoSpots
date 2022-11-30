package com.example.backend.repository;

import com.example.backend.model.Comment;
import com.example.backend.model.PhotoSpot;
import com.example.backend.model.User;

import java.util.List;

public class AppRepository {

    //Sega za sega samo za ova, ostanatite mozebi ponatamu
    public PhotoSpot getAllPhotoSpots(double latitude, double longitude){
        //TODO IMPLEMENT
        //return all
        return null;
    }
    //Ova se koristi, nema potreba za site useri
    public User getUserById(String id){
        //TODO IMPLEMENT
        return null;
    }

    public PhotoSpot getPhotoSpotsInArea(double latitude, double longitude){
        //TODO IMPLEMENT
        //get all photospots where lat, long +-1
        return null;
    }

    public PhotoSpot getTopPhotoSpots(double latitude, double longitude){
        //TODO IMPLEMENT
        //return top 100
        return null;
    }

    public List<PhotoSpot> getFavorites(User user){
        //TODO IMPLEMENT
        //get from db
        return null;
    }

    public List<PhotoSpot> getPhotoSpotsByUser(User user){
        //TODO IMPLEMENT
        return null;
    }

    //Ova stavi go, komentarite se baraat samo vo photospot detailed view
    public List<Comment> getCommentsForPhotoSpot(String photoSpotID){
        //TODO IMPLEMENT
        //get all comments where photospot_id
        return null;
    }
    //Ova stavi go
    public void addPhotoSpot(PhotoSpot spot, User user){
        //TODO IMPLEMENT
        //add to db
    }
    //Ova stavi go
    public void addComment(Comment comment, PhotoSpot photoSpot, User user){
        //TODO IMPLEMENT
        //add to db
    }
    //Ova stavi go
    public void upvoteDownvotePhotoSpot(){
        //TODO IMPLEMENT
        //update photospots to have +- vote
    }

    public void deleteComment(User user, Comment comment){
        //TODO IMPLEMENT
        //if the user is the same as the person who created the comment, delete it
        //maybe implement later
    }
    public void deletePhotoSpot(User user, Comment comment){
        //TODO IMPLEMENT
        //if the user is the same as the person who created the comment, delete it
        //maybe implement later
    }
}
