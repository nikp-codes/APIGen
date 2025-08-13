package com.practice.gen.APIGen.controllers;

import com.practice.gen.APIGen.controller.UsersApi;
import com.practice.gen.APIGen.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Nikhil
 * @since 2025-08-11 Created
 */
@RestController
public class UsersController implements UsersApi {

    @Override
    public ResponseEntity<User> createUser(User user) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUserById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<User>> getAllUsers() {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserById(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUserById(Integer id, User user) {
        return null;
    }
}
