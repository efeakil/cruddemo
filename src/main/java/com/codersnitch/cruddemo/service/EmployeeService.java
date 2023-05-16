package com.codersnitch.cruddemo.service;

import java.util.List;

import com.codersnitch.cruddemo.entity.Employee;

/**
 * EmployeeService
 */
public interface EmployeeService {

    List<Employee> findAll();
    
}