package com.example.webapp.service;

import com.example.webapp.exceptions.*;
import com.example.webapp.exceptions.*;
import com.example.webapp.model.*;

public interface AuthService {
    User login(String username, String password) throws InvalidArgumentsException, InvalidUserCredentialsException;
}
