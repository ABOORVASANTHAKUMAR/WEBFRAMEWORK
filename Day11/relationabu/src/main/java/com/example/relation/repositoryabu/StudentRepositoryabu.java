package com.example.relation.repositoryabu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.modelabu.Studentabu;

@Repository
public interface StudentRepositoryabu extends JpaRepository<Studentabu,Integer>{
    
}
