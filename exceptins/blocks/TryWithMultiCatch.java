package com.ideas.exceptins.blocks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TryWithMultiCatch {
    public void show() throws IOException {
        String str="Lets try";
        byte[] bytes;

        try{

            FileReader fileReader = new FileReader("C:\\Users\\Whynew.in\\IdeaProjects\\ideas\\src\\com\\xworkz\\product\\exception\\blocks\\sample.txt");
            System.out.println(fileReader.read());
            bytes=str.getBytes("utf");
            System.out.println(bytes);
        }

        catch(FileNotFoundException | UnsupportedEncodingException e){
            System.err.println("FileNotFoundException or UnsupportedEcncodingException");
            System.out.println(e);

        }
    }
}
