class ProjectStarter{

    public static void main(String...args){
	    
	  System.out.println("Starting main in ProjectStarter");
	      
	    Project project=new Project();
		Person person =new Person();
		project.validate(person);
		
		Developer developer=new Developer();
	      project.validate(developer);
		  
	    BusinessAnalyst businessAnalyst=new BusinessAnalyst();	  
	     project.validate(businessAnalyst);
		 
		ProductOwner productOwner=new ProductOwner();
          project.validate(productOwner);	

        Devops devops=new Devops();
         project.validate(devops);

        Tester tester =new Tester();
		 project.validate(tester);
		
		DataBaseDeveloper dataBaseDeveloper =new DataBaseDeveloper();
		 project.validate(dataBaseDeveloper);
       
	  System.out.println("Ending main in ProjectStarter");
	}
	
}