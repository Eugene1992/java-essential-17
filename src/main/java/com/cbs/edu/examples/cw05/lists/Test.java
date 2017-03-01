package com.cbs.edu.examples.cw05.lists;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = 10;
        objects[1] = true;
        objects[2] = "Hello world!";

        Object[] copied = Arrays.copyOf(objects, 10);

        System.out.println(Arrays.toString(copied));

        ArrayList<String> someAnotherStrings = new ArrayList<>();



        ArrayList<String> strings = new ArrayList<>();
//        strings.add(10);
//        strings.add(true);
        strings.add("Hello world!");
        strings.add("Hello world!");
        strings.add(null);
        strings.add(null);
        System.out.println(strings.set(7, "777"));

    }
}
