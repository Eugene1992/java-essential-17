package com.cbs.edu.hw05.remove;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Vladimir on 03.03.2017.
 */
public class RemoveEnd {
    /**
     * RemoveEnd.
     */
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        LinkedList<Object> linkedList = new LinkedList<>();
        String value = "apple";

        long alStart = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            arrayList.add(value);
            linkedList.add(value);
        }
        arrayList.remove(arrayList.size() - 1);
        long alEnd = System.nanoTime();
        System.out.println("al: " + (alEnd - alStart));

        long llStart = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            arrayList.add(value);
            linkedList.add(value);
        }
        linkedList.remove(linkedList.size() - 1);
        long llEnd = System.nanoTime();
        System.out.println("ll: " + (llEnd - llStart));
    }
}
