package com.sample;

import java.util.TreeMap;

public class treemap {
    public static void main(String[] args) {
        // treemap is implementation class od map
        // duplicates keys are not allowed but duplicated values are allowed
        // null key is not allowed
        // the elements will be reterived in natural sirting order

        TreeMap<String,String> tgfr = new TreeMap<String,String>();

        tgfr.put("tiger" , "lion");
        tgfr.put("girafee" ,"lion");
        tgfr.put("bull" ,"lion");
        tgfr.put("cow" ,"lion");
        tgfr.put("rabiddd" ,"lion");

        tgfr.put("rabid" ,"lion");
        tgfr.put("rabid" ,"pragaspathy");
        tgfr.put("rabid" ,"lion55");
        //tgfr.put(null ,"abc");
        System.out.println(tgfr);
        System.out.println(tgfr.entrySet());
        System.out.println(tgfr);
    }
}
