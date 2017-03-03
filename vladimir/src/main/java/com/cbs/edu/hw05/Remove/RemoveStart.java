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
        for (int i = 0; i < 100; i++) {
            arrayList.add(value);
            linkedList.add(value);
        }
        long alStart = System.nanoTime();
        arrayList.remove(0);
        long alEnd = System.nanoTime();
        System.out.println("ll: " + (alEnd - alStart));

        long llStart = System.nanoTime();
        linkedList.remove(0);
        long llEnd = System.nanoTime();
        System.out.println("ll: " + (llEnd - llStart));
    }
}
