class KeyChainStart{

public static void main(String [] args){

System.out.println("main method started...");

KeyChain keyChain=new KeyChain("Honda");
System.out.println("KeyChain brand is:"+keyChain.Brand);
System.out.println("KeyChain UserName is:"+keyChain.UserName);
System.out.println("KeyChain length is:"+keyChain.length);
System.out.println("KeyChain Password is:"+keyChain.Password);
System.out.println("KeyChain Shape is:"+keyChain.Shape);

KeyChain keyChain1=new KeyChain("Honda","Reshma");
System.out.println("KeyChain brand is:"+keyChain1.Brand);
System.out.println("KeyChain UserName is:"+keyChain1.UserName);
System.out.println("KeyChain length is:"+keyChain1.length);
System.out.println("KeyChain Password is:"+keyChain1.Password);
System.out.println("KeyChain Shape is:"+keyChain1.Shape);

KeyChain keyChain2=new KeyChain("Honda","Reshma",10);
System.out.println("KeyChain brand is:"+keyChain2.Brand);
System.out.println("KeyChain UserName is:"+keyChain2.UserName);
System.out.println("KeyChain length is:"+keyChain2.length);
System.out.println("KeyChain Password is:"+keyChain2.Password);
System.out.println("KeyChain Shape is:"+keyChain2.Shape);

KeyChain keyChain3=new KeyChain("Honda","Reshma",10,"reshma@123");
System.out.println("KeyChain brand is:"+keyChain3.Brand);
System.out.println("KeyChain UserName is:"+keyChain3.UserName);
System.out.println("KeyChain length is:"+keyChain3.length);
System.out.println("KeyChain Password is:"+keyChain3.Password);
System.out.println("KeyChain Shape is:"+keyChain3.Shape);

KeyChain keyChain4=new KeyChain("Honda","Reshma",10,"reshma@123","Rectangle");
System.out.println("KeyChain brand is:"+keyChain4.Brand);
System.out.println("KeyChain UserName is:"+keyChain4.UserName);
System.out.println("KeyChain length is:"+keyChain4.length);
System.out.println("KeyChain Password is:"+keyChain4.Password);
System.out.println("KeyChain Shape is:"+keyChain4.Shape);

System.out.println("main method ended...");


}

}