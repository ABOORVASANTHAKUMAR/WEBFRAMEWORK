package com.example.cw1.service;

import com.example.cw1.model.abubPayroll;
import com.example.cw1.repository.abuPayrollRepo;
import org.springframework.stereotype.Service;

@Service
public class abuPayrollService {
    private final abuPayrollRepo payrollRepo;

    public abuPayrollService(abuPayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public abubPayroll createPayroll(abubPayroll payroll) {
        return payrollRepo.save(payroll);
    }

    public abubPayroll getPayrollByEmployeeId(Long employeeId) {
        return payrollRepo.findById(employeeId).orElse(null);
    }
}
