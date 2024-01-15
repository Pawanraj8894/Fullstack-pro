package com.fullstack.fullstackbackend.exception;
/* Created by Pawan Rajpoot */

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Could not found the user with id " + id);
    }
}
