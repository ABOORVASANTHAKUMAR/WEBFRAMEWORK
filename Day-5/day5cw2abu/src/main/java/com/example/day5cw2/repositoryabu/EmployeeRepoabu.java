package com.example.day5cw2.repositoryabu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.modelabu.Employeeabu;


@Repository
public interface EmployeeRepoabu extends JpaRepository<Employeeabu,Integer>{
    
}
