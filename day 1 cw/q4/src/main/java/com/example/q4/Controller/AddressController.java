package com.example.q4.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.q4.Model.Address;

@RestController
public class AddressController {
        @GetMapping("/welcomee")
        public List<Address>list()
        {
             List<Address> li=new ArrayList<Address>(); 
             Address o=new Address();
             o.setName("Abhi");
             o.setDoorNo(123);
             o.setStreetName("Main  St");
             o.setPincode(641024);
             o.setArea("sundarapuram");
             o.setDistrict("coimbatore");
             o.setState("Tamil Nadu");
             o.setCountry("India");
             li.add(o);
             return li;
        }
}
