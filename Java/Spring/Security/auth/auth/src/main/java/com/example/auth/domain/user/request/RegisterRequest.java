package com.example.auth.domain.user.request;

import com.example.auth.domain.enums.UserRoles;

public record RegisterRequest(String email, String password, UserRoles role) {
}
