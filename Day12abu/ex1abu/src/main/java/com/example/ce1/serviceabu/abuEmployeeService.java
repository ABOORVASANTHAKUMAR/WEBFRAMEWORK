package com.example.ce1.serviceabu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.modelabu.abuEmployee;
import com.example.ce1.repositoryabu.abuEmployeeRepo;

@Service
public class abuEmployeeService {
    @Autowired
    abuEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public abuEmployee setEmployee(abuEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<abuEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<abuEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}
