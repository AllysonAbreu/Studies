package com.documentation.swagger.controllers;

import com.documentation.swagger.domain.user.request.LoginRequest;
import com.documentation.swagger.domain.user.request.RegisterRequest;
import com.documentation.swagger.domain.user.response.LoginResponse;
import com.documentation.swagger.services.users.UsersServices;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private UsersServices service;

    @Operation(summary = "Login", description = "Login", tags = {"auth"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = LoginResponse.class))) })
    @RequestMapping(value = "/login",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody @Valid LoginRequest request) {
        return ResponseEntity.ok(service.login(request));
    }

    @Operation(summary = "Register", description = "Register", tags = {"auth"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "successful operation",
                content = @Content(mediaType = "aplication/json", schema = @Schema(implementation = ResponseEntity.class))) })
    @RequestMapping(value = "/register",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterRequest request) {
        service.register(request);
        return ResponseEntity.ok().build();
    }
}
