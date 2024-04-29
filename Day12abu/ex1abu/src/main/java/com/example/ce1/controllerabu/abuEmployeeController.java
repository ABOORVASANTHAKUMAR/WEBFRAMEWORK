package com.example.ce1.controllerabu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.modelabu.abuEmployee;
import com.example.ce1.serviceabu.abuEmployeeService;

@RestController
public class abuEmployeeController {
    @Autowired
    abuEmployeeService employeeService;

    @PostMapping("/employee")
    public abuEmployee setMethod(@RequestBody abuEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<abuEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<abuEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
