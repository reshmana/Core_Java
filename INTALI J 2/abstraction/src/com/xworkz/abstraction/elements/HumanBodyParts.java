package com.xworkz.abstraction.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HumanBodyParts {
    public static void main(String[] args) {

        Collection<String> humanparts=new ArrayList<>();
          humanparts.add("Haed");
          humanparts.add("Hair");
          humanparts.add("Fourhead");
          humanparts.add("Eyebrow");
          humanparts.add("Eyelases");
          humanparts.add("Eye");
          humanparts.add("Nose");
          humanparts.add("Cheek");
          humanparts.add("Ear");
          humanparts.add("Mouth");
          humanparts.add("Lip");
          humanparts.add("Tougue");
          humanparts.add("Teeth");
          humanparts.add("Jaw");
          humanparts.add("Chin");
          humanparts.add("Neck");
          humanparts.add("Throat");
          humanparts.add("Adam's apple");
          humanparts.add("Shoulder");
          humanparts.add("Arm");
          humanparts.add("Elbow");
          humanparts.add("Forearm");
          humanparts.add("Wrist");
          humanparts.add("Hand");
          humanparts.add("Finger");
          humanparts.add("palm");
          humanparts.add("Thumb");
          humanparts.add("Knuckle");
          humanparts.add("Index finger");
          humanparts.add("Middle finger");
          humanparts.add("Ring finger");
          humanparts.add("Little finger");
          humanparts.add("Chest");
          humanparts.add("Breast");
          humanparts.add("Ribcage");
          humanparts.add("Back");
          humanparts.add("Spine");
          humanparts.add("Navel");
          humanparts.add("Abdomen");
          humanparts.add("Waist");
          humanparts.add("Hips");
          humanparts.add("Thigh");
          humanparts.add("Knee");
          humanparts.add("Ankle");
          humanparts.add("Heel");
          humanparts.add("Foot");
          humanparts.add("Toe");
          humanparts.add("Sole");
          humanparts.add("Shin");
          humanparts.add("Calf");
          humanparts.add("Arch");
          humanparts.add("Instep");
          humanparts.add("Big toe");
          humanparts.add("Second toe");
          humanparts.add("Third toe");
          humanparts.add("Fourth toe");
          humanparts.add("Fifth toe");
          humanparts.add("Skin");
          humanparts.add("Heart");
          humanparts.add("Lungs");
          humanparts.add("Abdominal muscles");
          humanparts.add("Chest muscles");
          humanparts.add("Back muscles");
          humanparts.add("Neck muscles");
          humanparts.add("Shoulder joint");
          humanparts.add("Hip joint");
          humanparts.add("Ankle joint");
          humanparts.add("Elbow joint");
          humanparts.add("Knee joint");
          humanparts.add("Wrist joint");
          humanparts.add("Nails");


      Iterator<String> itr= humanparts.iterator();
      while (itr.hasNext()){
        String ref= itr.next();
        //System.out.println("Human body parts are :"+ref);
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
      }


    }
}
