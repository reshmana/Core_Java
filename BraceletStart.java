class BraceletStart{

public static void main(String [] args){

System.out.println("main method started...");

Bracelet bracelet=new Bracelet("gemstones");
System.out.println("bracelet brand is:"+bracelet.Matetrial);
System.out.println("bracelet UserName is:"+bracelet.Design);
System.out.println("bracelet length is:"+bracelet.weigth);
System.out.println("bracelet Password is:"+bracelet.Size);
System.out.println("bracelet Shape is:"+bracelet.Porpose);


Bracelet bracelet1=new Bracelet("gemstones","tennis bracelets");
System.out.println("bracelet brand is:"+bracelet1.Matetrial);
System.out.println("bracelet UserName is:"+bracelet1.Design);
System.out.println("bracelet length is:"+bracelet1.weigth);
System.out.println("bracelet Password is:"+bracelet1.Size);
System.out.println("bracelet Shape is:"+bracelet1.Porpose);


Bracelet bracelet2=new Bracelet("gemstones","tennis bracelets",50);
System.out.println("bracelet brand is:"+bracelet2.Matetrial);
System.out.println("bracelet UserName is:"+bracelet2.Design);
System.out.println("bracelet length is:"+bracelet2.weigth);
System.out.println("bracelet Password is:"+bracelet2.Size);
System.out.println("bracelet Shape is:"+bracelet2.Porpose);


Bracelet bracelet3=new Bracelet("gemstones","tennis bracelets",50,"comfortably fit");
System.out.println("bracelet brand is:"+bracelet3.Matetrial);
System.out.println("bracelet UserName is:"+bracelet3.Design);
System.out.println("bracelet length is:"+bracelet3.weigth);
System.out.println("bracelet Password is:"+bracelet3.Size);
System.out.println("bracelet Shape is:"+bracelet3.Porpose);


Bracelet bracelet4=new Bracelet("gemstones","tennis bracelets",50,"comfortably fit","wristwatches ");
System.out.println("bracelet brand is:"+bracelet4.Matetrial);
System.out.println("bracelet UserName is:"+bracelet4.Design);
System.out.println("bracelet length is:"+bracelet4.weigth);
System.out.println("bracelet Password is:"+bracelet4.Size);
System.out.println("bracelet Shape is:"+bracelet4.Porpose);

System.out.println("main method ...");

}
}