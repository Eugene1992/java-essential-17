package com.cbs.edu.hw09;

/**
 * Created by Vladimir on 17.03.2017.
 */
public class NonExistentElement {
    public NonExistentElement() {
    }

    /**
     * @param args Hello.
     */
    public static void main(String[] args) {
        try {
            String[] e = new String[]{"Mersedes", "Skoda", "Opel"};
            System.out.println(e[5]);
        } catch (ArrayIndexOutOfBoundsException var2) {
            System.out.println("Non-existent element : " + var2.getMessage());
        }
    }
}
