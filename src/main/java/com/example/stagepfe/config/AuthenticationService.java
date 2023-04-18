package com.example.stagepfe.config;

import com.example.stagepfe.Repository.EmployeeRepository;
import com.example.stagepfe.models.Employee;
import com.example.stagepfe.models.enumration.enumrationrole;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final EmployeeRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AutheticationResponse register(RegisterRequest request) {
        var user = Employee.builder()
                .firstName(request.getFirstName())
                .LastName(request.getLirstName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .enumrationrole(enumrationrole.User)
                .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AutheticationResponse.builder()
                .token(jwtToken)
                .build();

    }

    public AutheticationResponse authenticate(AuthticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = repository.findByemail((request.getEmail()))
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AutheticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
