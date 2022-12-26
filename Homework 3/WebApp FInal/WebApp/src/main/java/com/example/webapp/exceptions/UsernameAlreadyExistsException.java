package com.example.webapp.exceptions;

public class UsernameAlreadyExistsException extends Exception{
    public UsernameAlreadyExistsException(String username) {
        super(String.format("Username %s already exists", username));
    }
}
