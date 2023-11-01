class Wallet{

String Brand;
String Colour;
int Pockets;
int Capacity;
String Item;

Wallet(String Brand)
{
System.out.println("Wallet main created...");
this.Brand=Brand;	
}

Wallet(String Brand,String Colour)
{super();
System.out.println("Wallet main created with double parameters");
this.Brand=Brand;
this.Colour=Colour;
}

Wallet(String Brand,String Colour,int Pockets)
{super();
System.out.println("Wallet main created with 3 parameters");
this.Brand=Brand;
this.Colour=Colour;
this.Pockets=Pockets;
}

Wallet(String Brand,String Colour,int Pockets,int Capacity)
{super();
System.out.println("Wallet main created with 4 parameters");
this.Brand=Brand;
this.Colour=Colour;
this.Pockets=Pockets;
this.Capacity=Capacity;
}

Wallet(String Brand,String Colour,int Pockets,int Capacity,String Item)
{super();
System.out.println("Wallet main created with 5 parameters");
this.Brand=Brand;
this.Colour=Colour;
this.Pockets=Pockets;
this.Capacity=Capacity;
this.Item=Item;
}
}