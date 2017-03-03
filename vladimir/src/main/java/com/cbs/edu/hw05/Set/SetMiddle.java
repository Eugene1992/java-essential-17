package com.cbs.edu.hw05.set;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Vladimir on 03.03.2017.
 */
public class SetMiddle {
    /**
     * Set Middle.
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        String value = "apple";
        String secondValue = "acer";
        for (int i = 0; i <= 10; i++) {
            arrayList.add(secondValue);
            linkedList.add(secondValue);
        }

        long alStart = System.nanoTime();
        arrayList.set(5, value);
        long alEnd = System.nanoTime();
        System.out.println(arrayList);
        System.out.println("al: " + (alEnd - alStart));

        long llStart = System.nanoTime();
        linkedList.set(5, value);
        long llEnd = System.nanoTime();
        System.out.println(linkedList);
        System.out.println("ll: " + (llStart + llEnd));
    }
}
