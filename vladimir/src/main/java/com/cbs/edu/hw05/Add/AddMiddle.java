package com.cbs.edu.hw05.add;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Vladimir on 02.03.2017.
 */
public class AddMiddle {
    /**
     * Add middle.
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        String value = "apple";
        String secondValue = "acer";
        for (int i = 0; i < 100; i++) {
            arrayList.add(secondValue);
            linkedList.add(secondValue);
        }

        long alStart = System.nanoTime();
        arrayList.add(5, value);
        long alEnd = System.nanoTime();
        System.out.println("al: " + (alEnd - alStart));

        long llStart = System.nanoTime();
        linkedList.add(5, value);
        long llEnd = System.nanoTime();
        System.out.println("ll: " + (llStart + llEnd));
    }
}

