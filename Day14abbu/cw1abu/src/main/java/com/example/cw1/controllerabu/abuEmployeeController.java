package com.example.cw1.controllerabu;

import com.example.cw1.model.abuEmployee;
import com.example.cw1.service.abuEmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class abuEmployeeController {
    private final abuEmployeeService employeeService;

    public abuEmployeeController(abuEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<abuEmployee> createEmployee(@RequestBody abuEmployee employee) {
        abuEmployee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @GetMapping
    public ResponseEntity<List<abuEmployee>> getAllEmployees() {
        List<abuEmployee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<abuEmployee> getEmployeeById(@PathVariable Long employeeId) {
        Optional<abuEmployee> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

