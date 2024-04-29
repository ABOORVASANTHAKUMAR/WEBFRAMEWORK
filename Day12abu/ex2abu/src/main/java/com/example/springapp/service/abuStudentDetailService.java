package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.abuStudentDetail;
import com.example.springapp.repository.abuStudentDetailRepository;
import com.example.springapp.repository.abuStudentRepository;

@Service
public class abuStudentDetailService {
    @Autowired
    abuStudentDetailRepository studentDetailRepository;
    @Autowired
    abuStudentRepository studentRepository;
    public abuStudentDetail addStudentDetail(int id,abuStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
