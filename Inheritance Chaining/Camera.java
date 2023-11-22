class Camera{

     String brand;
	 Colour colour;
	 int pixel;
	 double batteryDuration;
	 
	Camera(String brand,Colour colour,int pixel,double batteryDuration){
		this.brand=brand;
		this.colour=colour;
		this.pixel=pixel;
		this. batteryDuration=batteryDuration;
		
		System.out.println("running defualt no argument constuctor of Camera");
	} 
	 
	 void show(){
		 
		 System.out.println("starting show in camera");
         System.out.println("brand is :"+this.brand);
		 System.out.println("colour is :"+this.colour);
		 System.out.println("pixel is :"+this.pixel);
		 System.out.println("batteryDuration is:"+this.batteryDuration);
		 System.out.println("ending show in camera");
	 }
     
}