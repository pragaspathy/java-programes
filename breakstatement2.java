package com.pragas;

public class breakstatement2 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 3; j++) {
                if (j == 2 && i == 4) {
                    break;

                }
                System.out.println(i);
                //System.out.println(j);
            }
        }
    }
}
