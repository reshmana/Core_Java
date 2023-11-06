class Main
{
	public static void main(String[] args)
	{
		
		System.out.println("Starting in Main");
		System.out.println("----------------------");
	    System.out.println("========1.Tv==========");
		
		Speaker speaker=new Speaker(100);
		
		Tv tv=new Tv(speaker);
		tv.showInfo();
		
		System.out.println("=========2.Hotel=======");	
		
		MenuCard menu=new MenuCard();
		menu.setMenuCard(10,100.0);
		
		Hotel hotel=new Hotel();
		hotel.setMethod1(menu);
		
		hotel.showInfo();
		
		System.out.println("=========3.Company=======");

		Job job=new Job();
		Company company=new Company(job);
		company.showInfo();
		
		System.out.println("=========4.Clinic=======");
		
		Doctor doctor;
		doctor=new Doctor();
		
		Clinic clinic;
		clinic=new Clinic(doctor);
		
		clinic.displayInfo();
		System.out.println("----------------------");
		System.out.println("Ending in Main");
		
	}
}