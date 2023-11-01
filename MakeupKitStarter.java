class MakeupKitStarter{
	public static void main(String []args){
		String[] makeupItems = {"liquid foundation", "concealer"};
		
		System.out.println("main mathod started in MakeupStarter");
	MakeupKit makeupKit=new MakeupKit("lakme");
	System.out.println("Brand of makeupKit is:"+makeupKit.Brand);
	System.out.println("expirydate of makeupKitis :"+makeupKit.ExpiryDate);
	System.out.println("MakeupKit rate :"+makeupKit.Rating);
	System.out.println("makeupKit items :"+makeupKit.Items);
	System.out.println("quality of makeupKit:"+makeupKit.quality);
	
	MakeupKit makeupKit1=new MakeupKit("lakme",10/2024);
	System.out.println("Brand of makeupKit is:"+makeupKit1.Brand);
	System.out.println("expirydate of makeupKit is :"+makeupKit1.ExpiryDate);
	System.out.println("MakeupKit rate :"+makeupKit1.Rating);
	System.out.println("makeupKit items :"+makeupKit1.Items);
	System.out.println("quality of makeupKit:"+makeupKit1.quality);
	
	MakeupKit makeupKit2=new MakeupKit("lakme",10/2024,makeupItems);
	System.out.println("Brand of makeupKit is:"+makeupKit2.Brand);
	System.out.println("expirydate of makeupKitis :"+makeupKit2.ExpiryDate);
	System.out.println("MakeupKit rate :"+makeupKit2.Rating);
	System.out.println("makeupKit items :"+makeupKit2.Items);
	System.out.println("quality of makeupKit:"+makeupKit2.quality);
	
	MakeupKit makeupKit3=new MakeupKit("lakme",10/2024,makeupItems,5);
	System.out.println("Brand of makeupKit is:"+makeupKit3.Brand);
	System.out.println("expirydate of makeupKitis :"+makeupKit3.ExpiryDate);
	System.out.println("MakeupKit rate :"+makeupKit3.Rating);
	System.out.println("makeupKit items :"+makeupKit3.Items);
	System.out.println("quality of makeupKit:"+makeupKit3.quality);
	
	MakeupKit makeupKit4=new MakeupKit("lakme",10/2024,makeupItems,5,true);
	System.out.println("Brand of makeupKit is:"+makeupKit4.Brand);
	System.out.println("expirydate of makeupKitis :"+makeupKit4.ExpiryDate);
	System.out.println("MakeupKit rate :"+makeupKit4.Rating);
	System.out.println("makeupKit items :"+makeupKit4.Items);
	System.out.println("quality of makeupKit:"+makeupKit4.quality);
	
	System.out.println("end mathod started in MakeupStarter");
	
	
	}
}