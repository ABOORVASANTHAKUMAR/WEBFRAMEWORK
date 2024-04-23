package com.example.springapp.repositoryabu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.modelabu.Personabu;

import java.util.List;


@Repository
public interface PersonRepoabu extends JpaRepository<Personabu,Integer>{

    List<Personabu> findByNameStartingWith(String name);
    List<Personabu> findByNameEndingWith(String name);
    
}
