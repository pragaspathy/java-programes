package com.sample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import static java.util.ArrayList.*;


public class linkedlist_567 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedlist231 = new LinkedList<Integer>();
        linkedlist231.add(5);
        linkedlist231.add(5);
        linkedlist231.add(7);
        linkedlist231.add(5);
        linkedlist231.add(20);
        linkedlist231.add(5);
        linkedlist231.add(6);
        System.out.println(linkedlist231);

        linkedlist231.addFirst(1);    // add first
        System.out.println(linkedlist231);

        linkedlist231.addLast(65);
        System.out.println(linkedlist231);

        linkedlist231.removeFirst();
        System.out.println(linkedlist231);

        linkedlist231.removeLast();
        System.out.println(linkedlist231);

        linkedlist231.removeFirstOccurrence(5);
        System.out.println("remove first occurence" + linkedlist231);

        linkedlist231.removeLastOccurrence(6);
        System.out.println("remove last occurence" + linkedlist231);

        linkedlist231.get(2);
        System.out.println("getting index position value" + linkedlist231);

        linkedlist231.poll();
        System.out.println("poll(delete) first lelemet" + linkedlist231);

        linkedlist231.pollLast();
        System.out.println("poll last element " + linkedlist231);

        for (int pragasdd : linkedlist231) {
            System.out.println("for each loop " +pragasdd);
        }

        for (int i = 0 ; i < linkedlist231.size(); i++){
            System.out.println("for loop" + linkedlist231.get(i));
        }

        ListIterator < Integer> iterator564 = linkedlist231.listIterator();
        while (iterator564.hasNext()){
        System.out.println(iterator564.next());
        }

        Iterator <Integer> pragaspathy = linkedlist231.iterator();
        while (iterator564.hasNext()){
            System.out.println(iterator564.hasNext());
        }


    }
}
