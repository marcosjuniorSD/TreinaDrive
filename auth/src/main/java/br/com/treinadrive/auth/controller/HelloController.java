package br.com.treinadrive.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/public/hello")
    public ResponseEntity<String> publicHello() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/private/hello")
    public ResponseEntity<String> privateHello() {
        return ResponseEntity.ok("Hello World");
    }

}
