package com.documentation.swagger.mappers;

import com.documentation.swagger.domain.user.User;
import com.documentation.swagger.domain.user.request.RegisterRequest;
import com.documentation.swagger.domain.user.response.LoginResponse;

import java.sql.Timestamp;

public class UsersMapper {
    public static User toDomain(RegisterRequest request, String encryptedPassword) {
        return User.builder()
                .email(request.email())
                .password(encryptedPassword)
                .role(request.role())
                .isActive(true)
                .createdAt(Timestamp.from(java.time.Instant.now()))
                .build();
    }

    public static LoginResponse toResponse(String token) {
        return LoginResponse.builder()
                .token(token)
                .build();
    }
}
