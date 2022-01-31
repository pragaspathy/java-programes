package com.sample;

import java.util.HashSet;
import java.util.Iterator;

public class setcollection {
    public static void main(String[] args) {

        HashSet <String> hashsett = new HashSet <String> ();
        hashsett.add("h");
        hashsett.add("b");
        hashsett.add("c");
        hashsett.add("x");
        hashsett.add("e");
        hashsett.add("f");
        hashsett.add("f");
        hashsett.add(null);
        System.out.println(hashsett);

        System.out.println(hashsett.contains("h"));
        Iterator <String> newiterator = hashsett.iterator();
        while (newiterator.hasNext()){
            System.out.println(newiterator.next());
        }

    }
}