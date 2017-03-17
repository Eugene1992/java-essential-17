package com.cbs.edu.hw09;

/**
 * Created by Vladimir on 17.03.2017.
 */
public class InvalidArray {
    public InvalidArray() {
    }

    /**
     * @param args Hello.
     */
    public static void main(String[] args) {
        try {
            int[] e = new int[-10];
        } catch (NegativeArraySizeException var2) {
            System.out.println(var2.getMessage());
            System.out.println(var2);
        }

    }
}
