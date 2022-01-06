package com.revature;

public class Q13 {
    static void printTriangle() {
        char last = 'E';
        char first = 'A';
        for (int i = 1; i <= (last - 'A' + 1); ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(first + " ");
            }
            ++first;

            System.out.println();
        }
    }
}
