package com.example.springapp.serviceabu;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.modelabu.Personabu;
import com.example.springapp.repositoryabu.PersonRepoabu;

@Service
public class PersonServiceabu {
    public PersonRepoabu personRepo;

    public PersonServiceabu(PersonRepoabu personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(Personabu person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<Personabu> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}
