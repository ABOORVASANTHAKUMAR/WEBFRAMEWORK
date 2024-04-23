package com.example.bidirection.repositoryabu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.modelabu.Studenabut;



@Repository
public interface StudentRepository extends JpaRepository<Studenabut,Integer>{
    
}
