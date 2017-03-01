package com.cbs.edu.examples.cw05.lists;

import java.util.ArrayList;

public class RemoveTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(0);
        integers.add(7);
        integers.add(4);
        integers.add(0);
        integers.add(4);
        integers.add(0);
        integers.add(0);
        integers.add(1);
        integers.add(0);
        integers.add(0);
        integers.add(0);

        System.out.println(integers);

        for (int i = 0; i < integers.size(); i++) {
            integers.remove(new Integer(0));
        }

        System.out.println(integers);
    }
}
