package com.revature;

public class Q5 {

    static String substring(String str, int idx) {

        // Set up input array and output array
        char[] charArray = str.toCharArray();
        char[] substringArray = new char[idx];

        // Copy over substring
        for (int i = 0; i < idx; ++i) {
            substringArray[i] = charArray[i];
        }

        // Turn the substring into a String
        return new String(substringArray);
    }

    static String testString = "Master of Ice";

    public static void testSubstring(int idx) {
        System.out.println(substring(testString, idx));
    }
}
