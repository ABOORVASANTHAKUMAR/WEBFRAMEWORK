package com.example.cw1.service;

import com.example.cw1.model.abuEmployee;
import com.example.cw1.repository.abuEmployeeRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class abuEmployeeService {
    private final abuEmployeeRepo employeeRepo;

    public abuEmployeeService(abuEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public abuEmployee createEmployee(abuEmployee employee) {
        return employeeRepo.save(employee);
    }

    public List<abuEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<abuEmployee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }
}
