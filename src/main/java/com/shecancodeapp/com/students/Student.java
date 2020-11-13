package com.shecancodeapp.com.students;


public class Student {
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

    public Student(String id, String name, String email, String gender,String district,
                   String phoneNumber,String location, String howdidyouhearaboutus,
                   String inpersonoronline,String programFee,
                   String registrationFee,String ownAlaptop,String accessToInternet,
                   String scholarship,String careerGoals ) {
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
    //    public Student() {
//    }
//
//    public Student(int id, String name, String email, String district, int phoneNumber,
//                   String gender, String location, String howdidyouhearaboutus, String classChoice,
//                   double programFee, double regisgtrationFee, String educationLevel, boolean ownedLaptop,
//                   boolean internetAccess, String scholarship, String careerGoals) {
//        this.id =id;
//        this.name = name;
//        this.email = email;
//        this.district = district;
//        this.phoneNumber = phoneNumber;
//        this.gender = gender;
//        this.location = location;
//        this.howdidyouhearaboutus = howdidyouhearaboutus;
//        this.classChoice = classChoice;
//        this.programFee = programFee;
//        this.regisgtrationFee = regisgtrationFee;
//        this.educationLevel = educationLevel;
//        this.ownedLaptop = ownedLaptop;
//        this.internetAccess = internetAccess;
//        this.scholarship = scholarship;
//        this.careerGoals = careerGoals;
//    }
//
//    public int getId (){
//        return id;
//    }
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getDistrict() {
//        return district;
//    }
//
//    public int getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public String getHowdidyouhearaboutus() {
//        return howdidyouhearaboutus;
//    }
//
//    public String getClassChoice() {
//        return classChoice;
//    }
//
//    public double getProgramFee() {
//        return programFee;
//    }
//
//    public double getRegisgtrationFee() {
//        return regisgtrationFee;
//    }
//
//    public String getEducationLevel() {
//        return educationLevel;
//    }
//
//    public boolean isOwnedLaptop() {
//        return ownedLaptop;
//    }
//
//    public boolean isInternetAccess() {
//        return internetAccess;
//    }
//
//    public String getScholarship() {
//        return scholarship;
//    }
//
//    public String getCareerGoals() {
//        return careerGoals;
//    }
//
//
//    public void setId (int id){
//        this.id =id;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setDistrict(String district) {
//        this.district = district;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public void setHowdidyouhearaboutus(String howdidyouhearaboutus) {
//        this.howdidyouhearaboutus = howdidyouhearaboutus;
//    }
//
//    public void setClassChoice(String classChoice) {
//        this.classChoice = classChoice;
//    }
//
//    public void setProgramFee(double programFee) {
//        this.programFee = programFee;
//    }
//
//    public void setRegisgtrationFee(double regisgtrationFee) {
//        this.regisgtrationFee = regisgtrationFee;
//    }
//
//    public void setEducationLevel(String educationLevel) {
//        this.educationLevel = educationLevel;
//    }
//
//    public void setOwnedLaptop(boolean ownedLaptop) {
//        this.ownedLaptop = ownedLaptop;
//    }
//
//    public void setInternetAccess(boolean internetAccess) {
//        this.internetAccess = internetAccess;
//    }
//
//    public void setScholarship(String scholarship) {
//        this.scholarship = scholarship;
//    }
//
//    public void setCareerGoals(String careerGoals) {
//        this.careerGoals = careerGoals;
//    }
}


