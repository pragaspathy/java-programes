package com.pragas;

public class ternaryoperator {

    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        int max;

//        if (a>b) {
//            max = a;
//        }
//        else{
//            max = b;
//        }
//        System.out.println(max);

        max = (a > b) ? a : b;
        System.out.println(max);
    }
}
