package org.souza.charles.activity08.service;


import org.souza.charles.activity08.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentService dao;
    @Transactional(readOnly = false)
    @Override
    public void save(Department department) {
        dao.save(department);
    }
    @Transactional(readOnly = false)
    @Override
    public void update(Department department) {
        dao.update(department);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
    @Transactional(readOnly = true)

    @Override
    public Department findById(Long id) {
        return dao.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Department> findAll() {
        return dao.findAll(); }

    @Override
    public boolean departmentHasEmployee(Long id) {
        if(findById(id).getEmployees().isEmpty()){
            return false;
        }
        return true;
    }
}
