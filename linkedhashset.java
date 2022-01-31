package com.sample;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
    public static void main(String[] args) {

        //insertion order maintained
        // duplicates not allowed
        // default capacity 16
        // load factor 75
        // can insert hetrogenous object if generics are allowed
        //

        Set linkedhashtest = new LinkedHashSet();
        linkedhashtest.add("q");
        linkedhashtest.add("e");
        linkedhashtest.add("x");
        linkedhashtest.add("x");
        linkedhashtest.add("w");
        linkedhashtest.add(5);

        System.out.println(linkedhashtest);


    }
}
