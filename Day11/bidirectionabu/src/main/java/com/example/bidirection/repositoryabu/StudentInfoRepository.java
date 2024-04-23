package com.example.bidirection.repositoryabu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.modelabu.StudentInfoabu;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfoabu,Integer>{
    
}