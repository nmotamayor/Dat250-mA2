package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.PollManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private PollManager pollManager;

    // Get all users
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = pollManager.getAllUsers();  // Directly get List<User> from pollManager
        return ResponseEntity.ok(users);
    }

    // Create a new user
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        pollManager.createUser(user);  // Changed from addUser to createUser
        return ResponseEntity.status(201).body(user);
    }

    // Get a user by their ID
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable String id) {
        User user = pollManager.getUserById(id);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
