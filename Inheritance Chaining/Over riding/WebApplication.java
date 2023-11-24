class WebApplication extends Application{

     String[] supportedBrowsers;
	 boolean free;
	 
	 WebApplication(String name,AppType type){
		  super(name,type);
		  System.out.println("running String app arg const in StandaloneApplication");
	  }
     
	 void setBrowser(String[] supportBrowsers){
		 this.supportedBrowsers=supportedBrowsers;
		 System.out.println("running list of browsers");
		 if(supportedBrowsers!=null){
			 for(int index=0; index<this.supportedBrowsers.length; index++){
				 
				 String browser=supportBrowsers[index];
				 System.out.println("supportBrowsers :"+browser);
			 }
		 }
	 }
		
		 void Info(boolean free){
			 this.free=free;
			 System.out.println("browser is free:"+this.free);
			 connectInternet();
			 sendUsage();
		 }
		 void connectInternet(){
			 System.out.println("runnin connectInternet in WebApplication");
		 }
		 
		 void sendUsage(){
			 System.out.println("runnin sendUsage in WebApplication");
		 }
	 }