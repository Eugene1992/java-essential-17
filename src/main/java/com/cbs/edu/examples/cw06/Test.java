package com.cbs.edu.examples.cw06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        final String TEST_VALUE = "Hello world";
        final int TEST_SIZE = 100000;

        ListTimeCalculator calculator = new ListTimeCalculator(arrayList, TEST_VALUE);

        final long AL_RESULT = calculator.testOperation("ADD", "START", TEST_SIZE);
        System.out.printf("Insert into AL %d items time: %d\n", TEST_SIZE, AL_RESULT);

        calculator.setList(linkedList);

        final long LL_RESULT = calculator.testOperation("ADD", "START", TEST_SIZE);
        System.out.printf("Insert into LL %d items time: %d\n", TEST_SIZE, LL_RESULT);

    }
}
