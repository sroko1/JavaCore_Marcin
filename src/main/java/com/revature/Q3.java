package com.revature;

public class Q3 {

    public static void reverseString(String str) {
        String strNew = "";
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            strNew = c + strNew;
        }
        System.out.println("Reversed word: " + strNew);
    }
}

