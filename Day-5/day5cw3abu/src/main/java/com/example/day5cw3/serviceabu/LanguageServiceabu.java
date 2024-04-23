package com.example.day5cw3.serviceabu;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.day5cw3.modelbu.Languageabu;
import com.example.day5cw3.repositoryabu.LanguageRepoabu;

@Service
public class LanguageServiceabu {
    private LanguageRepoabu languageRepo;
    public LanguageServiceabu(LanguageRepoabu languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(Languageabu language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Languageabu> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,Languageabu language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public Languageabu getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
