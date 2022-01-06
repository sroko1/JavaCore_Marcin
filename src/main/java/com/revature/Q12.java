package com.revature;

public class Q12 {
   static void printArrayOf100() {
        int[]arr = new int[100];
        for (int i = 0; i< arr.length; i++) {
            arr[i] = i+1;

        }
        for (int even:arr) {
            if (even % 2 == 0) {
                System.out.println("Even Digits: " + even);
            }
        }

   }
    static void  printArray(int[] arr) {
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
