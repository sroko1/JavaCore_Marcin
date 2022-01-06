package com.revature;

public class Q2 {

    public static void print25FibonacciDigits(int d) {

        int f1 = 0;
        int f2 = 1;
        int i;

        if (d < 1)
            return;
        System.out.println(f1 + " ");
        for (i = 1; i < d; i++) {
            System.out.println(f2 + " ");
            int next = f1 + f2;
            f1 = f2;
            f2 = next;
        }

    }


}
