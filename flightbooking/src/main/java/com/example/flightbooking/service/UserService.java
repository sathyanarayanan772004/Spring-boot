package com.example.flightbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flightbooking.model.User;
import com.example.flightbooking.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public boolean updateUserDetails(int userId, User user) {
        if (!userRepository.existsById(userId)) {
            return false;
        }
        user.setUserId(userId);
        userRepository.save(user);
        return true;
    }

    public boolean deleteUser(int userId) {
        if (!userRepository.existsById(userId)) {
            return false;
        }
        userRepository.deleteById(userId);
        return true;
    }

    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }
}
