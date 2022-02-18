package com.microservice.department.departmentservice.controller;

import com.microservice.department.departmentservice.entity.Department;
import com.microservice.department.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department save(@RequestBody Department department){
        log.info("saving department"+department.toString());
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable("id") Long departmentId){
        log.info("Get Department for id="+departmentId);
        return departmentService.getById(departmentId);
    }

}
