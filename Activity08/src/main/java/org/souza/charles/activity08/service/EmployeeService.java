package org.souza.charles.activity08.service;

import org.souza.charles.activity08.domain.Employee;

import java.util.List;

public interface EmployeeService {

    void save(Employee employee);
    void update(Employee official);
    void delete(Long id);
    Employee findById(Long id);
    List<Employee> findAll();

}
