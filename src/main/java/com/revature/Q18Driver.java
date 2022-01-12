package com.revature;

import java.util.Scanner;

public class Q18Driver extends Q18ChildClass {

    public Q18Driver(String str) {
        super(str);
    }

    public static void main(String[] args) {

        String input;
        Q18ChildClass childClassInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide Word: ");
        while (true) {
            try {
                input = sc.nextLine();
                childClassInput = new Q18ChildClass(input);
                break;
            } catch (NumberFormatException n) {
                System.out.println("Invalid input ");
            }
        }
        boolean upperChecker = childClassInput.isUpperCase();
        if (upperChecker) {
            System.out.println(input + " -> Correct ");
        } else {
            System.out.println(input + " -> Incorrect ");
        }

        String lowerToUpper = childClassInput.convertLowerToUpper();
        System.out.println(input + " Converted to Uppercase -> " + lowerToUpper);



        int add10;
        add10 = childClassInput.convertToInt();
        int result = add10 + input.length();
        System.out.println("Size of  string + 10 = " + result);
    }


}
