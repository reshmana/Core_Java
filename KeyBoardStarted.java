class KeyBoardStarted{

public static void main(String [] args){
	
System.out.println("Starting main in KeyBoardStarted ");

KeyBoard keyBoard=new KeyBoard("dell");
System.out.println("KeyBoard Brand is:"+keyBoard.Brand);//dell
System.out.println("KeyBoard Colour is:"+keyBoard.Colour);//null
System.out.println("KeyBoard NoOfKeys is:"+keyBoard.NoOfKeys);//0.0
System.out.println("KeyBoard Type is:"+keyBoard.Type);//null
System.out.println("KeyBoard Cost is:"+keyBoard.Cost);//0.0

KeyBoard keyBoard1=new KeyBoard("dell","black");
System.out.println("KeyBoard1 Brand is:"+keyBoard1.Brand);//dell
System.out.println("KeyBoard1 Colour is:"+keyBoard1.Colour);//black
System.out.println("KeyBoard1 NoOfKeys is:"+keyBoard1.NoOfKeys);//0.0
System.out.println("KeyBoard1 Type is:"+keyBoard1.Type);//null
System.out.println("KeyBoard1 Cost is:"+keyBoard1.Cost);//0.0

KeyBoard keyBoard2=new KeyBoard("dell","white",104);
System.out.println("KeyBoard2 Brand is:"+keyBoard2.Brand);//dell
System.out.println("KeyBoard2 Colour is:"+keyBoard2.Colour);//black
System.out.println("KeyBoard2 NoOfKeys is:"+keyBoard2.NoOfKeys);//104.0
System.out.println("KeyBoard2 Type is:"+keyBoard2.Type);//null
System.out.println("KeyBoard2 Cost is:"+keyBoard2.Cost);//0.0

KeyBoard keyBoard3=new KeyBoard("dell","grey",104,"wireless");
System.out.println("KeyBoard3 Brand is:"+keyBoard3.Brand);//dell
System.out.println("KeyBoard3 Colour is:"+keyBoard3.Colour);//black
System.out.println("KeyBoard3 NoOfKeys is:"+keyBoard3.NoOfKeys);//104.0
System.out.println("KeyBoard3 Type is:"+keyBoard3.Type);//wirless
System.out.println("KeyBoard3 Cost is:"+keyBoard3.Cost);//0.0

KeyBoard keyBoard4=new KeyBoard("dell","brown",104,"wire",500);
System.out.println("KeyBoard4 Brand is:"+keyBoard4.Brand);
System.out.println("KeyBoard4 Colour is:"+keyBoard4.Colour);
System.out.println("KeyBoard4 NoOfKeys :"+keyBoard4.NoOfKeys);
System.out.println("KeyBoard4 Type is :"+keyBoard4.Type);
System.out.println("KeyBoard4 Cost is:"+keyBoard4.Cost);

System.out.println("Ending  main in KeyBoardStarted ");
}

}