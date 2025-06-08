package br.com.treinadrive.auth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record User (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        String email,
        String password,
        String role
) { }
