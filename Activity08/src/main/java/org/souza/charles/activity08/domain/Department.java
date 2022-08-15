package org.souza.charles.activity08.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department extends AbstractEntities<Long>{

    @Column(name = "name", nullable = false, unique = true, length = 60)
    private String name;

   // @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
