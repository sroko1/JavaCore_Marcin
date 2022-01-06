package com.revature;

public class Q15 implements Q15_Interface {


    @Override
    public double addition(double x, double y) {
        return x + y;
    }

    @Override
    public double subtraction(double x, double y) {
        return x - y;
    }

    @Override
    public double multiplication(double x, double y) {
        return x * y;
    }

    @Override
    public double division(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Dont think so!");
        }
        return x / y;
    }
}

