package org.souza.charles.activity08.service;

import org.souza.charles.activity08.domain.Department;

import java.util.List;

public interface DepartmentService {
    void save(Department department);
    void update(Department department);
    void delete(Long id);
    Department findById(Long id);
    List<Department> findAll();
    boolean departmentHasEmployee(Long id);
}
