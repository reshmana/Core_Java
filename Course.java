class Course{

     String instituteName;
     String location;
	 double fee;
	 String tech;
	 long noOfMonths;
	 int  placements;
	 String teaching;
	 
	 Course(String instituteName,String location,double fee,String tech,long noOfMonths,int  placements,String teaching){
    this.instituteName = instituteName;
    this.location = location;
    this.fee = fee;
    this.tech = tech;
    this.noOfMonths = noOfMonths;
    this.placements = placements;
    this.teaching = teaching;
	  System.out.println("creating course String,String ,double,String,long,int,String arguments");
	  
	 }
	  
     void displayInfo(){
		 System.out.println("Start of displayInfo");
		 System.out.println(this.instituteName);
		 System.out.println(this.location);
		 System.out.println(this.fee);
		 System.out.println(this.tech);
		 System.out.println(this.noOfMonths);
		 System.out.println(this.placements);
		 System.out.println(this.teaching);
		 System.out.println("end of displayInfo");
		 
	 }
}