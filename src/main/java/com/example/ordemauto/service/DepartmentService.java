package com.example.ordemauto.service;

import com.example.ordemauto.model.Department;
import com.example.ordemauto.repository.DepartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;
    public List<Department> getDepartment() {
        return departmentRepository.findAll();
    }

    public Department saveDepartment(Department department) {
        departmentRepository.save(department);
        return department;
    }
}
