package com.codersnitch.cruddemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codersnitch.cruddemo.dao.EmployeeDAO;
import com.codersnitch.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {

        return employeeDAO.findAll();
    }

}
