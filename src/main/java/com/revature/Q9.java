package com.revature;

import java.util.ArrayList;

public class Q9 {

    public static void printOnlyPrimesFrom100() {


        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            digits.add(i);
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int digit) {
        boolean isDivisibleBySomething = false;

        for (int x = 2; x < digit; x++) {
            if (digit % x == 0) isDivisibleBySomething = true;
        }
        return !isDivisibleBySomething && (digit > 1);
    }

     /* public static boolean isPrime(int value) {


          if(value == 1 || value == 0) return false;
          if(value == 2) return true;


          if (value % 2 == 0) return false;

          for (int i = 3; i * i <= value; i += 2) {
              if (value % i == 0)
                  return false;
          }
          return true;

      }*/
}
