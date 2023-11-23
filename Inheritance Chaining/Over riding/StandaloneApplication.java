class StandaloneApplication extends Application{
	
	  double size;
	  String compatablewith;
	  OsType os;
	  
	  StandaloneApplication(String name,AppType type){
		  super(name,type);
		  System.out.println("running String app arg const in StandaloneApplication");
	  }
	  
	  void show(double size, String compatablewith, OsType type){
		   
		   this.size=size;
		   this.compatablewith=compatablewith;
		   this.os=os;
		   System.out.println("size of StandaloneApplication :"+this.size);
		   System.out.println("compatablewith in StandaloneApplication :"+this.compatablewith);
		   System.out.println("os of StandaloneApplication :"+this.os);
		        consumerMemory();
				consumeInternet();
	  }
	  
	  void consumerMemory(){
		  System.out.println("running consumerMemory in StandaloneApplication");
	  }
	  void consumeInternet(){
		  System.out.println("running consumeInternet in StandaloneApplication");
	  }
	  
}