package com.microservice.department.departmentservice.service;

import com.microservice.department.departmentservice.entity.Department;
import com.microservice.department.departmentservice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department){
        return departmentRepository.save(department);
    }
}
