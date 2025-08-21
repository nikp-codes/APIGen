package com.practice.gen.APIGen.controllers;

import com.practice.gen.APIGen.controller.AccountApi;
import com.practice.gen.APIGen.models.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nikhil
 * @since 2025-08-11 Created
 */

@RestController
public class AccountController implements AccountApi {

    @Override
    public ResponseEntity<Void> changePassword(ChangePasswordRequest changePasswordRequest, BindingResult errors, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<Success> loginUser(LoginUserRequest loginUserRequest, BindingResult errors, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<RefreshToken200Response> refreshToken(RefreshTokenRequest refreshTokenRequest, BindingResult errors, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<Success> registerUser(User user, BindingResult errors, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public ResponseEntity<Void> resetPassword(ResetPasswordRequest resetPasswordRequest, BindingResult errors, HttpServletRequest request, HttpServletResponse response) {
        return null;
    }
}
