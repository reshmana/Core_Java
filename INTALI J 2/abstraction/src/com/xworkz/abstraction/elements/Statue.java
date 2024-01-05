package com.xworkz.abstraction.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Statue {

    public static void main(String[] args) {
        Collection<String> statue=new ArrayList<>();
        statue.add("Statue of Unity");
        statue.add("The Shiva Murudeshwar");
        statue.add("The Jose Rizal Monument");
        statue.add("The Great Buddha");
        statue.add("Shivaji Maharaj ");
        statue.add("Raja Rammohan Roy");
        statue.add("Subhas Chandra Bose");
        statue.add("Sri Aurobindo statue");
        statue.add("Jawaharlal Nehru statue ");
        statue.add("Bal Gangadhar Tilak ");
        statue.add("Mahatma Gandhi");
        statue.add("Lord Shiva and Parvati");
        statue.add("Veer Savarkar statue");
        statue.add("Mother India ");
        statue.add("Buddha statue ");
        statue.add("Shivaji Maharaj statue ");
        statue.add("Dhyana Buddha Statue");
        statue.add("Bahubali statue");
        statue.add("Murugan statue");
        statue.add("The Four Faces of Brahma ");
        statue.add("Adiyogi Shiva statue ");
        statue.add("Jatayu Earth's Center");
        statue.add("Dr. B.R. Ambedkar statue");
        statue.add("Maharana Pratap");
        statue.add("Bhagat Singh");
        statue.add("Swami Vivekananda");
        statue.add("Rani Padmini Palace ");
        statue.add("Aryabhata statue");
        statue.add("Rabindranath Tagore");
        statue.add("Basaveshwara statue ");
        statue.add("Laxman Jhula");
        statue.add("Manohar Parrikar");
        statue.add("Amma statue (J. Jayalalithaa)");
        statue.add("Chatrapati Shivaji ");
        statue.add("MGR Memorial ");
        statue.add("Mother Teresa statue ");
        statue.add("Veer Savarkar statue");
        statue.add("Sri Aurobindo statue");
        statue.add("Raja Rammohan Roy ");
        statue.add("Maharana Pratap");


        Iterator<String> itr=statue.iterator();
        while (itr.hasNext()){
            String ref= itr.next();
            if(ref.toLowerCase().endsWith("O")){
                System.out.println(ref);
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

        }
    }
}
