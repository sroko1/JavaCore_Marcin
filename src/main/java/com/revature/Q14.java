package com.revature;

import java.time.LocalDate;

public class Q14 {

    static void displaying() {
        enum Type{
            A, B, C;
        }
        int digit = 45;
        LocalDate date = LocalDate.now();
        Type type = Type.B;

        switch (type) {
            case A:
                System.out.println("Square root of Digit: " + digit + Math.sqrt(digit));
                break;
            case B:
                System.out.println("Today’s date: " + date);
                break;
            case C:
                String sentence = "I am learning Java Core";
               String[] spSentence = sentence.split("");
                printStringArr(spSentence);


        }
    }
    static void printStringArr(String[]arr) {
        for (int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + "");
        }
        System.out.println();
    }
}
