package com.xworkz.abstraction.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AirPorts {
    public static void main(String[] args) {

        Collection<String> airPorts = new ArrayList<>();
        airPorts.add("Indira Gandhi International Airport");
        airPorts.add("Chhatrapati Shivaji Maharaj");
        airPorts.add("Kempegowda International Airport");
        airPorts.add("Chennai International Airpor");
        airPorts.add("Netaji Subhas Chandra Bose");
        airPorts.add("Rajiv Gandhi");
        airPorts.add("Cochin International Airport");
        airPorts.add("Sardar Vallabhbhai Pate");
        airPorts.add("Pune Airport ");
        airPorts.add("Jaipur International Airport");
        airPorts.add("Goa International Airpor");
        airPorts.add("agdogra Airpor");
        airPorts.add("Lokpriya Gopinath Bordoloi");
        airPorts.add("Thiruvananthapuram");
        airPorts.add("Biju Patnaik");
        airPorts.add("Calicut International Airport");
        airPorts.add("Srinagar International Airport ");
        airPorts.add("Visakhapatnam");
        airPorts.add("Chandigarh International Airport");
        airPorts.add("iruchirapall");
        airPorts.add("Devi Ahilya Bai Holkar ");
        airPorts.add("Mangalore ");
        airPorts.add("Rajkot Airpor");
        airPorts.add("Madurai Airport");
        airPorts.add("Vadodara Airport");
        airPorts.add("Vijayawada ");
        airPorts.add("Trichy International Airport ");
        airPorts.add("Jammu Airport");
        airPorts.add("Imphal ");
        airPorts.add("Silchar Airport");
        airPorts.add("Dibrugarh Airport");
        airPorts.add("Birsa Munda Airport");
        airPorts.add("Maharaja Bir Bikram Airport");
        airPorts.add("Lengpui Airport");
        airPorts.add("Lal Bahadur Shastri ");
        airPorts.add("Jharsuguda Airport");
        airPorts.add("Vijayanagar Airport ");
        airPorts.add("Dr. Babasaheb Ambedkar");
        airPorts.add("Gaya Airport");
        airPorts.add("Sheikh ul-Alam");
        airPorts.add("Kannur ");
        airPorts.add("Agatti Airport");
        airPorts.add("Rajahmundry Airport");
        airPorts.add("Chandrapur Airport");
        airPorts.add("Bir Tikendrajit ");
        airPorts.add("Veer Savarkar");
        airPorts.add("Diu Airport ");
        airPorts.add("Bilaspur Airport ");
        airPorts.add("Kadapa Airport");
        airPorts.add("Adampur Airport ");
        airPorts.add("Kazi Nazrul Islam Airport");
        airPorts.add("Jaisalmer Airport");
        airPorts.add("Adani ");
        airPorts.add("Adani Mangaluru");
        airPorts.add("Adani Jaipur ");
        airPorts.add("Heathrow Airport -");
        airPorts.add("Charles de Gaulle Airport ");
        airPorts.add("Dubai");
        airPorts.add("Beijing ");
        airPorts.add("Los Angeles ");
        airPorts.add("Incheon International Airport");
        airPorts.add("Frankfurt Airport");
        airPorts.add("Narita International Airport ");
        airPorts.add("Singapore Changi Airport");
        airPorts.add("Sydney Airport ");
        airPorts.add("O.R. Tambo");
        airPorts.add("Suvarnabhumi Airport");
        airPorts.add("Amsterdam Airport Schiphol -");
        airPorts.add("Hong Kong");
        airPorts.add("Hamad");
        airPorts.add("Leonardo da Vinci");
        airPorts.add("Istanbul Airport");
        airPorts.add("Dubai World Central ");
        airPorts.add("Vancouver");
        airPorts.add("Zurich Airport");
        airPorts.add("Sydney Kingsford Smith Airport ");
        airPorts.add("Abu Dhabi International Airport ");
        airPorts.add("Jomo Kenyatta");
        airPorts.add("El Dorado");
        airPorts.add("Shanghai Pudong ");
        airPorts.add("Ben Gurion Airport -");
        airPorts.add("Ninoy Aquino");
        airPorts.add("Kota Airport -");
        airPorts.add("Jalgaon Airport");
        airPorts.add("Keshod Airport ");
        airPorts.add("Mysuru Airport");
        airPorts.add("Lilabari Airport ");
        airPorts.add("Gaggal Airport");
        airPorts.add("Allahabad Airport");
        airPorts.add("Vancouver International Airport");
        airPorts.add("O'Hare International Airport");
        airPorts.add("Madrid-Barajas Adolfo Suárez Airport");
        airPorts.add("Hong Kong ");
        airPorts.add("Heathrow Airport");
        airPorts.add("Pearson");
        airPorts.add("Kuala Lumpur");
        airPorts.add("Incheon International Airport");
        airPorts.add("Hartsfield-Jackson Atlanta");
        airPorts.add("Dubai Al Maktoum ");
        airPorts.add("Munich Airport ");


        Iterator<String> itr=airPorts.iterator();
        while ((itr.hasNext())){
            String ref= itr.next();
            // System.out.println(ref);

            if(ref.toLowerCase().endsWith("o")){
                System.out.println("ends with o "+ref);
            }
            if(ref.endsWith("r")){
                System.out.println("ends with r "+ref);
            }
            if(ref.startsWith("b") || ref.endsWith("k")){
                System.out.println("Starting with b or end with k "+ref);
            }
            if(ref.length()<5) {
                System.out.println("having less than 5 characters "+ref);
            } else if (ref.length()>=5) {
                System.out.println("cutting of characters to length 5 "+ref.substring(0,5));
            }


            System.out.println(ref.toUpperCase());

        }


    }
}
