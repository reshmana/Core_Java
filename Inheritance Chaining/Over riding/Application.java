class Application
{
	double id;
	String name;
	AppType type;
	double version;
	String developer;
	String date;
	
	Application(String name,AppType type){
		this.name=name;
		this.type=type;
		System.out.println("running String Apptype arg const in application");
	}
	
	void show(double id,double version,String developer,String date )
	{
		this.id=id;
		this.version=version;
		this.developer=developer;
		this.date=date;
		
		System.out.println("application name :"+this.name);
		System.out.println("application id :"+this.id);
		System.out.println("application type :"+this.type);
		System.out.println("application version :"+this.version);
		System.out.println("application developer:"+this.developer);
		System.out.println(" application date:"+this.date);
		
		run();
		stop();
		execute();
		collectInfo();
		displayInfo();
	}
	
	void run(){
		System.out.println("running run in application");
		this.execute();
	}
	
	void stop(){
		System.out.println("running stop in application");
	}
	
	void execute(){
		System.out.println("running execute in application");
	}
	
	void collectInfo(){
	   System.out.println("running collectInfo in application");
	}
	
	void displayInfo(){
		System.out.println("running displayInfo in application");
        this.run();
	}
	
}