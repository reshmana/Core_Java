 class Showroom {
	String name;
	String type;
	int revenue;
	String ownername;
	long phoneno;
	long pin;
	String adress;
	int Noofworkers;
	
	Showroom(){
		System.out.println("magical world showroom innograted");
	}
	Showroom(String nm){
		name=nm;
		
	}
	Showroom(String nm,String tp){
		name=nm;
		type=tp;
	}
	Showroom(String nm,String tp,int rn){
		name=nm;
		type=tp;
		revenue=rn;
	}
	Showroom(String nm,String tp,int rn,String own){
		name=nm;
		type=tp;
		revenue=rn;
		ownername=own;
	}
	Showroom(String nm,String tp,int rn,String own,long ph){
		name=nm;
		type=tp;
		revenue=rn;
		ownername=own;
		phoneno=ph;
		
	}
	Showroom(String nm,String tp,int rn,String own,long ph,long pn){
		name=nm;
		type=tp;
		revenue=rn;
		ownername=own;
		phoneno=ph;
		pin=pn;	
	}
	Showroom(String nm,String tp,int rn,String own,long ph,long pn,String ad){
		name=nm;
		type=tp;
		revenue=rn;
		ownername=own;
		phoneno=ph;
		pin=pn;	
		adress=ad;
	}
	Showroom(String nm,String tp,int rn,String own,long ph,long pn,String ad,int Nw){
		name=nm;
		type=tp;
		revenue=rn;
		ownername=own;
		phoneno=ph;
		pin=pn;	
		adress=ad;
		Noofworkers=Nw;
	}
}