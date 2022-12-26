package com.example.webapp.exceptions;

public class InvalidUserCredentialsException extends Exception{
    public InvalidUserCredentialsException() {
        super("Invalid user credentials exception");
    }
}
