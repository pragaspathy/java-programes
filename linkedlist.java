package com.sample;
import java.util.Iterator;
import java.util.LinkedList;
public class linkedlist<S> {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(10);
        linkedList.add(15);
        int number1 = 0;
//        System.out.println("linked list :" + linkedList);
//
//
//        linkedList.addFirst(1);
//        System.out.println("linked list :" + linkedList);
//
//
//        linkedList.addLast(10);
//        System.out.println("linked list :" + linkedList);
//        System.out.println("add last : " + linkedList);
//
//        System.out.println("first value: " + linkedList.getFirst());
//        System.out.println("second value : " + linkedList.getLast());
//        System.out.println("getlast : " + linkedList);
//
//        System.out.println("indexing position value get: " + linkedList.get(2));
//
//        System.out.println("removing element first : " + linkedList.removeFirst());
//        System.out.println(linkedList);
//
//        System.out.println("removing element last : " + linkedList.removeLast());
//        System.out.println("remove first occurence: " + linkedList);
//
//        System.out.println("removing element: " + linkedList.poll());
//        System.out.println(linkedList);
//
//        System.out.println("removing last element : " + linkedList.pollLast());
//        System.out.println(linkedList);
//
//        linkedList.removeFirstOccurrence(2);
//        System.out.println(linkedList);

        for (int i= 0; i < linkedList.size(); i++) {
            System.out.println("elements is linked list are : " + linkedList.get(i));

            for (int number : linkedList){
                System.out.println("elements in string :" + number);
            }

        }
    }

    public void add(S pragaspathy) {
    }
}












//    LinkedList <Integer>linked_List = new LinkedList <Integer> ();
//        linkedList.add(1);
//                linkedList.add(2);
//                linkedList.add(3);
//                linkedList.add(4);
//                linkedList.add(5);
//                System.out.println("simple for loop :");
//                for (int index=0; index<linkedList.size() ; index++){
//        System.out.println("elements is linked list are : " + linkedList.get(index));


