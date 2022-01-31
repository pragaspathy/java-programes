package com.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import static java.util.ArrayList.*;

public class arraylist321 {
    public static void main(String[] args) {

        ArrayList <String> arrayList_1 = new ArrayList<String>();
        arrayList_1.add("pragaspathy");
        arrayList_1.add("rangeetha");
        arrayList_1.add("vijij");
        arrayList_1.add("manoharan");
        arrayList_1.add("mohana");
        arrayList_1.add("dhanasekaran");
        arrayList_1.add("dhanasekaran");


        System.out.println(arrayList_1);
        arrayList_1.set(0,"pragas");

        System.out.println(arrayList_1);
        System.out.println("first index of :" + arrayList_1.indexOf("dhanasekaran"));
        System.out.println("last index of :" + arrayList_1.lastIndexOf("mohana"));
        arrayList_1.remove(0);
        System.out.println("remove method : " + arrayList_1);
        arrayList_1.remove("manoharan");
        System.out.println(arrayList_1);

        ArrayList <String> anotherlist = new ArrayList<>();
        anotherlist.addAll(arrayList_1);
        System.out.println(anotherlist);
        anotherlist.clear();
        System.out.println(anotherlist);
        arrayList_1.remove("dhanasekaran");
        System.out.println(arrayList_1);
        arrayList_1.add(null);
        System.out.println(arrayList_1);
        System.out.println(arrayList_1.isEmpty()); //is empty

        //iterator
        for (String test1 : arrayList_1){
            System.out.println("for each loop;" + test1);
        }
        System.out.println("-----------------------------------");
        for (int i = 0 ; i < arrayList_1.size(); i++){
            System.out.println("for loopp ;" + arrayList_1.get(i));
        }

        System.out.println("--------------------------------------");
        ListIterator <String> iterator = arrayList_1.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("-------------------------------------");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        System.out.println("-------------------------------------");
        Iterator<String> iterator09 = arrayList_1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());


        }
    }
}
