package com.ideas.exceptins.blocks;

import java.io.FileReader;
import java.io.IOException;

public class TryWithFinally {
    public void show() throws IOException {
        FileReader fileReader=null;

        try{

            fileReader = new FileReader("C:\\Users\\Whynew.in\\IdeaProjects\\ideas\\src\\com\\xworkz\\product\\exception\\blocks\\sample.txt");
            System.out.println(fileReader.read());
            System.out.println("using try with finally");
        }

        finally {
            fileReader.close();

        }
    }
}
