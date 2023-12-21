package com.samples.association;

import com.samples.rules.LibraryRule;

public class Librarian {

    private LibraryRule libraryRule;

    public  Librarian(LibraryRule libraryRule){
        this.libraryRule=libraryRule;

    }
    public   void lendBokks(){

        boolean silence =libraryRule.KeepSilence();
        String memberid=libraryRule.MemberId();
        if(silence && memberid !=null){
            System.out.println(" allow memberid "+memberid);
        }
        System.err.println("not allowed");
    }
}
