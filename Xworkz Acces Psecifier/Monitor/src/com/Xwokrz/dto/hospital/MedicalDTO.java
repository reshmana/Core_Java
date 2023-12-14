package com.Xwokrz.dto.hospital;

public class MedicalDTO {
    private String name;
    private String specialization;
    private int profit;
    private String location;
    private String contactNumber;
    private boolean certifications;
    private boolean Available;
    private boolean EmergencyService;
    private boolean acceptsInsurance;

    public MedicalDTO() {

    }

    public MedicalDTO(int profit, boolean acceptsInsurance, String location) {
        this.profit = profit;
        this.location = location;
        this.acceptsInsurance = acceptsInsurance;
    }

    @Override
    public String toString() {
        return "medical name" + this.name + "," + "specialize" + this.specialization + "," + "profit" + this.profit + "," +
                "location" + this.location + "," + "certifications" + this.certifications + "," + "Available" + this.Available + "," +
                "EmergencyService"+this.EmergencyService+","+"acceptsInsurance"+ this.acceptsInsurance + ","
                + "contactNumber"+ this.contactNumber;
    }

    @Override
    public boolean equals(Object obj) {
        MedicalDTO ref=this;
        if(obj!=null){
            if(obj instanceof  MedicalDTO){
                MedicalDTO ref1=(MedicalDTO) obj;
                System.out.println("both side are same");
                if(ref.profit==ref1.profit  && ref.location.equals(ref1 ) && ref.acceptsInsurance==ref1.acceptsInsurance){
                    System.out.println("both are same");
                }
                else{
                    System.out.println("both are different");
                }
            }
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAcceptsInsurance(boolean acceptsInsurance) {
        this.acceptsInsurance = acceptsInsurance;
    }

    public void setAvailable(boolean available) {
        Available = available;
    }

    public void setCertifications(boolean certifications) {
        this.certifications = certifications;
    }

    public void setEmergencyService(boolean emergencyService) {
        EmergencyService = emergencyService;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getProfit() {
        return profit;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public boolean getisAcceptsInsurance() {
        return acceptsInsurance;
    }

    public boolean getAvailable() {
        return Available;
    }

    public boolean getEmergencyService() {
        return EmergencyService;
    }
}

