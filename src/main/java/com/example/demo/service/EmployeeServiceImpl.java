package com.example.demo.service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

// code without spring-starter-data-rest dependency:

//@Service
public class EmployeeServiceImpl implements EmployeeService {

    //using JPARepository:

//    private EmployeeRepository employeeRepository;
//
//    public EmployeeServiceImpl() {
//    }
//
//    @Autowired
//    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
//        this.employeeRepository = employeeRepository;
//    }
//
//    @Override
//    public List<Employee> findAll() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee findById(Integer id) {
//        Employee employee = null;
//        Optional<Employee> result = employeeRepository.findById(id);
//        if (result.isPresent()) {
//            employee = result.get();
//        } else {
//            throw new RuntimeException("Employee with id = " + id + " not found");
//        }
//        return employee;
//    }
//
//    @Override
//    public void save(Employee employee) {
//        employeeRepository.save(employee);
//    }
//
//    @Override
//    public void deleteById(Integer id) {
//        employeeRepository.deleteById(id);
//    }

    //using Hibernate and Jakarta persistence:

//    private EmployeeDAO employeeDAO;

//    @Autowired
//    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
//        this.employeeDAO = employeeDAO;
//    }
//
//    @Override
//    @Transactional
//    public List<Employee> findAll() {
//        return employeeDAO.findAll();
//    }
//
//    @Override
//    @Transactional
//    public Employee findById(Integer id) {
//        return employeeDAO.findById(id);
//    }
//
//    @Override
//    @Transactional
//    public void save(Employee employee) {
//        employeeDAO.save(employee);
//    }
//
//    @Override
//    @Transactional
//    public void deleteById(Integer id) {
//        employeeDAO.deleteById(id);
//    }
}
