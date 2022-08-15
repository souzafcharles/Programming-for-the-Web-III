package org.souza.charles.activity08.service;

import org.souza.charles.activity08.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao dao;
    @Transactional(readOnly = false)
    @Override
    public void save(Employee official) {
        dao.save(employee);
    }
    @Transactional(readOnly = false)
    @Override
    public void update(Employee official) {
        dao.update(employee);
    }
    @Transactional(readOnly = false)
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
    @Override
    public Employee findById(Long id) {
        return dao.findById(id);
    }
    @Override
    public List<Employee> findAll() {
        return dao.findAll();
    }
}
