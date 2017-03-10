package com.cbs.edu.examples.cw07.enums;

import java.util.List;

/**
 * Created by Vladimir on 05.03.2017.
 */
public class Calculator {
    private List<String> list;
    private String testObj;
    private String input;

    public Calculator(List<String> list, String testObj, String input) {
        this.list = list;
        this.testObj = testObj;
        this.input = input;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public long operation(Operation operation, Place place, int count) {
        final int START_POINT = findOperationPlace(place);


        final long START = System.currentTimeMillis();
        switch (operation) {
            case ADD:
                addCalculator(count, START_POINT);
                break;

            case REMOVE:
                removeCalculator(count, START_POINT);
                break;

            case GET:
                getCalculator(count, START_POINT);
                break;

            case SET:
                setCalculator(count, START_POINT);
                break;
        }
        long END = System.currentTimeMillis();
        return END - START;

    }

    private void addCalculator(int count, int startPoint) {
        for (int i = 0; i < count; i++) {
            list.add(startPoint, testObj);
        }
    }

    private void removeCalculator(int count, int startPoint) {
        for (int i = 0; i < count; i++) {
            list.add(startPoint, testObj);
        }
        for (int i = 0; i < count; i++) {
            list.remove(startPoint);
        }
    }

    private void getCalculator(int count, int startPoint) {
        for (int i = 0; i < count; i++) {
            list.add(startPoint, testObj);
        }
        for (int i = 0; i < count; i++) {
            list.get(startPoint);
        }
    }

    private void setCalculator(int count, int startPoint) {
        for (int i = 0; i < count; i++) {
            list.add(startPoint, testObj);
        }
        for (int i = 0; i < count; i++) {
            list.set(startPoint, input);
        }
    }

    private int findOperationPlace(Place place) {
        int placeNum = 0;
        if (place == Place.START) {
            placeNum = 0;
        } else if (place == Place.MIDDLE) {
            placeNum = list.size() / 2;
        } else if (place == Place.END) {
            placeNum = list.size();
        } else {
            throw new IllegalArgumentException();
        }
        return placeNum;
    }

    enum Operation {
        ADD, REMOVE, SET, GET
    }

    enum Place {
        START, MIDDLE, END
    }
}
