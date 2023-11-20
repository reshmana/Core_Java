class KeyBoard
{
String Brand;
String Colour;
int NoOfKeys;
String Type;
double Cost;

 KeyBoard(String brand)
{
System.out.println("KeyBoard is created...");
this.Brand=Brand;
System.out.println("the brand of keyboard:"+brand);
}
KeyBoard(String brand,String colour)
{
System.out.println("KeyBoard is created with double parameters");
this.Brand=Brand;
this.Colour=Colour;
System.out.println("constructor with args:"+brand+","+color);
}

KeyBoard(String Brand, String Colour,int NoOfKeys){
System.out.println("KeyBoard is created with 3 parameters");
  this.Brand=Brand;
  this.Colour=Colour;
  this.NoOfKeys=NoOfKeys;
}
KeyBoard(String Brand, String Colour,int NoOfKeys,String Type){
System.out.println("KeyBoard is created with 4 parameters");
  this.Brand=Brand;
  this.Colour=Colour;
  this.NoOfKeys=NoOfKeys;
  this.Type=Type;
}
KeyBoard(String Brand,String Colour,int NoOfKeys,String Type,double Cost){
	System.out.println("KeyBoard is created with 4 parameters");
	this.Brand=Brand;
	this.Colour=Colour;
	this.NoOfKeys=NoOfKeys;
	this.Type=Type;
	this.Cost=Cost;
}
}