package com.cbs.edu.hw09;

import java.util.Scanner;

/**
 * Created by Vladimir on 20.03.2017.
 */
public class Test {
    /**
     * @param args Hello.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        try {
            if (i < 5) {
                throw new TestException("Input number < 5");
            }
        } catch (TestException e) {
            e.printStackTrace();
        }
    }
}
