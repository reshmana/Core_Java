class HelmetStart{

public static void main(String [] args){

System.out.println("main method started...");

Helmet helmet=new Helmet("Sportgear");
System.out.println("Helmet brand is:"+helmet.Brand);
System.out.println("Helmet Visibility is:"+helmet.Visibility);
System.out.println("Helmet weight is:"+helmet.weight);
System.out.println("Helmet Size is:"+helmet.Size);
System.out.println("Helmet OuterShell is:"+helmet.OuterShell);

Helmet helmet1=new Helmet("Sportgear","BrightColour");
System.out.println("Helmet brand is:"+helmet1.Brand);
System.out.println("Helmet Visibility is:"+helmet1.Visibility);
System.out.println("Helmet weight is:"+helmet1.weight);
System.out.println("Helmet Size is:"+helmet1.Size);
System.out.println("Helmet OuterShell is:"+helmet1.OuterShell);

Helmet helmet2=new Helmet("Sportgear","BrightColour",100);
System.out.println("Helmet brand is:"+helmet2.Brand);
System.out.println("Helmet Visibility is:"+helmet2.Visibility);
System.out.println("Helmet weight is:"+helmet2.weight);
System.out.println("Helmet Size is:"+helmet2.Size);
System.out.println("Helmet OuterShell is:"+helmet2.OuterShell);

Helmet helmet3=new Helmet("Sportgear","BrightColour",100,"Circular");
System.out.println("Helmet brand is:"+helmet3.Brand);
System.out.println("Helmet Visibility is:"+helmet3.Visibility);
System.out.println("Helmet weight is:"+helmet3.weight);
System.out.println("Helmet Size is:"+helmet3.Size);
System.out.println("Helmet OuterShell is:"+helmet3.OuterShell);


Helmet helmet4=new Helmet("Sportgear","BrightColour",100,"Circular","Fibreglass");
System.out.println("Helmet brand is:"+helmet4.Brand);
System.out.println("Helmet Visibility is:"+helmet4.Visibility);
System.out.println("Helmet weight is:"+helmet4.weight);
System.out.println("Helmet Size is:"+helmet4.Size);
System.out.println("Helmet OuterShell is:"+helmet4.OuterShell);

System.out.println("main method ended...");
}





}