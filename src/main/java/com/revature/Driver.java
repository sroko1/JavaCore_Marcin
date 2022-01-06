package com.revature;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.revature.Q8.*;

public class Driver {

    public static void main(String[] args) {

        Q1 meth = new Q1();
        Q4 f = new Q4();
        int [] array= { 1,0,5,6,3,2,3,7,9,8,4 };
        String str = "When the moons are united in darkness.";
        System.out.println("Sorted array is: ");
        Q1.printBubbleSort(array);

        System.out.println("********************");
        System.out.println("First 25  Fibonacci Digits are: ");
        Q2.print25FibonacciDigits(25);

        System.out.println("********************");
        System.out.println("Original String: " + str);
        Q3.reverseString(str);

        System.out.println("********************");
        System.out.println("Factorial from typed digit: ");
        System.out.println(Q4.computeFactorial(6));

        System.out.println("********************");
        System.out.println("Substring on picked index: ");
        Q5.testSubstring(2);


        Q7 employee1 = new Q7("Erick","Graveyard", 66);
        Q7 employee2  = new Q7("Nick","HR", 44);
        Q7 employee3 = new Q7("Monika","Security", 35);
        List<Q7> listEmployees = new ArrayList<>();
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        listEmployees.add(employee3);
        System.out.println("Unsorted List : " + listEmployees);
      // Collections.sort(listEmployees,  Q7.NameComparator);
        System.out.println("By Department" );
      // Collections.sort(listEmployees,  Q7.DepartmentComparator);
       Collections.sort(listEmployees,  Q7.AgeComparator);
        System.out.println(listEmployees);

        System.out.println("*******************************" + "\n" + "Prime digits from Array[100] are: ");
        Q9.printOnlyPrimesFrom100();

        System.out.println("*******************************" + "\n" + "Palindromes from ArrayList are: ");
        Q8.Palindrome();

        System.out.println("******************************" +  "\n" + "Q10 - BY Ternary Operators: ");
        Q10.byTernaryOperators();

        System.out.println("******************************" + "\n" + "Output from Q12 bellow: ");
        Q12.printArrayOf100();

        System.out.println("*******************************" + "\n" + "Console Triangle: ");
        Q13.printTriangle();

        System.out.println("********************************" + "\n"+ "Switch Demonstrator: ");
        Q14.displaying();







    }
}
