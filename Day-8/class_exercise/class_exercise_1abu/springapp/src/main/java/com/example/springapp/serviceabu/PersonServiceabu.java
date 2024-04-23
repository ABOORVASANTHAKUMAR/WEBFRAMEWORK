package com.example.springapp.serviceabu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.modelabu.Personabu;
import com.example.springapp.repositoryabu.PersonRepoabu;

@Service
public class PersonService {
    @Autowired
    private PersonRepoabu rep;

    public boolean post(Personabu person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<Personabu> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<Personabu> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
