package com.practice.gen.APIGen.controllers;

import com.practice.gen.APIGen.controller.UsersApi;
import com.practice.gen.APIGen.models.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Nikhil
 * @since 2025-08-11 Created
 */
@RestController
public class UsersController implements UsersApi {

    @Override
    public ResponseEntity<User> createUser(User user, BindingResult errors, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteUserById(Integer id, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<List<User>> getAllUsers(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<User> getUserById(Integer id, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateUserById(Integer id, User user, BindingResult errors, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
}
