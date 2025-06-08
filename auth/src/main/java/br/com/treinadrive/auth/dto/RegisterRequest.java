package br.com.treinadrive.auth.dto;

record RegisterRequest(
        String email,
        String password,
        String role
) { }
