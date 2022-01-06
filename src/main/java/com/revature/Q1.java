package com.revature;

public class Q1 {

    public static void printBubbleSort(int[] numbers) {

        int len = numbers.length;
        int min;

        for (int i = 0; i < len; i++) {
            min = numbers[i];
            for (int j = i + 1; j < len; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }

        for (int number : numbers) {
            System.out.print(number + " ");

        }
    }
}


