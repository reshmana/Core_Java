package com.ideas.exceptins.blocks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TryWithMultiCatchFinally {
    public void show() throws IOException {
        String str="Lets try";
        byte[] bytes;

        try{

            FileReader fileReader = new FileReader("C:\\Users\\Whynew.in\\IdeaProjects\\ideas\\src\\com\\xworkz\\reshma\\exception\\blocks\\sample.txt");
            System.out.println(fileReader.read());
            bytes=str.getBytes("resh");
            System.out.println(bytes);
        }

        catch(FileNotFoundException | UnsupportedEncodingException e){
            System.err.println("FileNotFoundException or UnsupportedEcncodingException");
            System.out.println(e);

        }

        finally {
            System.out.println("running finally with try and multi catch");

        }
    }
}
