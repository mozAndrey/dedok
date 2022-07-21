package com.example.dedok.DAO;

import com.example.dedok.entity.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepo extends JpaRepository<Salary, Long> {
}
