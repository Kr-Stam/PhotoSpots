package com.example.webapp.exceptions;

public class InvalidUsernameOrPasswordException extends Exception{
    public InvalidUsernameOrPasswordException() {
        super("Invalid username or password");
    }
}
