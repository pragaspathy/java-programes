package com.sample;

import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {

        String name = "pragaspathy";
        String rev = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string: ");
        char a [] = name.toCharArray();
        int len = a.length;
        for (int i = len -1 ; i>=0 ; i--){
            rev = rev + a[i];
        }
        System.out.println(rev);
    }
}
