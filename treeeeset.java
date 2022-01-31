package com.sample;

import java.util.Iterator;
import java.util.TreeSet;

public class treeeeset {
    public static void main(String[] args) {

        TreeSet <Integer> treetutorial = new TreeSet<Integer>();
        treetutorial.add(55);
        treetutorial.add(51);
        treetutorial.add(82);
        treetutorial.add(50);
        treetutorial.add(51);
        treetutorial.add(59);
        treetutorial.add(60);
        treetutorial.add(60);

        System.out.println(treetutorial);

        System.out.println(treetutorial.first());

        System.out.println(treetutorial.last());

        System.out.println(treetutorial.headSet(51));

        System.out.println(treetutorial.tailSet(60));

        System.out.println(treetutorial.subSet ( 50,82));

        System.out.println("comparator" + treetutorial.comparator());

        System.out.println(treetutorial.higher(50));

        System.out.println(treetutorial.lower(60));

        System.out.println(treetutorial.pollFirst());

        System.out.println(treetutorial.pollLast());

        Iterator <Integer> pragas = treetutorial.iterator();
        while(pragas.hasNext()){
            System.out.println(pragas.next());
        }
        Iterator <Integer> pragaspathy = treetutorial.descendingIterator();
        while(pragaspathy.hasNext());
        System.out.println(pragaspathy);
    }
}
