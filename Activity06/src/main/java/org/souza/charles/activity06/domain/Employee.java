package org.souza.charles.activity06.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false, columnDefinition = "DECIMAL(7,2) DEFAULT 0.00")
    private BigDecimal salary;
    @Column(name="denter_date",nullable = false, columnDefinition = "DATE")
    private LocalDate enterDate;
    @Column(name = "exit_date",columnDefinition = "DATE")
    private LocalDate exitDate;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id_fk")
    private Address address;
    @ManyToOne
    @JoinColumn(name = "departament_id_fk")
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
