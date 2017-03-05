package com.cbs.edu.hw05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vladimir on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        final String MAIN_VALUE = "Hello World";
        final int MAIN_SIZE = 100000;
        final String ELEMENT = "APPLE";

        Calculator arrayListCalculator = new Calculator(arrayList, MAIN_VALUE, ELEMENT);

        final long AL_RESULT = arrayListCalculator.operation("REMOVE", "END", MAIN_SIZE);
        System.out.printf("AL %d items time : %d \n", MAIN_SIZE, AL_RESULT);
//        arrayListCalculator.setList(linkedList);
        Calculator linkedListCalculator = new Calculator(arrayList, MAIN_VALUE, ELEMENT);
        final long LL_RESULT = linkedListCalculator.operation("REMOVE", "END", MAIN_SIZE);
        System.out.printf("LL %d items time : %d ", MAIN_SIZE, LL_RESULT);


//        Calculator linkedListCalculator = new Calculator(linkedList, MAIN_VALUE);
//        long llResult = linkedListCalculator.operation("SET", "MIDDLE", MAIN_TEST);

    }
}
