package com.example.q4.Model;

public class Address {
           private String name;
           private int doorNo;
           private String streetName;
           private int Pincode;
           private String area;
           private String district;
           private String state;
           private String country;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getDoorNo() {
            return doorNo;
        }
        public void setDoorNo(int doorNo) {
            this.doorNo = doorNo;
        }
        public String getStreetName() {
            return streetName;
        }
        public void setStreetName(String streetName) {
            this.streetName = streetName;
        }
        public int getPincode() {
            return Pincode;
        }
        public void setPincode(int pincode) {
            Pincode = pincode;
        }
        public String getArea() {
            return area;
        }
        public void setArea(String area) {
            this.area = area;
        }
        public String getDistrict() {
            return district;
        }
        public void setDistrict(String district) {
            this.district = district;
        }
        public String getState() {
            return state;
        }
        public void setState(String state) {
            this.state = state;
        }
        public String getCountry() {
            return country;
        }
        public void setCountry(String country) {
            this.country = country;
        }   
}
