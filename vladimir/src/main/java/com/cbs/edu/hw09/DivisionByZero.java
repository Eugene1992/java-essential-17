package com.cbs.edu.hw09;

/**
 * Created by Vladimir on 17.03.2017.
 */
public class DivisionByZero {
    public DivisionByZero() {
    }

    public static void main(String[] args) {
        byte a = 1;
        byte b = 2;

        try {
            int a1 = a / (b - 2);
            System.out.println(a1);
        } catch (ArithmeticException var4) {
            System.out.println("Обработка исключения:");
            System.out.println(var4.getMessage());
        }

    }
}
