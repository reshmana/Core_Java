package com.samples;

import com.samples.association.Administative;
import com.samples.association.Librarian;
import com.samples.rules.CollageRule;
import com.samples.rules.LibraryRule;
import com.samples.rules.ReshmaRuleImpl;
import com.samples.rules.SonuRuleImpl;

public class CollageRunner {
    public static void main(String[] args) {
        CollageRule collageRule=new ReshmaRuleImpl();
        Administative administative=new Administative(collageRule);
         administative.principal();

        LibraryRule libraryRule=new SonuRuleImpl();
        Librarian librarian=new Librarian(libraryRule);
        librarian.lendBokks();
    }
}
