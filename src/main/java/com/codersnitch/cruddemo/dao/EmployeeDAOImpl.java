package com.codersnitch.cruddemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.codersnitch.cruddemo.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    // entity manager
    private EntityManager entityManager;

    // constructor injection
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        // crate query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();
        // return the results
        return employees;
    }

}
