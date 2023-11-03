class Placement {
     String companyName;
     String jobTitle;
     int salary;
     String location;
     int year;
     String jobDescription;
     boolean isFullTime;
     boolean isInternship;
     boolean isRemote;
     String department;
     String supervisor;
     String benefits;

    public Placement(String companyName, String jobTitle, int salary, String location, int year, String jobDescription, boolean isFullTime, boolean isInternship, boolean isRemote, String department, String supervisor, String benefits) {
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.location = location;
        this.year = year;
        this.jobDescription = jobDescription;
        this.isFullTime = isFullTime;
        this.isInternship = isInternship;
        this.isRemote = isRemote;
        this.department = department;
        this.supervisor = supervisor;
        this.benefits = benefits;
    }
	
	void displayInfo(){
		System.out.println("Started displayInfo");
		System.out.println(this.companyName);
		System.out.println(this.jobTitle);
		System.out.println(this.salary );
		System.out.println(this.location);
		System.out.println(this.year);
		System.out.println(this.jobDescription );
		System.out.println(this.isFullTime);
		System.out.println(this.isInternship );
		System.out.println(this.isRemote );
		System.out.println(this.department);
		System.out.println(this.supervisor );
		System.out.println(this.benefits );
		System.out.println("Ended displayInfo");
		
	}
}






