package org.souza.charles.activity06.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private String name;
    private BigDecimal salary;
    private LocalDate enterDate;
    private LocalDate exitDate;
    private Address address;
    private Department departament;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public LocalDate getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(LocalDate enterDate) {
        this.enterDate = enterDate;
    }

    public LocalDate getExitDate() {
        return exitDate;
    }

    public void setExitDate(LocalDate exitDate) {
        this.exitDate = exitDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Department getDepartament() {
        return departament;
    }

    public void setDepartament(Department departament) {
        this.departament = departament;
    }
}
