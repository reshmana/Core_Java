class ClockStarter{

public static void main(String[]args){
 
System.out.println("main method is started");

Clock clock=new Clock("pendulun");
System.out.println("clock type :"+clock.Type);
System.out.println("clock brand  :"+clock.Brand);
System.out.println("clock Duration :"+clock.Duration);
System.out.println("clock weigth :"+clock.weigth);
System.out.println("clock quality :"+clock.quality);

Clock clock1=new Clock("pendulun","Titan");
System.out.println("clock type :"+clock1.Type);
System.out.println("clock brand  :"+clock1.Brand);
System.out.println("clock Duration :"+clock1.Duration);
System.out.println("clock weigth :"+clock1.weigth);
System.out.println("clock quality :"+clock1.quality);

Clock clock2=new Clock("pendulun","Titan",10);
System.out.println("clock type :"+clock2.Type);
System.out.println("clock brand  :"+clock2.Brand);
System.out.println("clock Duration :"+clock2.Duration);
System.out.println("clock weigth :"+clock2.weigth);
System.out.println("clock quality :"+clock2.quality);

Clock clock3=new Clock("pendulun","Titan",10,25.2);
System.out.println("clock type :"+clock3.Type);
System.out.println("clock brand  :"+clock3.Brand);
System.out.println("clock Duration :"+clock3.Duration);
System.out.println("clock weigth :"+clock3.weigth);
System.out.println("clock quality :"+clock3.quality);

Clock clock4=new Clock("pendulun","Titan",10,25.2,true);
System.out.println("clock type :"+clock4.Type);
System.out.println("clock brand  :"+clock4.Brand);
System.out.println("clock Duration :"+clock4.Duration);
System.out.println("clock weigth :"+clock4.weigth);
System.out.println("clock quality :"+clock4.quality);

System.out.println("main method is ended");
}
}