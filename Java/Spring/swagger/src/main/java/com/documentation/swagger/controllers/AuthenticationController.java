package com.documentation.swagger.controllers;

import com.documentation.swagger.domain.user.request.LoginRequest;
import com.documentation.swagger.domain.user.request.RegisterRequest;
import com.documentation.swagger.domain.user.response.LoginResponse;
import com.documentation.swagger.services.users.UsersServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private UsersServices service;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody @Valid LoginRequest request) {
        return ResponseEntity.ok(service.login(request));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterRequest request) {
        service.register(request);
        return ResponseEntity.ok().build();
    }
}
