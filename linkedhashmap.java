package com.sample;

import java.util.LinkedHashMap;

public class linkedhashmap {
    public static void main(String[] args) {

        // linkedhasmap is maintained
        // insertion order is not maintained in in hashmap

        LinkedHashMap <String, String> heros = new LinkedHashMap<String, String>();
        heros.put("ajith" , "vijay");
        heros.put("vikram" , "surya");
        heros.put("simbhu" , "dhanush");
        heros.put("rajini" , "kamal");
        heros.put("laurence" , "vimal");
        heros.put("sivakarthikeyan" , "nelson");

        System.out.println(heros);
    }
}
