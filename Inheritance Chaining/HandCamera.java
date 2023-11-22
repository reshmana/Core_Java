class HandCamera extends Camera{
	
	   double wieght;
	   
	   HandCamera(double wieght,String brand,Colour colour,int pixel,double batteryDuration){
		   super(brand,colour,pixel,batteryDuration);
		    this.wieght=wieght;
	   }
	
}