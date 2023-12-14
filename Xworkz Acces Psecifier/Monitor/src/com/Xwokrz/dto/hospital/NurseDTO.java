package com.Xwokrz.dto.hospital;

public class NurseDTO {
    private String name;
    private int age;
    private String gender;
    private String qualification;
    private String speciality;
    private double yearsOfExperience;
    private boolean Registered;
    private long contactNumber;
    private String address;
    private double hourlyWage;

    public NurseDTO(){

    }
    public NurseDTO(String name,int age,String gender,String speciality,long contactNumber ){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.speciality=speciality;
        this.contactNumber=contactNumber;
    }

    @Override
    public String toString() {
        return "nurse name" + this.name + "," + "nurse age" + this.age + "," + "gender" + this.gender + "," + "qualification" + this.qualification +
                "," + "speciality" + this.speciality + "," + "yearsOfExperience" + this.yearsOfExperience + "," + "Registered"+
        this.Registered + "," + "contactNumber"+ this.contactNumber + "," + "address"+this.address+","+"hourlyWage"+this.address;
    }

    @Override
    public boolean equals(Object obj) {
        NurseDTO ref=this;
        if(obj!=null){
            if(obj instanceof  NurseDTO){
                NurseDTO ref1=(NurseDTO) obj;
                System.out.println("both side are same");
                if(ref.name.equals(ref1) && ref.age==ref1.age && ref.gender.equals(ref1 ) && ref.speciality.equals(ref1) &&
                ref.contactNumber==ref1.contactNumber){
                    System.out.println("both are same");
                }
                else{
                    System.out.println("both are different");
                }
            }
        }
        return false;
    }
    public void setname(String name){
       this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setRegistered(boolean registered) {
        Registered = registered;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getAge() {
        return age;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getQualification() {
        return qualification;
    }

    public String getSpeciality() {
        return speciality;
    }
    public String getadress(){
        return address;
    }
}
