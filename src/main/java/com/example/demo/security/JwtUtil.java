package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    private final String secret;
    private final long expirationMs;

   
    public JwtUtil(String secret, long expirationMs) {
        this.secret = secret;
        this.expirationMs = expirationMs;
    }

    
    public JwtUtil() {
        this.secret = "test-secret";
        this.expirationMs = 3600000;
    }

    
    public String generateToken(Long userId, String email, String role) {
        return userId + "|" + email + "|" + role;
    }

    public String extractEmail(String token) {
        try {
            return token.split("\\|")[1];
        } catch (Exception e) {
            return null;
        }
    }

    public String extractRole(String token) {
        try {
            return token.split("\\|")[2];
        } catch (Exception e) {
            return null;
        }
    }

    public Long extractUserId(String token) {
        try {
            return Long.parseLong(token.split("\\|")[0]);
        } catch (Exception e) {
            return null;
        }
    }

    public boolean validateToken(String token) {
        try {
            String[] parts = token.split("\\|");
            return parts.length == 3;
        } catch (Exception e) {
            return false;
        }
    }
}
