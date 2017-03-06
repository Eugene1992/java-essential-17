package com.cbs.edu.hw05.remove;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Vladimir on 03.03.2017.
 */
public class RemoveStart {
    /**
     * Remove start.
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        String value = "apple";

        long alStart = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            arrayList.add(value);
        }
        arrayList.remove(0);
        long alEnd = System.nanoTime();
        System.out.println("al: " + (alEnd - alStart));

        long llStart = System.nanoTime();
        for (int i = 0; i < 100; i++) {
            linkedList.add(value);
        }
        linkedList.remove(0);
        long llEnd = System.nanoTime();
        System.out.println("ll: " + (llEnd - llStart));
    }
}
