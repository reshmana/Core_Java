class WalletStart{

public static void main(String[]args){

System.out.println("main method is started....");

Wallet wallet=new Wallet("Levis");
System.out.println("Brand of wallet is :"+wallet.Brand);
System.out.println("Brand of wallet is :"+wallet.Colour);
System.out.println("Brand of wallet is :"+wallet.Pockets);
System.out.println("Brand of wallet is :"+wallet.Capacity);
System.out.println("Brand of wallet is :"+wallet.Item);

Wallet wallet1=new Wallet("Levis","Brown");
System.out.println("Brand of wallet is :"+wallet1.Brand);
System.out.println("Brand of wallet is :"+wallet1.Colour);
System.out.println("Brand of wallet is :"+wallet1.Pockets);
System.out.println("Brand of wallet is :"+wallet1.Capacity);
System.out.println("Brand of wallet is :"+wallet1.Item);

Wallet wallet2=new Wallet("Levis","Brown",5);
System.out.println("Brand of wallet is :"+wallet2.Brand);
System.out.println("Brand of wallet is :"+wallet2.Colour);
System.out.println("Brand of wallet is :"+wallet2.Pockets);
System.out.println("Brand of wallet is :"+wallet2.Capacity);
System.out.println("Brand of wallet is :"+wallet2.Item);

Wallet wallet3=new Wallet("Levis","Brown",5,10);
System.out.println("Brand of wallet is :"+wallet3.Brand);
System.out.println("Brand of wallet is :"+wallet3.Colour);
System.out.println("Brand of wallet is :"+wallet3.Pockets);
System.out.println("Brand of wallet is :"+wallet3.Capacity);
System.out.println("Brand of wallet is :"+wallet3.Item);

Wallet wallet4=new Wallet("Levis","Brown",5,10,"money");
System.out.println("Brand of wallet is :"+wallet4.Brand);
System.out.println("Brand of wallet is :"+wallet4.Colour);
System.out.println("Brand of wallet is :"+wallet4.Pockets);
System.out.println("Brand of wallet is :"+wallet4.Capacity);
System.out.println("Brand of wallet is :"+wallet4.Item);

System.out.println("main method is ended....");
}
}