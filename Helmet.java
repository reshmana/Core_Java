class Helmet{

String Brand;
String Visibility;
int weight;
String Size;
String OuterShell;

Helmet(){
this("Sportgear","BrightColour",100,"Circular","Fibreglass");
System.out.println("Invoke the no-argumrnt...");

}

Helmet(String Brand){
	System.out.println("Invoke the String argumrnt:"+Brand);
	this.Brand=Brand;	
}
Helmet(String Brand,String Visibility){
	this(Brand);
	this.Visibility=Visibility;	
	System.out.println("Invoke the String,String argumrnt:"+Brand+","+Visibility);
	
}
Helmet(String Brand,String Visibility,int weight){
	this(Brand,Visibility);
	this.weight=weight;	
	System.out.println("Invoke the String,String,int argumrnt:"+Brand+","+Visibility+","+weight);
}

Helmet(String Brand,String Visibility,int weight,String Size){
	this(Brand,Visibility,weight);
	this.Size=Size;	
	System.out.println("Invoke the String,String,int, String argumrnt:"+Brand+","+Visibility+","+weight+","+Size);
}

Helmet(String Brand,String Visibility,int weight,String Size,String OuterShell){
	this(Brand,Visibility,weight,Size);
	this.OuterShell=OuterShell;	
	System.out.println("Invoke the String,String,int, String,String  argumrnt:"+Brand+","+Visibility+","+weight+","+Size+","+OuterShell);
}


}