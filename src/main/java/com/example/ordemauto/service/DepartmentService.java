package com.example.ordemauto.service;

import com.example.ordemauto.model.Department;
import com.example.ordemauto.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    public List<Department> getDepartment() {
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentByID(Integer id) {
        return departmentRepository.findById(id);
    }

    public Department saveDepartment(Department department) {
        departmentRepository.save(department);
        return department;
    }
}
