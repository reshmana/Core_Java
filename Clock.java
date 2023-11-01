class Clock{
String Type;
String Brand;
int Duration;
double weigth;
boolean quality;

Clock(String Type)
{
System.out.println("Racket main created...");
this.Type=Type;	
}

Clock(String Type,String Brand)
{super();
System.out.println("Racket main created with double parameters");
this.Type=Type;
this.Brand=Brand;
}

Clock(String Type,String Brand,int Duration)
{super();
System.out.println("Racket main created with 3 parameters");
this.Type=Type;
this.Brand=Brand;
this.Duration=Duration;
}

Clock(String Type,String Brand,int Duration,double Weigth)
{super();
System.out.println("Racket main created with 4 parameters");
this.Type=Type;
this.Brand=Brand;
this.Duration=Duration;
this.weigth=weigth;
}

Clock(String Type,String Brand ,int  Duration,double Weigth,boolean quality)
{super();
System.out.println("Racket main created with 5 parameters");
this.Type=Type;
this.Brand=Brand;
this.Duration=Duration;
this.weigth=weigth;
this.quality=quality;
}
}