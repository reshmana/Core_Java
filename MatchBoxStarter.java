class MatchBoxStarter{
public static void main(String []args){
System.out.println("Starting main in MatchBoxStarter");

MatchBox matchBox=new MatchBox("Home");
 System.out.println("MatchBox brand is: " + matchBox.brand);//Home
 System.out.println("MatchBox noOfStick is: " + matchBox.noOfStick);//0.0
 System.out.println("MatchBox lengthInCm is: " + matchBox.lengthInCm);//0.0
 System.out.println("MatchBox priceRs: " + matchBox.priceRs); //0.0
 System.out.println("MatchBox size is: " + matchBox.size);//null
 System.out.println("MatchBox weightInInch is: " + matchBox.weightInInch);//0.0
 System.out.println("MatchBox Type is: " + matchBox.Type);//null
 
 MatchBox matchBox1=new MatchBox("Home",50);
 System.out.println("MatchBox1 brand is: " + matchBox1.brand);//Home
 System.out.println("MatchBox1 noOfStick is: " + matchBox1.noOfStick);//50
 System.out.println("MatchBox1 lengthInCm is: " + matchBox1.lengthInCm);//0.0
 System.out.println("MatchBox1 priceRs: " + matchBox1.priceRs); //0.0
 System.out.println("MatchBox1 size is: " + matchBox1.size);//null
 System.out.println("MatchBox1 weightInInch is: " + matchBox1.weightInInch);//0.0
 System.out.println("MatchBox1 Type is: " + matchBox1.Type);//null
 
 MatchBox matchBox2=new MatchBox("Home",50,4);
 System.out.println("MatchBox2 brand is: " + matchBox2.brand);//Home
 System.out.println("MatchBox2 noOfStick is: " + matchBox2.noOfStick);//50
 System.out.println("MatchBox2 lengthInCm is: " + matchBox2.lengthInCm);//4
 System.out.println("MatchBox2 priceRs: " + matchBox2.priceRs); //0.0
 System.out.println("MatchBox2 size is: " + matchBox2.size);//null
 System.out.println("MatchBox2 weightInInch is: " + matchBox2.weightInInch);//0.0
 System.out.println("MatchBox2 Type is: " + matchBox2.Type);//null
 
 MatchBox matchBox3=new MatchBox("Home",40,4,10);
 System.out.println("MatchBox3 brand is: " + matchBox3.brand);//Home
 System.out.println("MatchBox3 noOfStick is: " + matchBox3.noOfStick);//50
 System.out.println("MatchBox3 lengthInCm is: " + matchBox3.lengthInCm);//4
 System.out.println("MatchBox3 priceRs: " + matchBox3.priceRs); //20
 System.out.println("MatchBox3 size is: " + matchBox3.size);//null
 System.out.println("MatchBox3 weightInInch is: " + matchBox3.weightInInch);//0.0
 System.out.println("MatchBox3 Type is: " + matchBox3.Type);//null
 
 MatchBox matchBox4=new MatchBox("Home",50,4,20,"cubiod");
 System.out.println("MatchBox4 brand is: " + matchBox4.brand);//Home
 System.out.println("MatchBox4 noOfStick is: " + matchBox4.noOfStick);//50
 System.out.println("MatchBox4 lengthInCm is: " + matchBox4.lengthInCm);//4
 System.out.println("MatchBox4 priceRs: " + matchBox4.priceRs); //20
 System.out.println("MatchBox4 size is: " + matchBox4.size);//Square
 System.out.println("MatchBox4 weightInInch is: " + matchBox4.weightInInch);//0.0
 System.out.println("MatchBox4 Type is: " + matchBox4.Type);//null
 
 MatchBox matchBox5=new MatchBox("Home",60,2,10,"Square",40);
 System.out.println("MatchBox5 brand is: " + matchBox5.brand);//Home
 System.out.println("MatchBox5 noOfStick is: " + matchBox5.noOfStick);//50
 System.out.println("MatchBox5 lengthInCm is: " + matchBox5.lengthInCm);//0.0
 System.out.println("MatchBox5 priceRs: " + matchBox5.priceRs); //0.0
 System.out.println("MatchBox5 size is: " + matchBox5.size);//Square
 System.out.println("MatchBox5 weightInInch is: " + matchBox5.weightInInch);//40
 System.out.println("MatchBox5 Type is: " + matchBox5.Type);//null
 
 MatchBox matchBox6=new MatchBox("Home",50,4,20,"Square",40,"Strick");
 System.out.println("MatchBox6 brand is: " + matchBox6.brand);//Home
 System.out.println("MatchBox6 noOfStick is: " + matchBox6.noOfStick);//50
 System.out.println("MatchBox6 lengthInCm is: " + matchBox6.lengthInCm);//4
 System.out.println("MatchBox6 priceRs: " + matchBox6.priceRs); //20
 System.out.println("MatchBox6 size is: " + matchBox6.size);//Square
 System.out.println("MatchBox6 weightInInch is: " + matchBox6.weightInInch);//40
 System.out.println("MatchBox6 Type is: " + matchBox6.Type);//Strick
 
System.out.println("Ending main in MatchBoxStarter");


}
}