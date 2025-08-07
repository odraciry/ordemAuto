package com.example.ordemauto.restController;

import com.example.ordemauto.model.Department;
import com.example.ordemauto.model.User;
import com.example.ordemauto.service.UserService;
import lombok.RequiredArgsConstructor;
import org.hibernate.Internal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> listAllUsers() {
        return userService.getUsers();
    }

    @RequestMapping("/id")
    @GetMapping
    public Optional<User> getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }


    @PostMapping
    public User createUser(@RequestBody User user) {
        userService.saveUser(user);
        return user;
    }

}
