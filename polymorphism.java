package com.sample;

public class polymorphism {

    int add (int n1 , int n2){
        return n1 + n2;
    }

    int add (int n1, int n2 , int n3){
        return n1 + n2 + n3;
    }

    int add (int n1 , int n2 , int n3, int n4){
        return n1 + n2 + n3 + n4;
    }
    public static void main(String[] args) {

        polymorphism obj1 = new polymorphism();
        obj1.add(5,8);
        System.out.println(obj1.add(5,2,3,98));
        System.out.println(obj1.add(45,78797));
    }
}