package com.xworkz.objects.Runner;
import com.xworkz.objects.*;
public class SpoonRunner {
    public static void main(String... spec){

        System.out.println("Starting main in LensRunner");

        Lens lens=new Lens();
        lens.show("Lenskart",2,2999);
        String ref = lens.toString();
        System.out.println(ref);

        Lens lens1=new Lens();
        lens1.show("Freshlook ",2,999);
        String ref1 = lens1.toString();
        System.out.println(ref1);

        Locker locker=new Locker();
        locker.show("Digital",30000,"LG");
        String ref2=locker.toString();
        System.out.println(ref2);

        Locker locker1=new Locker();
        locker1.show("Locking",12000,"Mindcraft");
        String ref3=locker1.toString();
        System.out.println(ref3);

        Mic mic=new Mic();
        mic.show("Microphone",2500,"Shure");
        String ref4 = mic.toString();
        System.out.println(ref4);

        Mic mic1=new Mic();
        mic1.show("Microphone",3000,"AKG");
        String ref5 = mic1.toString();
        System.out.println(ref5);

        Heart heart=new Heart();
        heart.show("O+","RESHMA",false);
        String ref6=heart.toString();
        System.out.println(ref6);

        Heart heart1=new Heart();
        heart1.show("O-","RACHANA",true);
        String ref7=heart1.toString();
        System.out.println(ref7);

        Seed seed=new Seed();
        seed.show("sunflower","agro",100);
        String ref8=seed.toString();
        System.out.println(ref8);

        Seed seed1=new Seed();
        seed1.show("wheat","kasturi",50);
        String ref9=seed1.toString();
        System.out.println(ref9);

        Chain chain=new Chain();
        chain.show("twisted",300,15);
        String ref10=chain.toString();
        System.out.println(ref10);

        Chain chain1=new Chain();
        chain1.show("Straight",500,10);
        String ref11=chain1.toString();
        System.out.println(ref11);

        Rice rice=new Rice();
        rice.show("basmati rice",1500,25);
        String ref12=rice.toString();
        System.out.println(ref12);

        Rice rice1=new Rice();
        rice1.show("Sona rice",3200,100);
        String ref13=rice1.toString();
        System.out.println(ref13);

        Bowl bowl=new Bowl();
        bowl.show("yellow",6.3,15);
        String ref14=bowl.toString();
        System.out.println(ref14);

        Bowl bowl1=new Bowl();
        bowl1.show("gray",9,52);
        String ref15=bowl1.toString();
        System.out.println(ref15);

        Basket basket=new Basket();
        basket.show("Rounded",50,500);
        String ref16=basket.toString();
        System.out.println(ref16);

        Basket basket1=new Basket();
        basket1.show("Square",100,300);
        String ref17=basket1.toString();
        System.out.println(ref17);

        Bucket bucket=new Bucket();
        bucket.show(20,"Plastic",30);
        String ref18=bucket.toString();
        System.out.println(ref18);

        Bucket bucket1=new Bucket();
        bucket1.show(25,"Steel",40);
        String ref19=bucket1.toString();
        System.out.println(ref19);

        Geyser geyser=new Geyser();
        geyser.show("Vgaurd",5000,20);
        String ref20=geyser.toString();
        System.out.println(ref20);

        Geyser geyser1=new Geyser();
        geyser1.show("Crompton",7000,40);
        String ref21=geyser1.toString();
        System.out.println(ref21);

        Spoon spoon=new Spoon();
        spoon.show(6,"steel",300);
        String ref22=spoon.toString();
        System.out.println(ref22);

        Spoon spoon1=new Spoon();
        spoon1.show(50,"plastic",200);
        String ref23=spoon1.toString();
        System.out.println(ref23);

        Bandli bandli=new Bandli();
        bandli.show(20,"Steel","Silver");
        String ref24=bandli.toString();
        System.out.println(ref24);

        Bandli bandli1=new Bandli();
        bandli1.show(20,"Fabric","purple");
        String ref25=bandli1.toString();
        System.out.println(ref25);

        Money money=new Money();
        money.show("Rupee",10,5);
        String ref26=money.toString();
        System.out.println(ref26);

        Money money1=new Money();
        money1.show("Dollar",6,3);
        String ref27=money1.toString();
        System.out.println(ref27);

         Cotten cotten=new Cotten();
         cotten.show("Kasturi Cotton",2000,3);
           String ref28=cotten.toString();
        System.out.println(ref28);

        Cotten cotten1=new Cotten();
        cotten1.show("Ben martin Cotton",5000,5);
        String ref29=cotten.toString();
        System.out.println(ref29);

        System.out.println("Ending main in LensRunner");
    }
}

