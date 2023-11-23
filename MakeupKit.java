class MakeupKit
{
String Brand;
long ExpiryDate;
int Rating;
String[]Items;
boolean quality;

MakeupKit(String Brand)
{super();
System.out.println("MakeupKit is started:"+Brand);
this.Brand=Brand;

}
MakeupKit(String Brand,long ExpiryDate)
{super();
System.out.println("MakeupKit is started double parameters");
this.Brand=Brand;
this.ExpiryDate=ExpiryDate;
}
MakeupKit(String Brand,long ExpiryDate,int Rting)
{super();
System.out.println("MakeupKit is started with 3 parameters");
this.Brand=Brand;
this.ExpiryDate=ExpiryDate;
this.Items=Items;
}
MakeupKit(String Brand,long ExpiryDate,String[]Items,int Rating)
{super();	
System.out.println("MakeupKit is started with 4 parameters");
this.Brand=Brand;
this.ExpiryDate=ExpiryDate;
this.Items=Items;
this.Rating= Rating;

}
MakeupKit(String Brand,long ExpiryDate,String[]Items,int Rating,boolean quality)
{super();	
System.out.println("MakeupKit is started with 5 parameters");
this.Brand=Brand;
this.ExpiryDate=ExpiryDate;
this.Items=Items;
this.Rating= Rating;
this.quality=quality;
}
}


