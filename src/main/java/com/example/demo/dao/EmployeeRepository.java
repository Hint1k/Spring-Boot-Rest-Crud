package com.example.demo.dao;

import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members") // changing path to http://localhost:8080/api/members
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
