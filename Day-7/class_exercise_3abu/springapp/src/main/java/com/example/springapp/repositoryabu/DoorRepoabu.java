package com.example.springapp.repositoryabu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.modelabu.Doorabu;

import java.util.List;

@Repository
public interface DoorRepoabu extends JpaRepository<Doorabu,Integer>{

    List<Doorabu> findByDoorId(int doorId);
    List<Doorabu> findByAccessType(String accessType);
    
}
