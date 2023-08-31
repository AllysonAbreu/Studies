package com.example.auth.domain.user.response;

import lombok.Builder;

@Builder
public record LoginResponse(String token) {
}
