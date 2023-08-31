package com.example.auth.services.users;

import com.example.auth.domain.user.User;
import com.example.auth.domain.user.request.LoginRequest;
import com.example.auth.domain.user.request.RegisterRequest;
import com.example.auth.domain.user.response.LoginResponse;
import com.example.auth.infra.security.TokenService;
import com.example.auth.mappers.UsersMapper;
import com.example.auth.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import static com.example.auth.mappers.UsersMapper.toDomain;

@Service
public class UsersService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    public LoginResponse login(LoginRequest request) {
        try {
            var usernamePassword = new UsernamePasswordAuthenticationToken(request.email(), request.password());
            var auth = this.authenticationManager.authenticate(usernamePassword);
            var token = tokenService.generateToken((User) auth.getPrincipal());

            return UsersMapper.toResponse(token);
        }catch (Exception e) {
            throw new RuntimeException("User not found");
        }
    }

    public void register(RegisterRequest request) {
        try {
            if(repository.findByEmail(request.email()) != null) {
                throw new RuntimeException("User already exists");
            }
            String encryptedPassword = new BCryptPasswordEncoder().encode(request.password());
            repository.save(toDomain(request, encryptedPassword));
        } catch (Exception e) {
            throw new RuntimeException("User not created");
        }
    }
}
