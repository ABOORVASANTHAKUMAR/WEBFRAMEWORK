package com.example.springapp.repositoryabu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.modelabu.Personabu;

public interface PersonRepoabu extends JpaRepository<Personabu, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<Personabu> findByAge(int age);
}
