package com.example.ordemauto.service;

import com.example.ordemauto.model.User;
import com.example.ordemauto.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    public User saveUser(User user) {
        userRepository.save(user);
        return user;
    }

}
