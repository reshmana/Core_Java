class Ornaments{

String brand;
String type;
int cost;
double weigth;
String item;

Ornaments(String brand)
{
System.out.println("Ornaments main created...");
this.brand=brand;	
}

Ornaments(String brand,String type)
{super();
System.out.println("Ornaments main created with double parameters");
this.brand=brand;
this.type=type;
}

Ornaments(String brand,String type,int cost)
{super();
System.out.println("Ornaments main created with 3 parameters");
this.brand=brand;
this.type=type;
this.cost=cost;
}

Ornaments(String brand,String type,int cost,double weigth)
{super();
System.out.println("Ornaments main created with 4 parameters");
this.brand=brand;
this.type=type;
this.cost=cost;
this.weigth=weigth;
}

Ornaments(String brand,String type,int cost,double weigth,String item)
{super();
System.out.println("Ornaments main created with 5 parameters");
this.brand=brand;
this.type=type;
this.cost=cost;
this.weigth=weigth;
this.item=item;
}
}