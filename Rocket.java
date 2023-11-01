class Rocket{

String Brand;
int Cost;
String Balance;
double Weigth;
boolean Flexibility;

Rocket(String Brand)
{
System.out.println("Racket main created...");
this.Brand=Brand;	
}

Rocket(String Brand,int Cost)
{super();
System.out.println("Racket main created with double parameters");
this.Brand=Brand;
this.Cost=Cost;
}

Rocket(String Brand,int Cost,String Balance)
{super();
System.out.println("Racket main created with 3 parameters");
this.Brand=Brand;
this.Cost=Cost;
this.Balance=Balance;
}

Rocket(String Brand,int Cost,String Balance,double Weigth)
{super();
System.out.println("Racket main created with 4 parameters");
this.Brand=Brand;
this.Cost=Cost;
this.Balance=Balance;
this.Weigth=Weigth;
}

Rocket(String Brand,int Cost,String Balance,double Weigth,boolean Flexibility)
{super();
System.out.println("Racket main created with 5 parameters");
this.Brand=Brand;
this.Cost=Cost;
this.Balance=Balance;
this.Weigth=Weigth;
this.Flexibility=Flexibility;
}
}