package com.example.ordemauto.restController;

import com.example.ordemauto.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    @GetMapping
    public String listAllUsers() {
        return "List all users";
    }

    @PostMapping
    public String createUser(User user) {
        return "Create user";
    }

}
