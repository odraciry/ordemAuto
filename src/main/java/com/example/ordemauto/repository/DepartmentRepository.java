package com.example.ordemauto.repository;

import com.example.ordemauto.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {}
