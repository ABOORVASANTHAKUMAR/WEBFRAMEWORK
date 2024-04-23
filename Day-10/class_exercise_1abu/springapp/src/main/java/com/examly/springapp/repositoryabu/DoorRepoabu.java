package com.examly.springapp.repositoryabu;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examly.springapp.modelabu.Doorabu;

// import jakarta.transaction.Transactiona

@Repository
public interface DoorRepoabu extends JpaRepository<Doorabu, Integer> {

    @Query(value = "DELETE FROM Door WHERE Door_id = ?1", nativeQuery = true)
    void deleteDoor(int DoorId);

    public List<Doorabu> findByColor(String color);

    public List<Doorabu> findByDoorType(String doortype);
}
