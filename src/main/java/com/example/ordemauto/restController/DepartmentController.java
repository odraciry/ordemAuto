package com.example.ordemauto.restController;

import com.example.ordemauto.model.Department;
import com.example.ordemauto.repository.DepartmentRepository;
import com.example.ordemauto.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
@RequiredArgsConstructor
public class DepartmentController {
    private final DepartmentService departmentService;

    @PostMapping
    public Department addDepartment(@RequestBody Department department){
        System.out.println("TO AQUI NO METODO POST DO DEPARTMENT E ISSO É OQ VEIO NO BODY: "+ department);
        departmentService.saveDepartment(department);
        return department;
    }

    @GetMapping
    public List<Department> getAllDepartments(){
//        List<Department> departments = new ArrayList<>();
        return departmentService.getDepartment();
    }
    @GetMapping
    @RequestMapping("/{id}")
    public Optional<Department> getDepartment(@PathVariable("id") Integer id){
//        List<Department> departments = new ArrayList<>();
        return departmentService.getDepartmentByID(id);
    }
}
