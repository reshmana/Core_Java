class Company
{
	String name="Reshma";
	long gstNo=3243434;
	String location="Banglore";
	Job job;
	
	Company(Job job)
	{
		this.job=job;
	}
	
	void showInfo()
	{
		System.out.println("Name :"+this.name);
		System.out.println("GST Num :"+this.gstNo);
		System.out.println("Location :"+this.location);
		System.out.println("JOb :"+this.job);
		if(this.job!=null)
		{
			System.out.println("Role :"+this.job.role);
			System.out.println("Salary :"+this.job.salary);
			System.out.println("Type :"+this.job.type);
		}
	}
	
}