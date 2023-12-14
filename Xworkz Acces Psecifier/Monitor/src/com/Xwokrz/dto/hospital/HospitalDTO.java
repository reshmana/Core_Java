package com.Xwokrz.dto.hospital;

public class HospitalDTO {

    private String name;
    private String location;
    private int capacity;
    private  long emergencyPhoneNumber;
    private boolean hasPharmacy;
    private boolean hasEmergencyRoom;
    private boolean isOpen;

    public HospitalDTO(){

    }
    public HospitalDTO (String name,String location, boolean isOpen ){
        this.name=name;
        this.location=location;
        this.isOpen=isOpen;
    }

    public String getName(){
        return  name;
    }

    public String getLocation() {
        return location;
    }

    public int getCapacity() {
        return capacity;
    }

    public long getEmergencyPhoneNumber() {
        return emergencyPhoneNumber;
    }

    public boolean isHasEmergencyRoom() {
        return hasEmergencyRoom;
    }

    public boolean isHasPharmacy() {
        return hasPharmacy;
    }

    public boolean isOpen() {
        return isOpen;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setEmergencyPhoneNumber(long emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    public void setHasEmergencyRoom(boolean hasEmergencyRoom) {
        this.hasEmergencyRoom = hasEmergencyRoom;
    }

    public void setHasPharmacy(boolean hasPharmacy) {
        this.hasPharmacy = hasPharmacy;
    }

    public void setOpen(boolean open) {
        this.isOpen = open;
    }

    @Override
    public String toString() {
        return "hosiptal name"+this.name +","+"location of hospital"+this.location+","+"capacity of hospital"+this.capacity
                +","+"emergencyPhoneNumber"+this.emergencyPhoneNumber+","+"hasEmergencyRoom"+this.hasEmergencyRoom+
                ","+"parmacy is"+this.hasPharmacy+","+"hospital is open "+this.isOpen();
    }

    @Override
    public boolean equals(Object obj) {
        HospitalDTO ref1=this;
        if(obj!=null){
            if(obj instanceof HospitalDTO) {
                HospitalDTO ref2 = (HospitalDTO) obj;
                System.out.println("same on both side");
                if (ref1.name.equals(ref2) && ref1.location.equals(ref2) && ref1.isOpen == ref1.isOpen()){

                System.out.println("ref1 and ref2  are same");
                return true;
            }
               else {
                System.out.println("botj are defferent");
                return false;
                }
            }
        }
        return false;
    }
}

