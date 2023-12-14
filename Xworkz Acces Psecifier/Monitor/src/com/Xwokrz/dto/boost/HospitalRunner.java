package com.Xwokrz.dto.boost;


import com.Xwokrz.dto.hospital.*;

import java.io.Serializable;

public class HospitalRunner implements Serializable {
    public static void main(String[] args) {
        System.out.println("starting main in SongRunner");

        SongDTO songDTO = new SongDTO("tu hi ho",3.4);
        songDTO.setname("tu hi ho");
        songDTO.setSinger("arijit");
        songDTO.setWriter("pritam");
        songDTO.setComposer("pritma");
        songDTO.setDuration(3.4);
        songDTO.setLang("hindi");
        SongDTO songDTO1 = new SongDTO("tu hi ho",3.4);
        System.out.println(songDTO);// to string
        boolean same1=songDTO.equals(songDTO1);

        HospitalDTO hospitalDTO=new HospitalDTO("jayadeva","yajanagar",true);
         hospitalDTO.setName("Jaydeva");
         hospitalDTO.setLocation("jayanagar");
         hospitalDTO.setCapacity(10000);
         hospitalDTO.setOpen(true);
         hospitalDTO.setHasPharmacy(true);
         hospitalDTO.setEmergencyPhoneNumber(10050806999l);
         hospitalDTO.setHasEmergencyRoom(false);
        HospitalDTO hospitalDTO1=new HospitalDTO("jayadeva","yajanagar",true);
        boolean same2=hospitalDTO.equals(hospitalDTO1);
        System.out.println(hospitalDTO);//tostring

        PatientDTO patientDTO=new PatientDTO("Rachana",true,"absent","waiting");
        PatientDTO patientDTO1=new PatientDTO("Rachana",true,"absent","waiting");
        patientDTO.setId(101);
        patientDTO.setDischarge("dischared");
        patientDTO.setRecovery("recoverd");
        patientDTO.setStability("stable");
        patientDTO.setFollowUp("scheduled");
        boolean same3=patientDTO.equals(patientDTO1);
        System.out.println(patientDTO1);//tostring

        NurseDTO nurseDTO=new NurseDTO("spoorthi",18,"female","blood recovery",735399492L);
        NurseDTO nurseDTO1=new NurseDTO("spoorthi",18,"female","blood recovery",735399492L);
         nurseDTO.setQualification("BAMS");
         nurseDTO.setYearsOfExperience(10);
         nurseDTO.setRegistered(true);
         nurseDTO.setAddress("BTM");
         nurseDTO.setHourlyWage(1500);
        boolean same4=nurseDTO.equals(nurseDTO1);
        System.out.println(nurseDTO);

        MedicalDTO medicalDTO=new MedicalDTO(10000,true,"BTM");
        MedicalDTO medicalDTO1=new MedicalDTO(10000,false,"BTM");
        medicalDTO.setAvailable(true);
        medicalDTO.setCertifications(false);
        medicalDTO.setName("APOLO");
        medicalDTO.setEmergencyService(true);
        medicalDTO.setSpecialization("medican");
        medicalDTO.setContactNumber("1001");
        boolean same5=medicalDTO.equals(medicalDTO1);
        System.out.println(medicalDTO1);

        System.out.println("ending main in SongRunner");
    }
}
