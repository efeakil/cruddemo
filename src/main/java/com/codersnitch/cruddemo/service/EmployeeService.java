package com.codersnitch.cruddemo.service;

import java.util.List;

import com.codersnitch.cruddemo.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee theEmployee);

    void deleteById(int id);
    
}