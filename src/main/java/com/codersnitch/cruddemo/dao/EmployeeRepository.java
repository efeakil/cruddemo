package com.codersnitch.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codersnitch.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
    
}
