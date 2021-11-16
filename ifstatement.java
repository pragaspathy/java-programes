package com.pragas;

import java.util.Scanner;

public class ifstatement {
    public static void main(String[] args) {


        Scanner name = new Scanner(System.in);
        System.out.println("input a number :");
        int input = name.nextInt();

        if (input > 0)
        {
            System.out.println("number is positive");
        }

        else if (input < 0)
        {
            System.out.println("number is negative");
        }
        else
        {
            System.out.println("number is zero");
        }
    }
}
