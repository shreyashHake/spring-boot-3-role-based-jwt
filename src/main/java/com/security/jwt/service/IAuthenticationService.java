package com.security.jwt.service;

import com.security.jwt.model.Role;
import com.security.jwt.model.User;
import com.security.jwt.dto.JwtAuthenticationResponse;
import com.security.jwt.dto.LoginRequest;
import com.security.jwt.dto.RegisterRequest;

public interface IAuthenticationService {
    User register(RegisterRequest registerRequest);
    public JwtAuthenticationResponse login(LoginRequest loginRequest);
}
