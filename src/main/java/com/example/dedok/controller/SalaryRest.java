package com.example.dedok.controller;

import com.example.dedok.DAO.SalaryRepo;
import com.example.dedok.entity.Salary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalaryRest {

    private final SalaryRepo salaryRepo;

    @Autowired
    public SalaryRest(SalaryRepo salaryRepo) {
        this.salaryRepo = salaryRepo;
    }

    @GetMapping("/all")
    public List<Salary> getAll() {
        return salaryRepo.findAll();
    }

    @GetMapping("/{id}")
    public Salary findById(@PathVariable Long id) {
        return salaryRepo.findById(id).get();
    }
}
