class Month{

     String name;
	 long noOfDays;
	 int noOFWeekEnds;
	 long noOfHolidays;
	  
	Month(String name,long noOfDays,int noOFWeekEnds,long noOfHolidays){
		  this.name=name;
		  this.noOfDays=noOfDays;
		  this.noOFWeekEnds=noOFWeekEnds;
		  this.noOfHolidays=noOfHolidays;
		System.out.println("Creating month with String,long ,int,long argument constructor");
	  }
	  
	 void displayInfo(){
		  System.out.println("Starting displayInfo");
		  System.out.println(this.name);
		  System.out.println(this.noOfDays);
		  System.out.println(this.noOFWeekEnds);
		  System.out.println(this.noOfHolidays);
		  
		  System.out.println("Ending displayInfo");
		  
	  }


}