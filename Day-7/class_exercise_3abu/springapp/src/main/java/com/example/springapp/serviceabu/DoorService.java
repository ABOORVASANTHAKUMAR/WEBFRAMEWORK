package com.example.springapp.serviceabu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.modelabu.Doorabu;
import com.example.springapp.repositoryabu.DoorRepoabu;

@Service
public class DoorService {
    @Autowired
    private DoorRepoabu rep;

    public boolean post(Doorabu door)
    {
        try
        {
            rep.save(door);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Doorabu> getAll()
    {
        return rep.findAll();
    }

    public List<Doorabu> getbyDoorId(int doorId)
    {
        return rep.findByDoorId(doorId);
    }
    public List<Doorabu> getbyType(String type)
    {
        return rep.findByAccessType(type);
    }
    
}
