package br.com.treinadrive.auth.dto;

record AuthRequest(
        String email,
        String password
) { }
