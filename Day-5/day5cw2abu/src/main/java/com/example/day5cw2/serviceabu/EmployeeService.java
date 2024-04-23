package com.example.day5cw2.serviceabu;

import org.springframework.stereotype.Service;

import com.example.day5cw2.modelabu.Employeeabu;
import com.example.day5cw2.repositoryabu.EmployeeRepoabu;

@Service
public class EmployeeService {
    public EmployeeRepoabu employeeRepo;
    public EmployeeService(EmployeeRepoabu employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(Employeeabu employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,Employeeabu employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public Employeeabu getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
