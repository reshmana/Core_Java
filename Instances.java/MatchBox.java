class MatchBox
{
String brand;
int noOfStick;
int lengthInCm;
double priceRs;
String size;
int weightInInch;
String Type;

MatchBox(String brand){
	System.out.println("MatchBox is created...");
	this.brand=brand;
}
MatchBox(String brand,int noOfStick){
	System.out.println("MatchBox is created with double parameters...");
	this.brand=brand;
	this.noOfStick=noOfStick;
}
MatchBox(String brand,int noOfStick,int lengthInCm){
	System.out.println("MatchBox is created with 3 parameters...");
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.lengthInCm=lengthInCm;
}
MatchBox(String brand,int noOfStick,int lengthInCm,double priceRs){
	System.out.println("MatchBox is created with 4 parameters...");
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.lengthInCm=lengthInCm;
	this.priceRs=priceRs;
	
}
MatchBox(String brand,int noOfStick,int lengthInCm,double priceRs,String size){
	System.out.println("MatchBox is created with 5 parameters...");
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.lengthInCm=lengthInCm;
	this.priceRs=priceRs;
	this.size=size;
}
MatchBox(String brand,int noOfStick,int lengthInCm,double priceRs,String size,int weightInInch){
	System.out.println("MatchBox is created with 6 parameters...");
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.lengthInCm=lengthInCm;
	this.priceRs=priceRs;
	this.size=size;
	this.weightInInch=weightInInch;
}
MatchBox(String brand,int noOfStick,int lengthInCm,double priceRs,String size,int weightInInch,String Type){
	System.out.println("MatchBox is created with 6 parameters...");
	this.brand=brand;
	this.noOfStick=noOfStick;
	this.lengthInCm=lengthInCm;
	this.priceRs=priceRs;
	this.size=size;
	this.weightInInch=weightInInch;
	this.Type=Type;	
}
}