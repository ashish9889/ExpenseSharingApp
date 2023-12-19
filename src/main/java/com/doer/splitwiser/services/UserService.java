package com.doer.splitwiser.services;

import com.doer.splitwiser.models.User;
import com.doer.splitwiser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        //TODO implement this
        return null;
    }

    public Optional<User> findUser(Integer id) {
        return Optional.empty();
    }

    public List<User> findAllUsers() {
        return null;
    }

    public User updateUser(Integer id, User user) {
        return null;
    }

    public void deleteUser(Integer id) {

    }
}