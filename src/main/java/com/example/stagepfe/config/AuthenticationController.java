package com.example.stagepfe.config;

import lombok.RequiredArgsConstructor;

import net.bytebuddy.asm.Advice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AutheticationResponse> register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AutheticationResponse> authticate(
            @RequestBody AuthticationRequest request
    ){
        return ResponseEntity.ok(service.authenticate(request));

    }

}
