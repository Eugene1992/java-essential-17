package com.cbs.edu.hw05.get;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Vladimir on 03.03.2017.
 */
public class GetStart {
    /**
     * Get Start.
     */
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        String value = "apple";


        long alStart = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            arrayList.add(value);
        }
        String firstOutput = arrayList.get(0);
        long alEnd = System.nanoTime();
        System.out.println(firstOutput);
        System.out.println(alEnd - alStart);

        long llStart = System.nanoTime();
            for (int i = 0; i < 10; i++) {
                linkedList.add(value);
            }
        String secondOutput = linkedList.get(0);
        long llEnd = System.nanoTime();
        System.out.println(secondOutput);
        System.out.println(llEnd - llStart);
    }
}
