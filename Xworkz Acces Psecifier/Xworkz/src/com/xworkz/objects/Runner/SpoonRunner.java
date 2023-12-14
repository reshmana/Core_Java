package com.xworkz.objects.Runner;
import com.xworkz.objects.classes.*;

public class SpoonRunner {
    public static void main(String... spec){

        System.out.println("Starting main in SpoonRunner");

        Lens lens=new Lens();
        lens.show("Lenskart",2,2999);
        String ref = lens.toString();
        System.out.println(ref);
        System.out.println("hashCode is"+lens.hashCode());

        Lens lens1=new Lens();
        lens1.show("Freshlook ",2,999);
        String ref1 = lens1.toString();
        System.out.println(ref1);
        System.out.println("hashcode is"+lens1.hashCode());

        Locker locker=new Locker();
        locker.show("Digital",30000,"LG");
        String ref2=locker.toString();
        System.out.println(ref2);
        System.out.println("hashcode is"+locker.hashCode());

        Locker locker1=new Locker();
        locker1.show("Locking",12000,"Mindcraft");
        String ref3=locker1.toString();
        System.out.println(ref3);
        System.out.println("hashcode is"+locker1.hashCode());

        Mic mic=new Mic();
        mic.show("Microphone",2500,"Shure");
        String ref4 = mic.toString();
        System.out.println(ref4);
        System.out.println("hashcode is"+mic.hashCode());

        Mic mic1=new Mic();
        mic1.show("Microphone",3000,"AKG");
        String ref5 = mic1.toString();
        System.out.println(ref5);
        System.out.println("hashcode is"+mic1.hashCode());

        Heart heart=new Heart();
        heart.show("O+","RESHMA",false);
        String ref6=heart.toString();
        System.out.println(ref6);
        System.out.println("hashcode is"+heart.hashCode());

        Heart heart1=new Heart();
        heart1.show("O-","RACHANA",true);
        String ref7=heart1.toString();
        System.out.println(ref7);
        System.out.println("hashcode is"+heart1.hashCode());

        Seed seed=new Seed();
        seed.show("sunflower","agro",100);
        String ref8=seed.toString();
        System.out.println(ref8);
        System.out.println("hashcode is"+seed.hashCode());

        Seed seed1=new Seed();
        seed1.show("wheat","kasturi",50);
        String ref9=seed1.toString();
        System.out.println(ref9);
        System.out.println("hashcode is"+seed1.hashCode());

        Chain chain=new Chain();
        chain.show("twisted",300,15);
        String ref10=chain.toString();
        System.out.println(ref10);
        System.out.println("hashcode is"+chain.hashCode());

        Chain chain1=new Chain();
        chain1.show("Straight",500,10);
        String ref11=chain1.toString();
        System.out.println(ref11);
        System.out.println("hashcode is"+chain1.hashCode());

        Rice rice=new Rice();
        rice.show("basmati rice",1500,25);
        String ref12=rice.toString();
        System.out.println(ref12);
        System.out.println("hashcode is"+rice.hashCode());

        Rice rice1=new Rice();
        rice1.show("Sona rice",3200,100);
        String ref13=rice1.toString();
        System.out.println(ref13);
        System.out.println("hashcode is"+rice1.hashCode());

        Bowl bowl=new Bowl();
        bowl.show("yellow",6.3,15);
        String ref14=bowl.toString();
        System.out.println(ref14);
        System.out.println("hashcode is"+bowl.hashCode());

        Bowl bowl1=new Bowl();
        bowl1.show("gray",9,52);
        String ref15=bowl1.toString();
        System.out.println(ref15);
        System.out.println("hashcode is"+bowl1.hashCode());

        Basket basket=new Basket();
        basket.show("Rounded",50,500);
        String ref16=basket.toString();
        System.out.println(ref16);
        System.out.println("hashcode is"+basket.hashCode());

        Basket basket1=new Basket();
        basket1.show("Square",100,300);
        String ref17=basket1.toString();
        System.out.println(ref17);
        System.out.println("hashcode is"+basket1.hashCode());

        Bucket bucket=new Bucket();
        bucket.show(20,"Plastic",30);
        String ref18=bucket.toString();
        System.out.println(ref18);
        System.out.println("hashcode is"+bucket.hashCode());

        Bucket bucket1=new Bucket();
        bucket1.show(25,"Steel",40);
        String ref19=bucket1.toString();
        System.out.println(ref19);
        System.out.println("hashcode is"+bucket1.hashCode());

        Geyser geyser=new Geyser();
        geyser.show("Vgaurd",5000,20);
        String ref20=geyser.toString();
        System.out.println(ref20);
        System.out.println("hashcode is"+geyser.hashCode());

        Geyser geyser1=new Geyser();
        geyser1.show("Crompton",7000,40);
        String ref21=geyser1.toString();
        System.out.println(ref21);
        System.out.println("hashcode is"+geyser1.hashCode());

        Spoon spoon=new Spoon();
        spoon.show(6,"steel",300);
        String ref22=spoon.toString();
        System.out.println(ref22);
        System.out.println("hashcode is"+spoon.hashCode());

        Spoon spoon1=new Spoon();
        spoon1.show(50,"plastic",200);
        String ref23=spoon1.toString();
        System.out.println(ref23);
        System.out.println("hashcode is"+spoon1.hashCode());

        Bandli bandli=new Bandli();
        bandli.show(20,"Steel","Silver");
        String ref24=bandli.toString();
        System.out.println(ref24);
        System.out.println("hashcode is"+bandli.hashCode());

        Bandli bandli1=new Bandli();
        bandli1.show(20,"Fabric","purple");
        String ref25=bandli1.toString();
        System.out.println(ref25);
        System.out.println("hashcode is"+bandli1.hashCode());

        Money money=new Money();
        money.show("Rupee",10,5);
        String ref26=money.toString();
        System.out.println(ref26);
        System.out.println("hashcode is"+money.hashCode());

        Money money1=new Money();
        money1.show("Dollar",6,3);
        String ref27=money1.toString();
        System.out.println(ref27);
        System.out.println("hashcode is"+money1.hashCode());

         Cotten cotten=new Cotten();
         cotten.show("Kasturi Cotton",2000,3);
           String ref28=cotten.toString();
        System.out.println(ref28);
        System.out.println("hashcode is"+cotten.hashCode());

        Cotten cotten1=new Cotten();
        cotten1.show("Ben martin Cotton",5000,5);
        String ref29=cotten.toString();
        System.out.println(ref29);
        System.out.println("hashcode is"+cotten1.hashCode());

        System.out.println("Ending main in Spoonrunner");
    }
}
