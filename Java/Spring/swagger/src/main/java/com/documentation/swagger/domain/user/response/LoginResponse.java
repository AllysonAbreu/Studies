package com.documentation.swagger.domain.user.response;

import lombok.Builder;

@Builder
public record LoginResponse(String token) {

}
