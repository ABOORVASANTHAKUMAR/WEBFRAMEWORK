package com.examly.springapp.serviceabu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.modelabu.Doorabu;
import com.examly.springapp.repositoryabu.DoorRepoabu;

@Service
public class DoorServiceabu {
    @Autowired
    private DoorRepoabu doorRepo;

    public Doorabu postData(Doorabu door) {
        return doorRepo.save(door);
    }

    public List<Doorabu> getBycolor(String color) {
        return doorRepo.findByColor(color);
    }

    public Doorabu updateDetail(int doorid, Doorabu door) {
        return doorRepo.save(door);
    }

    public boolean deleteDoor(int doorid) {
        doorRepo.deleteById(doorid);
        return true;
    }

    public List<Doorabu> getByDoorType(String doortype) {
        return doorRepo.findByDoorType(doortype);
    }

    public List<Doorabu> getAllDetails() {

        return doorRepo.findAll();
    }

    public Doorabu getDetailsById(int doorid) {
        return doorRepo.findById(doorid).orElse(null);
    }

}