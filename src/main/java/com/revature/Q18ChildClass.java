package com.revature;

public class Q18ChildClass extends Q18AbstractClassForMethods {

    public Q18ChildClass(String str) {
        this.str = str;
    }

    @Override
    boolean isUpperCase() {
        String upperString = str.toUpperCase();
        boolean isEqual = upperString.equals(str);
        if (isEqual) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    String convertLowerToUpper() {
        return str.toUpperCase();
    }

    @Override
     int convertToInt() {
         String str = "10";
         int halo;
         try {
             halo = Integer.parseInt(str);
         }catch (NumberFormatException n) {
             halo = 0;
         } return halo;
     }

   /* @Override
    public int convertToInt() {
        int num = 10;
        //since a string is scanned to add an integer to the string
        //type cast character by character
        for (int i = 0; i < str.length(); i++) {
            num = num +  str.charAt(i);
        }
        return num;
    }*/
}




