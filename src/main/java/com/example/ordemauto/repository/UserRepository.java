package com.example.ordemauto.repository;

import com.example.ordemauto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {}
