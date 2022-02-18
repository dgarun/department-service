package com.microservice.department.departmentservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="cust_dept")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;


}
