package com.example.day5cw1.repositoryabu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.modelabu.Productabu;

@Repository
public interface ProductRepoabu extends JpaRepository<Productabu,Integer>{
    
}
