class EdgeBrowser extends Browser{

     EdgeBrowser(String name,AppType type){
		  super(name,type);
		  System.out.println("running String app arg const in StandaloneApplication");
	  }
	  
	  void show(){
		  setting();
		  displayHistory();
		  consumerMemory();
		  consumeInternet();
		   run();
		   stop();
           execute();
		  collectInfo();
		  displayInfo();
	  }
	  @Override
	  void setting(){
		System.out.println("running setting in browser");
	}
	@Override
	void displayHistory(){
		System.out.println("running displayHistory in browser");
	}
	@Override
	void consumerMemory(){
		  System.out.println("running consumerMemory in StandaloneApplication");
	  }
	  @Override
	void consumeInternet(){
		  System.out.println("running consumeInternet in StandaloneApplication");
	  }
	  @Override
     void run(){
		System.out.println("running run in application");
		this.execute();
	}
	@Override
	void stop(){
		System.out.println("running stop in application");
	}
	@Override
	void execute(){
		System.out.println("running execute in application");
	}
	@Override
	void collectInfo(){
	   System.out.println("running collectInfo in application");
	}
	@Override
	void displayInfo(){
		System.out.println("running displayInfo in application");
        this.run();
	}
}