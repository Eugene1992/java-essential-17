package com.cbs.edu.examples.cw05;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        String value = "Hello";

        long alStart = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(value);
        }
        long alEnd = System.nanoTime();

        System.out.println("AL: " + (alEnd - alStart));

        long llStart = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(value);
        }
        long llEnd = System.nanoTime();

        System.out.println("LL: " + (llEnd - llStart));
    }
}
