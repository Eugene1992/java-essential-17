package com.cbs.edu.examples.cw07.enums;

import com.cbs.edu.examples.cw07.enums.Calculator.Operation;
import com.cbs.edu.examples.cw07.enums.Calculator.Place;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.cbs.edu.examples.cw07.enums.Calculator.Operation.*;
import static com.cbs.edu.examples.cw07.enums.Calculator.Place.*;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        final String MAIN_VALUE = "Hello World";
        final int MAIN_SIZE = 10000;
        final String ELEMENT = "APPLE";

        Calculator arrayListCalculator = new Calculator(arrayList, MAIN_VALUE, ELEMENT);

        final long AL_RESULT = arrayListCalculator.operation(GET, START, MAIN_SIZE);
        System.out.printf("AL %d items time : %d \n", MAIN_SIZE, AL_RESULT);
//        arrayListCalculator.setList(linkedList);
        Calculator linkedListCalculator = new Calculator(arrayList, MAIN_VALUE, ELEMENT);
        final long LL_RESULT = linkedListCalculator.operation(GET, START, MAIN_SIZE);
        System.out.printf("LL %d items time : %d ", MAIN_SIZE, LL_RESULT);


//        Calculator linkedListCalculator = new Calculator(linkedList, MAIN_VALUE);
//        long llResult = linkedListCalculator.operation("SET", "MIDDLE", MAIN_TEST);

    }
}
