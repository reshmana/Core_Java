class CarromStarter{

public static void main(String [] args){

System.out.println("main method started...");

Carrom carrom=new Carrom("squarewooden");
System.out.println("Carrom GameBoard is:"+carrom.GameBoard);
System.out.println("Carrom Pockets is:"+carrom.Pockets);
System.out.println("Carrom weigthinGm is:"+carrom.weigthinGm);
System.out.println("Carrom Size is:"+carrom.Size);
System.out.println("Carrom Accessibility is:"+carrom.Accessibility);

Carrom carrom1=new Carrom("squarewooden","Round");
System.out.println("Carrom GameBoard is:"+carrom1.GameBoard);
System.out.println("Carrom Pockets is:"+carrom1.Pockets);
System.out.println("Carrom weigthinGm is:"+carrom1.weigthinGm);
System.out.println("Carrom Size is:"+carrom1.Size);
System.out.println("Carrom Accessibility is:"+carrom1.Accessibility);

Carrom carrom2=new Carrom("squarewooden","Round",100);
System.out.println("Carrom GameBoard is:"+carrom2.GameBoard);
System.out.println("Carrom Pockets is:"+carrom2.Pockets);
System.out.println("Carrom weigthinGm is:"+carrom2.weigthinGm);
System.out.println("Carrom Size is:"+carrom2.Size);
System.out.println("Carrom Accessibility is:"+carrom2.Accessibility);

Carrom carrom3=new Carrom("squarewooden","Round",50,"rectangular");
System.out.println("Carrom GameBoard is:"+carrom3.GameBoard);
System.out.println("Carrom Pockets is:"+carrom3.Pockets);
System.out.println("Carrom weigthinGm is:"+carrom3.weigthinGm);
System.out.println("Carrom Size is:"+carrom3.Size);
System.out.println("Carrom Accessibility is:"+carrom3.Accessibility);

Carrom carrom4=new Carrom("squarewooden","Round",100,"rectangular","family function");
System.out.println("Carrom GameBoard is:"+carrom4.GameBoard);
System.out.println("Carrom Pockets is:"+carrom4.Pockets);
System.out.println("Carrom weigthinGm is:"+carrom4.weigthinGm);
System.out.println("Carrom Size is:"+carrom4.Size);
System.out.println("Carrom Accessibility is:"+carrom4.Accessibility);



System.out.println("main method ended...");
}
}