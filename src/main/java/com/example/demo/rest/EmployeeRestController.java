package com.example.demo.rest;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// code without spring-starter-data-rest dependency:

//@RestController
//@RequestMapping("/api")
public class EmployeeRestController {

//    private EmployeeService employeeService;
//
//    public EmployeeRestController() {
//    }
//
//    @Autowired
//    public EmployeeRestController(EmployeeService employeeService) {
//        this.employeeService = employeeService;
//    }
//
//    @GetMapping("/employees")
//    public List<Employee> findAll() {
//        return employeeService.findAll();
//    }
//
//    @GetMapping("/employees/{id}")
//    public Employee getEmployee(@PathVariable Integer id) {
//        Employee employee = employeeService.findById(id);
//        if (employee == null) {
//            throw new RuntimeException("Employee with id = " + id + " not found");
//        }
//        return employee;
//    }
//
//    @PostMapping("/employees")
//    public Employee addEmployee(@RequestBody Employee employee) {
//        employee.setId(null);
//        employeeService.save(employee);
//        return employee;
//    }
//
//    @PutMapping("/employees")
//    public Employee updateEmployee(@RequestBody Employee employee) {
//        employeeService.save(employee);
//        return employee;
//    }
//
//    @DeleteMapping("/employees/{id}")
//    public String deleteEmployee(@PathVariable Integer id) {
//        Employee employee = employeeService.findById(id);
//        if (employee == null) {
//            throw new RuntimeException("Employee with id = " + id + " not found");
//        }
//        employeeService.deleteById(id);
//        return "Employee with id = " + id + " has been deleted!";
//    }
}
