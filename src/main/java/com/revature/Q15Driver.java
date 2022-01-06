package com.revature;

public class Q15Driver extends Q15{
    public static void main(String[] args) {

        Q15 q15 = new Q15Driver();
       double digit1 = 7;
        double digit2 = 0;

        System.out.println(" Result of Addition: " + q15.addition(digit1, digit2));
        System.out.println(" Result of Subtraction: " + q15.subtraction(digit1, digit2));
        System.out.println(" Result of Multiplication: " + q15.multiplication(digit1, digit2));
        System.out.println(" Result of Division: " + q15.division(digit1, digit2));


    }
}
