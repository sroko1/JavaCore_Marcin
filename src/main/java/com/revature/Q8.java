package com.revature;

import java.util.ArrayList;
import java.util.Arrays;

public class Q8 {

   static void Palindrome() {
        ArrayList<String> empty = new ArrayList<>();
        empty.add("karan");
        empty.add("madam");
        empty.add("tom");
        empty.add("civic");
        empty.add("radar");
        empty.add("sexes");
        empty.add("jimmy");
        empty.add("kayak");
        empty.add("john");
        empty.add("refer");
        empty.add("billy");
        empty.add("did");

        ArrayList<String> withPalindromesOnly = new ArrayList<>();
        for (String p : empty) {
            if (isPalindrome(p)) {
                withPalindromesOnly.add(p);
            }
        }
        for (String p : empty) {
          //  System.out.println(p + " ");
        }
        for (String p : withPalindromesOnly) {
            System.out.print(p + " ");
        }
    }

    static boolean isPalindrome(String value) {
        boolean isPalindrome = true;
        for (int i = 0, j = value.length() - 1; i < j; i++, j--) {
            if (value.charAt(i) != value.charAt(j)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

}

