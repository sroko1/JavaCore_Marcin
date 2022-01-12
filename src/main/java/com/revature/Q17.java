package com.revature;

import java.util.ArrayList;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {

        ArrayList<String> data = dataFromScanner();
        double rate = Double.parseDouble(data.get(1));
        double principal = Double.parseDouble(data.get(1));
        int time = Integer.parseInt(data.get(2));
        double interest = principal * rate * time;

        System.out.println("Total Interest: " + interest + "Euro ");

    }


    static ArrayList<String> dataFromScanner() {

        double interest;
        double principal;
        int numYears;

        ArrayList<String> data = new ArrayList<>();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println("Provide Rate of Interest: ");
        while (true) {
            try {
                interest = Double.parseDouble(input1.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Make sure You are providing a digit");
            }
        }
        String interestStr = Double.toString(interest);
        data.add(interestStr);

        System.out.println(" Provide Your Principal");
        while (true) {
            try {
                principal = Double.parseDouble(input2.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Input must be a digit");
            }
        }
        String principalStr = Double.toString(principal);
        data.add(principalStr);

        System.out.println(" Provide number of Years");
        while (true) {
            try {
                numYears = Integer.parseInt(input3.nextLine());
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Digits only!");
            }
        }
        String numbYearStr = Integer.toString(numYears);
        data.add(numbYearStr);
        return data;
    }

}





