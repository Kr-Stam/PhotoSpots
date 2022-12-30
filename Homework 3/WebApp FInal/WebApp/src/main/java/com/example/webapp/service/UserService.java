package com.example.webapp.service;

import com.example.webapp.exceptions.*;
import com.example.webapp.model.*;

public interface UserService {

    User register(String email, String username, String password) throws InvalidUsernameOrPasswordException, UsernameAlreadyExistsException;
    public User loadUserByUsername(String s) throws UsernameNotFoundException;
}
