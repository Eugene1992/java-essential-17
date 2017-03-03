package com.cbs.edu.hw05.add;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Vladimir on 02.03.2017.
 */
public class AddStart {
    /**
     * Add start.
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        String value = "apple";
        for (int i = 0; i < 100; i++) {
            arrayList.add(0, value);
            linkedList.add(0, value);
        }

        long alStart = System.nanoTime();
        long alEnd = System.nanoTime();
        System.out.println("al: " + (alEnd - alStart));

        long llStart = System.nanoTime();
        long llEnd = System.nanoTime();
        System.out.println("ll: " + (llEnd - llStart));
    }
}
