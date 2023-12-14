package com.Xwokrz.dto.hospital;

public class PatientDTO {
    private int Id;
    private String name;
    private String discharge;
    private boolean Treatement;
    private String followUp;
    private String labResult;
    private String surgery;
    private String recovery;
    private String allergy;
    private String stability;

   public  PatientDTO(){

    }
    public PatientDTO(String name, boolean Treatement, String allergy,String labResult){
       this.name=name;
       this.Treatement=Treatement;
       this.allergy=allergy;
       this.labResult=labResult;
    }


    @Override
    public String toString() {
        return "patient info"+this.Id+"," +"name of patient"+this.name+","+" pateint discharge"+this.discharge+"."+
                "Treatement for patient"+this.Treatement+","+"patient followUp"+this.followUp+","+"lab result"+this.labResult+
                ","+"patient surgery"+this.surgery+","+"recovery for patient"+this.recovery+","+"allergy"+this.allergy+","+
                "stability of patient"+this.stability;

    }

    @Override
    public boolean equals(Object obj) {
        PatientDTO ref=this;
        if(obj!=null){
            if(obj instanceof PatientDTO){
                PatientDTO ref1=(PatientDTO) obj;
                System.out.println("both are same");
                if(ref.name.equals(ref1) && ref.Treatement== ref.Treatement && ref.allergy.equals(ref1)  &&
                    ref.labResult.equals(ref1)) {
                    System.out.println("both are same");
                    return true;
                }
                else{
                    System.out.println("both are not same");
                }

            }
        }

        return false;
    }
    public String getName(){
       return  name;
    }

    public int getId() {
        return Id;
    }

    public String getAllergy() {
        return allergy;
    }

    public String getDischarge() {
        return discharge;
    }

    public String getFollowUp() {
        return followUp;
    }

    public String getLabResult() {
        return labResult;
    }

    public String getRecovery() {
        return recovery;
    }

    public String getStability() {
        return stability;
    }

    public String getSurgery() {
        return surgery;
    }

    public boolean Treatement() {
        return Treatement;
    }
    public void setName(String name){
       name=name;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public void setDischarge(String discharge) {
        this.discharge = discharge;
    }

    public void setFollowUp(String followUp) {
        this.followUp = followUp;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setLabResult(String labResult) {
        this.labResult = labResult;
    }

    public void setRecovery(String recovery) {
        this.recovery = recovery;
    }

    public void setStability(String stability) {
        this.stability = stability;
    }

    public void setSurgery(String surgery) {
        this.surgery = surgery;
    }

    public void setTreatement(boolean treatement) {
        Treatement = treatement;
    }
}
