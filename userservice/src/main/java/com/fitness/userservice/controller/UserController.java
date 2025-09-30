package com.fitness.userservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{userId}")
    public ResponseEntity<> getUserProfile() {
        return "";
    }

    @GetMapping("/register")
    public ResponseEntity<> register() {
        return "";
    }

}
