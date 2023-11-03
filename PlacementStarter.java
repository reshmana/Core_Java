class PlacementStarter{

  public static void main(String[]args){
	System.out.println("Starting main method in placementStarter");
		 
     Placement placement=new Placement("Walmart ", "Software Engineer", 90000, "New York", 2023, "Developing web applications", true, false, false, "Engineering", "John Doe", "Healthcare, 401(k)");
		 placement.displayInfo();
		 
	Placement placement1=new Placement("Microsof", "Data Analyst", 75000, "San Francisco", 2023, "Analyzing data trends", true, false, false, "Data Analytics", "Jane Smith", "Healthcare, Stock Options");
		  placement1.displayInfo();
		  
    Placement placement2=new Placement("Google ", "Marketing Intern", 20000, "Chicago", 2023, "Assisting marketing team", false, true, false, "Marketing", "David Wilson", "Learning Opportunities");
		  placement2.displayInfo();
		  
    Placement placement3=new Placement("Infosys ", "Software Intern", 22000, "Bengalore", 2023, "developing  web application", true, true, false, "Engineering", "David Wilson", "Learning Opportunities");
		  placement3.displayInfo();
		  
	Placement placement4=new Placement("IBM ", "Software Intern", 20000, "channai", 2023, "developing web team", false, true, true, "Engineering", "David Wilson", "Learning Opportunities");
		  placement4.displayInfo();

	Placement placement5=new Placement("TCS ", "Marketing Intern", 30000, "Hydrabad", 2023, "Assisting marketing team", false, true, false, "Marketing", "David Wilson", "Learning Opportunities");
		  placement5.displayInfo();
		 
    Placement placement6=new Placement("Siemens", "Marketing Intern", 20000, "mumbai", 2022, "Assisting marketing team", false, true, false, "Marketing", "David Wilson", "Learning Opportunities");
		  placement6.displayInfo();
	 
	Placement placement7=new Placement("Cognigent", "Marketing Intern", 20000, "Chicago", 2023, "Assisting marketing team", false, true, false, "Marketing", "David Wilson", "Learning Opportunities");
		  placement7.displayInfo();
     
	 Placement placement8=new Placement("DXC tech ", "Marketing Intern", 20000, "Chicago", 2022, "developing web team", false, true, false, "Marketing", "David Wilson", "Learning Opportunities");
		  placement8.displayInfo();
		  
	Placement placement9=new Placement("NTT data ", "Marketing Intern", 20000, "Chicago", 2020, "Assisting marketing team", false, true, false, "Marketing", "David Wilson", "Learning Opportunities");
		  placement9.displayInfo();
		  
    Placement placement10=new Placement("SLK Tech ", "data Analyst", 50000, "Bengalore", 2020, "Assisting marketing team", false, true, false, "Marketing", "David Wilson", "Learning Opportunities");
		  placement10.displayInfo();
		  
    Placement placement11=new Placement("Amezon", "Marketing Intern", 20000, "Bengalore", 2022, "Assisting marketing team", false, true, false, "Marketing", "David Wilson", "Learning Opportunities");
		  placement11.displayInfo();
	 
  System.out.println("Ending main method in placementStarter");
	 }

}