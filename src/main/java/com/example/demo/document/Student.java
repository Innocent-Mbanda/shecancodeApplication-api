package com.example.demo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {
    @Id
    private String id;
    private String name;
    private String email;
    private String gender;
    private String district;
    private String phoneNumber;
    private String location;
    private String howdidyouhearaboutus;
    private String inpersonoronline;
    private String programFee;
    private String registrationFee;
    private String ownAlaptop;
    private String accessToInternet;
    private String scholarship;
    private String careerGoals;


    public Student() {
    }

    public Student(String id, String name, String email, String gender, String district,
                   String phoneNumber, String location, String howdidyouhearaboutus,
                   String inpersonoronline, String programFee,
                   String registrationFee, String ownAlaptop, String accessToInternet,
                   String scholarship, String careerGoals ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.district = district;
        this.phoneNumber =phoneNumber;
        this.location =location;
        this.howdidyouhearaboutus =howdidyouhearaboutus;
        this.inpersonoronline =inpersonoronline;
        this.programFee =programFee;
        this.registrationFee =registrationFee;
        this.ownAlaptop =ownAlaptop;
        this.accessToInternet =accessToInternet;
        this.scholarship =scholarship;
        this.careerGoals =careerGoals;


    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setHowdidyouhearaboutus(String howdidyouhearaboutus) {
        this.howdidyouhearaboutus = howdidyouhearaboutus;
    }

    public void setInpersonoronline(String inpersonoronline) {
        this.inpersonoronline = inpersonoronline;
    }

    public void setProgramFee(String programFee) {
        this.programFee = programFee;
    }

    public void setRegistrationFee(String registrationFee) {
        this.registrationFee = registrationFee;
    }

    public void setOwnAlaptop(String ownAlaptop) {
        this.ownAlaptop = ownAlaptop;
    }

    public void setAccessToInternet(String accessToInternet) {
        this.accessToInternet = accessToInternet;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }

    public void setCareerGoals(String careerGoals) {
        this.careerGoals = careerGoals;
    }

    //    gets
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDistrict() {
        return district;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public String getHowdidyouhearaboutus() {
        return howdidyouhearaboutus;
    }

    public String getInpersonoronline() {
        return inpersonoronline;
    }

    public String getProgramFee() {
        return programFee;
    }

    public String getRegistrationFee() {
        return registrationFee;
    }

    public String getOwnAlaptop() {
        return ownAlaptop;
    }

    public String getAccessToInternet() {
        return accessToInternet;
    }

    public String getScholarship() {
        return scholarship;
    }

    public String getCareerGoals() {
        return careerGoals;
    }

}
