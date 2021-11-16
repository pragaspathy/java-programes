package com.pragas;

import java.util.Scanner;

public class Mano {
    public static void main(String[] args) {
        String name = "pragspathy";
        System.out.println("my name");

        Scanner in = new Scanner(System.in);

        System.out.println("input a first number");
        int numb1 = in.nextInt();

        System.out.println("input a second number");
        int numb2 = in.nextInt();

        System.out.println("input a third number");
        int numb3 = in.nextInt();

        if (numb1 > numb2)
            if (numb1 > numb3)
                System.out.println(" the greatest number" + numb1);

            if (numb2 > numb1)
                if (numb2 > numb3)
                    System.out.println(" the greatest number" + numb2);

            if (numb3 > numb1)
                if (numb3 > numb2)
                    System.out.println(" the greatest number" + numb3);


        
    }
}