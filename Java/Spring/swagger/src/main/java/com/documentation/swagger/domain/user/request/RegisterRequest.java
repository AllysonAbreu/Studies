package com.documentation.swagger.domain.user.request;

import com.documentation.swagger.domain.enums.UserRoles;

public record RegisterRequest(String email, String password, UserRoles role) {

}
