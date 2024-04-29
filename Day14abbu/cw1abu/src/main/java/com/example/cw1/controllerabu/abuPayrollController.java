package com.example.cw1.controllerabu;

import com.example.cw1.model.abubPayroll;
import com.example.cw1.service.abuPayrollService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee/{employeeId}/payroll")
public class abuPayrollController {
    private final abuPayrollService payrollService;

    public abuPayrollController(abuPayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping
    public ResponseEntity<abubPayroll> createPayrollForEmployee(@PathVariable Long employeeId, @RequestBody abubPayroll payroll) {
        abubPayroll createdPayroll = payrollService.createPayroll(payroll);
        if (createdPayroll != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdPayroll);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping
    public ResponseEntity<abubPayroll> getPayrollForEmployee(@PathVariable Long employeeId) {
        abubPayroll payroll = payrollService.getPayrollByEmployeeId(employeeId);
        if (payroll != null) {
            return ResponseEntity.ok(payroll);
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
