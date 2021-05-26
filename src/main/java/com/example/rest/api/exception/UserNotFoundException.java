package com.example.rest.api.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String id) {
        super("User not found with : " + id + " Try with valid ID.");
    }
}
