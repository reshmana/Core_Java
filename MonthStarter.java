class MonthStarter{

     public static void main(String []days){
	 
	 System.out.println("Starting main method MonthStarter");
	 
	Month month=new Month("jan",31,4,6);
	  month.displayInfo();
	  
	Month month1=new Month("feb",28,4,4);
	  month1.displayInfo();
	  
    Month month2=new Month("mar",30,4,7);
	  month2.displayInfo();
	  
	Month month3=new Month("april",31,4,5);
	  month3.displayInfo();
	  
    Month month4=new Month("may",30,4,4);
	  month4.displayInfo();
	  
	Month month5=new Month("jun",31,4,5);
	  month5.displayInfo();
	  
	Month month6=new Month("july",30,4,6);
	  month6.displayInfo();
	  
	Month month7=new Month("aug",31,4,5);
	  month7.displayInfo();
	  
    Month month8=new Month("sep",31,4,7);
	  month8.displayInfo();
	  
	Month month9=new Month("oct",31,4,4);
	  month9.displayInfo();
	  
	Month month10=new Month("nov",30,4,6);
	  month10.displayInfo();
	  
	Month month11=new Month("Dec",31,4,4);
	  month11.displayInfo();
	 
	 System.out.println("Ending  main method MonthStarter"); 
	 }
}