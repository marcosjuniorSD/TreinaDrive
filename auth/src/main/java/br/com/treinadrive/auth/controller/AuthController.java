package br.com.treinadrive.auth.controller;

import br.com.treinadrive.auth.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/auth")
public class AuthController {


    @PostMapping
    public User auth() {
        return null;
    }
}
