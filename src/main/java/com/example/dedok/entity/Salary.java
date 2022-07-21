package com.example.dedok.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Salary {
    @Id
    Long id;
    Long salary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
