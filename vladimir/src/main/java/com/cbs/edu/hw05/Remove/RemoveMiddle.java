package com.cbs.edu.hw05.remove;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Vladimir on 03.03.2017.
 */
public class RemoveMiddle {
    /**
     * Remove Middle.
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
        arrayList.remove(4);
        long alEnd = System.nanoTime();
        System.out.println(arrayList);
        System.out.println("al: " + (alEnd - alStart));

        long llStart = System.nanoTime();
        linkedList.remove(4);
        long llEnd = System.nanoTime();
        System.out.println(linkedList);
        System.out.println("ll: " + (llEnd - llStart));
    }
}
