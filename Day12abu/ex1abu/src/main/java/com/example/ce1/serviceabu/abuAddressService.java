package com.example.ce1.serviceabu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.modelabu.abuAddress;
import com.example.ce1.repositoryabu.abuAddressRepo;
import com.example.ce1.repositoryabu.abuEmployeeRepo;

@Service
public class abuAddressService {
    @Autowired
    abuAddressRepo addressRepo;
    @Autowired
    abuEmployeeRepo employeeRepo;
    public abuAddress setAddressById(int id,abuAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
