class Free{

      String what;
      String why;
      boolean FreeForAll;

Free(String what,String why,boolean FreeForAll){
	this.what=what;
	this.why=why;
	this.FreeForAll=FreeForAll;
	System.out.println("Creating Free with String,String,boolean argument constructor");
	
}   

     void displayInfo(){
		 
		 System.out.println("Starting displayInfo");
		 System.out.println(this.what);
		 System.out.println(this.why);
		 System.out.println(this.FreeForAll);
		 
		 System.out.println("Ending displayInfo");
				 
	 }

}