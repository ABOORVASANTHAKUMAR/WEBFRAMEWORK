package com.example.relation.repositoryabu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.modelabu.StudentInfoabu;

@Repository
public interface StudentInfoRepositoryabu extends JpaRepository<StudentInfoabu,Integer>{
    
}