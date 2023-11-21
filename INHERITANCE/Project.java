class Project{
   
     void validate(Person person){
	   if(person!=null){
		person.eat();
		person.sleep();
	
	  if (person instanceof Developer){
		Developer developer =(Developer)person;
		developer.eat();
		developer.sleep();
		developer.code();
	  }
	  if(person instanceof BusinessAnalyst){
		  
		BusinessAnalyst businessAnalyst=(BusinessAnalyst)person; 
         businessAnalyst.checkRequirement();		
	  }
	  
	  if(person instanceof ProductOwner){
	  ProductOwner productowner=(ProductOwner)person;
	      productowner.eat();
		  
	  }
	  
	  if (person instanceof Devops){
	    Devops devops =(Devops)person;
		devops.runBuild();
	  }
	 if(person instanceof Tester){
	  Tester tester =(Tester)person;
         tester.quality();	  
		 
	 } 
	 if(person instanceof DataBaseDeveloper){
	  DataBaseDeveloper dataBaseDeveloper=(DataBaseDeveloper)person	; 
		 dataBaseDeveloper.eat();
		 dataBaseDeveloper.sleep();
		 dataBaseDeveloper.runScript();
	 }
			   
			   
 }
 } 
}