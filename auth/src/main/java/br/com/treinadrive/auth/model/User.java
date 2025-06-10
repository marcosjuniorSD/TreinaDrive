package br.com.treinadrive.auth.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public record User (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        String email,
        String password,
        String role
) { }
