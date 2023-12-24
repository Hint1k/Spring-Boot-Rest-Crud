package com.example.demo.dao;

import com.example.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.query.MutationQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

    private EntityManager entityManager;

    public EmployeeDaoImpl() {
    }

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {

        // using Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        Query query = session.createQuery("from Employee", Employee.class);
//        List<Employee> employees = query.getResultList();
//        return employees;

        // using Jakarta
        Query query = entityManager.createQuery(
                "from Employee");
        List<Employee> employees = query.getResultList();
        return employees;
    }

    @Override
    public Employee findById(Integer id) {

        // using Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        Employee employee = session.get(Employee.class, id);
//        return employee;

        // using Jakarta
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void save(Employee employee) {

        // using Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        if(employee.getId() == null) {
//            session.persist(employee);
//        } else {
//            session.merge(employee);
//        }

        // using Jakarta
        if (employee.getId() == null) {
            entityManager.persist(employee);
        } else {
            entityManager.merge(employee);
        }
    }

    @Override
    public void deleteById(Integer id) {

        // using Hibernate
//        Session session = entityManager.unwrap(Session.class);
//        MutationQuery query = session.createMutationQuery("delete from Employee where id=:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();

        // using Jakarta
        Query query = entityManager.createQuery(
                "DELETE FROM Employee where id = :employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}
