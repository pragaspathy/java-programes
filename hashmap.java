package com.sample;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        //map is not child interface of collection and hence it is considered to be true collection
        //it repreesents data in key & values pairs
        //duplicates keys are not allowed
        // duplicates values are allowed
        // using a technique called hashing to store elements
        // only one null key is used
        // insertion oreder is not maintained
        //initial capacity is 16 and load factor 75
        // value of map can fetched using key

        HashMap<Integer , String> employeemap = new HashMap<Integer,String>();
        employeemap.put(1 , "pragas");
        employeemap.put(2 , "viji");
        employeemap.put(3 , "manoharan");
        employeemap.put(4 , "mohana");
        employeemap.put(5 , "dhanasekaran");
        employeemap.put(6 , "pragas");

        System.out.println(employeemap);

        HashMap<Integer , String> duplicatemap = new HashMap<Integer,String>();
        duplicatemap.putAll(employeemap);

        System.out.println(duplicatemap);
        duplicatemap.clear();
        System.out.println(duplicatemap);

        System.out.println(employeemap.containsKey(5));
        System.out.println(employeemap.containsValue("manoharan"));

        System.out.println(employeemap.clone());
        System.out.println(employeemap.isEmpty());

        System.out.println("to get keyvalues" + employeemap.keySet());
        System.out.println(employeemap.get(5));

        System.out.println(employeemap.values());
        System.out.println("entry set(full key and values)" + employeemap.entrySet());



    }
}
