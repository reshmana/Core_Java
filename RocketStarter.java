class RocketStarter{

public static void main(String[]args){

System.out.println("main maethod is Started");

Rocket rocket=new Rocket("Space-X");
System.out.println("Brand of rocket is :"+rocket.Brand);
System.out.println("Cost of rocket is :"+rocket.Cost);
System.out.println("Balance of rocket is :"+rocket.Balance);
System.out.println("Weigth of rocket is :"+rocket.Weigth);
System.out.println("Flexibility of rocket is :"+rocket.Flexibility);

Rocket rocket1=new Rocket("Space-X",500000);
System.out.println("Brand of rocket is :"+rocket1.Brand);
System.out.println("Cost of rocket is :"+rocket1.Cost);
System.out.println("Balance of rocket is :"+rocket1.Balance);
System.out.println("Weigth of rocket is :"+rocket1.Weigth);
System.out.println("Flexibility of rocket is :"+rocket1.Flexibility);

Rocket rocket2=new Rocket("Space-X",500000,"centre of gravity");
System.out.println("Brand of rocket is :"+rocket2.Brand);
System.out.println("Cost of rocket is :"+rocket2.Cost);
System.out.println("Balance of rocket is :"+rocket2.Balance);
System.out.println("Weigth of rocket is :"+rocket2.Weigth);
System.out.println("Flexibility of rocket is :"+rocket2.Flexibility);

Rocket rocket3=new Rocket("Space-X",500000,"centre of gravity",200.0);
System.out.println("Brand of rocket is :"+rocket3.Brand);
System.out.println("Cost of rocket is :"+rocket3.Cost);
System.out.println("Balance of rocket is :"+rocket3.Balance);
System.out.println("Weigth of rocket is :"+rocket3.Weigth);
System.out.println("Flexibility of rocket is :"+rocket3.Flexibility);

Rocket rocket4=new Rocket("Space-X",500000,"centre of gravity",200.0,true);
System.out.println("Brand of rocket is :"+rocket4.Brand);
System.out.println("Cost of rocket is :"+rocket4.Cost);
System.out.println("Balance of rocket is :"+rocket4.Balance);
System.out.println("Weigth of rocket is :"+rocket4.Weigth);
System.out.println("Flexibility of rocket is :"+rocket4.Flexibility);

System.out.println("main maethod is Endend");
}





}