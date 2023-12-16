package com.doer.splitwiser.controller;


import com.doer.splitwiser.models.User;
import com.doer.splitwiser.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Create (POST) a user
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User savedUser = userService.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    // Read (GET) a user by id
    @GetMapping("/{id}")
    public ResponseEntity<User> findUser(@PathVariable Integer id) {
        Optional<User> foundUser = userService.findUser(id);
        return foundUser.map(user -> ResponseEntity.ok().body(user)).orElse(ResponseEntity.notFound().build());
    }

    // Read (GET) all users
    @GetMapping
    public ResponseEntity<List<User>> findAllUsers(){
        List<User> users = userService.findAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    // Update (PUT) a user
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    // Delete (DELETE) a user
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}