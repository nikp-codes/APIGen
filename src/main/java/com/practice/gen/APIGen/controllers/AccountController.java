package com.practice.gen.APIGen.controllers;

import com.practice.gen.APIGen.controller.AccountApi;
import com.practice.gen.APIGen.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nikhil
 * @since 2025-08-11 Created
 */

@RestController
public class AccountController implements AccountApi {

    @Override
    public ResponseEntity<Void> changePassword(ChangePasswordRequest changePasswordRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Success> loginUser(LoginUserRequest loginUserRequest) {
        return null;
    }

    @Override
    public ResponseEntity<RefreshToken200Response> refreshToken(RefreshTokenRequest refreshTokenRequest) {
        return null;
    }

    @Override
    public ResponseEntity<Success> registerUser(User user) {
        return null;
    }

    @Override
    public ResponseEntity<Void> resetPassword(ResetPasswordRequest resetPasswordRequest) {
        return null;
    }
}
