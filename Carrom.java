class Carrom{

String GameBoard;
String Pockets;
int weigthinGm;
String Size;
String Accessibility;

Carrom(){
this("squarewooden","Round",100,"rectangular","tournaments");
System.out.println("Invoke the no-argumrnt...");

}

Carrom(String GameBoard){
	System.out.println("Invoke the String argumrnt:"+GameBoard);
	this.GameBoard=GameBoard;	
}
Carrom(String GameBoard,String Pockets){
	this(GameBoard);
	this.Pockets=Pockets;	
	System.out.println("Invoke the String,String argumrnt:"+GameBoard+","+Pockets);
	
}
Carrom(String GameBoard,String Pockets,int weigth){
	this(GameBoard,"Pockets");
	this.weigthinGm=weigthinGm;	
	System.out.println("Invoke the String,String,int argumrnt:"+GameBoard+","+Pockets+","+weigthinGm);
}

Carrom(String GameBoard,String Pockets,int weigthinGm,String Size){
	this(GameBoard,Pockets,weigthinGm);
	this.Size=Size;	
	System.out.println("Invoke the String,String,int, String argumrnt:"+GameBoard+","+Pockets+","+weigthinGm+","+Size);
}

Carrom(String GameBoard,String Pockets,int weigthinGm,String Password,String Porpose){
	this(GameBoard,Pockets,weigthinGm,Size);
	this.Accessibility=Accessibility;	
	System.out.println("Invoke the String,String,int, String,String  argumrnt:"+GameBoard+","+Pockets+","+weigthinGm+","+Size+","+Accessibility);
}

}