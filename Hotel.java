class Hotel
{
	String name;
	String ownerName;
	MenuCard menucard;
	
	
	void setMethod1(MenuCard menucard)
	{
		this.menucard=menucard;
	}
	
	void showInfo()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Owner Name :"+this.ownerName);
		System.out.println("Menu Card :"+this.menucard);
		if(this.menucard!=null)
		{
			System.out.println("Total Items :"+this.menucard.totalItems);
			System.out.println("Cost :"+this.menucard.cost);
		}
	}
}