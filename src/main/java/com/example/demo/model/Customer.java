package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
public class Customer {

    @Id
    private String id;

    private String type;
    private String institutionName;
    private String customerName;
    private String phoneNumber;
    private String emailId;
    private String gender;
    private String residentialAddress;
    private String chooseBeeFarmingLocation;
    private String nationality;
    private String state;
    private String district;
    private String taluk;
    private String gramPanchyatOrWard;
    private String villageTownCity;
    private String pincode;
    private String gstNumber;

    // Getters & Setters

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getInstitutionName() { return institutionName; }
    public void setInstitutionName(String institutionName) { this.institutionName = institutionName; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getEmailId() { return emailId; }
    public void setEmailId(String emailId) { this.emailId = emailId; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getResidentialAddress() { return residentialAddress; }
    public void setResidentialAddress(String residentialAddress) { this.residentialAddress = residentialAddress; }

    public String getChooseBeeFarmingLocation() { return chooseBeeFarmingLocation; }
    public void setChooseBeeFarmingLocation(String chooseBeeFarmingLocation) { this.chooseBeeFarmingLocation = chooseBeeFarmingLocation; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }

    public String getTaluk() { return taluk; }
    public void setTaluk(String taluk) { this.taluk = taluk; }

    public String getGramPanchyatOrWard() { return gramPanchyatOrWard; }
    public void setGramPanchyatOrWard(String gramPanchyatOrWard) { this.gramPanchyatOrWard = gramPanchyatOrWard; }

    public String getVillageTownCity() { return villageTownCity; }
    public void setVillageTownCity(String villageTownCity) { this.villageTownCity = villageTownCity; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    public String getGstNumber() { return gstNumber; }
    public void setGstNumber(String gstNumber) { this.gstNumber = gstNumber; }
}