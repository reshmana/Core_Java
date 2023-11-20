class DoctorStarter{
   
   public static void main(String [] medic){
   
      System.out.println("main method start in DoctorStarter");
          
		  Doctor doctor=new Doctor();
		  Doctor doctor1=new Surgeon();
		  Doctor doctor2=new SurgicalSpecialty();
		  Doctor doctor3=new Experiance();
		  
		  Surgeon surgeon=new Surgeon();
		  Surgeon surgeon1=new SurgicalSpecialty();
		  Surgeon surgeon2=new Experiance();
   
         SurgicalSpecialty surgicalSpecialty=new SurgicalSpecialty();
         SurgicalSpecialty surgicalSpecialty1=new Experiance();
		 
		 Experiance experiance=new Experiance();
      System.out.println("main method End in DoctorStarter");
   }




}