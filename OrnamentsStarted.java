class OrnamentsStarted{

public static void main(String[]args){

System.out.println("main method is started....");

Ornaments ornaments=new Ornaments("Tanishq");
 System.out.println(" brand of ornaments :"+ ornaments.brand);
 System.out.println(" type of ornaments :"+ ornaments.type);
 System.out.println(" cost of ornaments :"+ ornaments.cost);
 System.out.println(" weigth of ornaments :"+ ornaments.weigth);
 System.out.println(" item of ornaments :"+ ornaments.item);
 
 Ornaments ornaments1=new Ornaments("Tanishq","Symbol");
 System.out.println(" brand of ornaments :"+ ornaments1.brand);
 System.out.println(" type of ornaments :"+ ornaments1.type);
 System.out.println(" cost of ornaments :"+ ornaments1.cost);
 System.out.println(" weigth of ornaments :"+ ornaments1.weigth);
 System.out.println(" item of ornaments :"+ ornaments1.item);
 
 Ornaments ornaments2=new Ornaments("Tanishq","Symbol",20000);
 System.out.println(" brand of ornaments :"+ ornaments2.brand);
 System.out.println(" type of ornaments :"+ ornaments2.type);
 System.out.println(" cost of ornaments :"+ ornaments2.cost);
 System.out.println(" weigth of ornaments :"+ ornaments2.weigth);
 System.out.println(" item of ornaments :"+ ornaments2.item);
 
 Ornaments ornaments3=new Ornaments("Tanishq","Symbol",20000,10.5);
 System.out.println(" brand of ornaments :"+ ornaments3.brand);
 System.out.println(" type of ornaments :"+ ornaments3.type);
 System.out.println(" cost of ornaments :"+ ornaments3.cost);
 System.out.println(" weigth of ornaments :"+ ornaments3.weigth);
 System.out.println(" item of ornaments :"+ ornaments3.item);
 
 Ornaments ornaments4=new Ornaments("Tanishq","Symbol",20000,10.5,"Dimond");
 System.out.println(" brand of ornaments :"+ ornaments4.brand);
 System.out.println(" type of ornaments :"+ ornaments4.type);
 System.out.println(" cost of ornaments :"+ ornaments4.cost);
 System.out.println(" weigth of ornaments :"+ ornaments4.weigth);
 System.out.println(" item of ornaments :"+ ornaments4.item);

System.out.println("main method is ended....");
}
}