package com.codersnitch.cruddemo.dao;

import java.util.List;

import com.codersnitch.cruddemo.entity.Employee;

public interface EmployeeDAO {
    List<Employee> findAll();
}
