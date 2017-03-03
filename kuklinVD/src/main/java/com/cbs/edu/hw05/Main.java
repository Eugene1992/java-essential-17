package com.cbs.edu.hw05;

import java.util.Scanner;

/**
 * Main class.
 */
public class Main {
    /**
     * Main class.
     */
    public static void main(String[] args) {
        List arrList = new ArrList();
        List linkList = new LinkList();
        String value = "SomeValue";
        Scanner scan = new Scanner(System.in);
        int exit = 0;
        int op = 0;
        do {
            System.out.println("Choose operation:\n1) add\n2) set\n3) remove\n4) get\n0) exit");
            op = scan.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("It takes for ArrayList  " + getAddToIndexTime(arrList, value, 0) + " to insert in the start");
                    System.out.println("It takes for LinkedList " + getAddToIndexTime(linkList, value, 0) + " to insert in the start");
                    System.out.println("It takes for ArrayList  " + getAddToIndexTime(arrList, value, 5) + " to insert in the middle");
                    System.out.println("It takes for LinkedList " + getAddToIndexTime(linkList, value, 5) + " to insert in the middle");
                    System.out.println("It takes for ArrayList  " + getAddToEndTime(arrList, value) + " to insert in the end");
                    System.out.println("It takes for LinkedList " + getAddToEndTime(linkList, value) + " to insert in the end");
                    break;
                }
                case 2: {
                    System.out.println("It takes for ArrayList  " + getSetToIndexTime(arrList, value, 0) + " to set in the start");
                    System.out.println("It takes for LinkedList " + getSetToIndexTime(linkList, value, 0) + " to set in the start");
                    System.out.println("It takes for ArrayList  " + getSetToIndexTime(arrList, value, 500) + " to set in the middle");
                    System.out.println("It takes for LinkedList " + getSetToIndexTime(linkList, value, 500) + " to set in the middle");
                    System.out.println("It takes for ArrayList  " + getSetToIndexTime(arrList, value, 999) + " to set in the end");
                    System.out.println("It takes for LinkedList " + getSetToIndexTime(linkList, value, 999) + " to set in the end");
                    break;
                }
                case 3: {
                    System.out.println("It takes for ArrayList  " + getRemoveIndexTime(arrList, value, 0) + " to set in the start");
                    System.out.println("It takes for LinkedList " + getRemoveIndexTime(linkList, value, 0) + " to set in the start");
                    System.out.println("It takes for ArrayList  " + getRemoveIndexTime(arrList, value, 500) + " to set in the middle");
                    System.out.println("It takes for LinkedList " + getRemoveIndexTime(linkList, value, 500) + " to set in the middle");
                    System.out.println("It takes for ArrayList  " + getRemoveIndexTime(arrList, value, 999) + " to set in the end");
                    System.out.println("It takes for LinkedList " + getRemoveIndexTime(linkList, value, 999) + " to set in the end");
                    break;
                }
                case 4: {
                    System.out.println("It takes for ArrayList  " + getIndexTime(arrList, value, 0) + " to set in the start");
                    System.out.println("It takes for LinkedList " + getIndexTime(linkList, value, 0) + " to set in the start");
                    System.out.println("It takes for ArrayList  " + getIndexTime(arrList, value, 500) + " to set in the middle");
                    System.out.println("It takes for LinkedList " + getIndexTime(linkList, value, 500) + " to set in the middle");
                    System.out.println("It takes for ArrayList  " + getIndexTime(arrList, value, 999) + " to set in the end");
                    System.out.println("It takes for LinkedList " + getIndexTime(linkList, value, 999) + " to set in the end");
                    break;
                }
                default:
                    exit = 1;
            }
        } while (exit == 0);
    }

    private static long getAddToEndTime(List list, String value) {
        long startTime = 0, endTime = 0, sumTime = 0;
        for (int i = 0; i < 100; i++) {
            startTime = System.nanoTime();
            list.add(value);
            endTime = System.nanoTime();
            endTime -= startTime;
            sumTime += endTime;
            list.clear();
        }
        return sumTime / 10;
    }

    private static long getAddToIndexTime(List list, String value, int index) {
        long startTime = 0, endTime = 0, sumTime = 0;
        for (int i = 0; i < 100; i++) {
            startTime = System.nanoTime();
            list.addIndex(index, value);
            endTime = System.nanoTime();
            endTime -= startTime;
            sumTime += endTime;
            list.clear();
        }
        list.clear();
        return sumTime / 10;
    }

    private static long getSetToIndexTime(List list, String value, int index) {
        long startTime = 0, endTime = 0, sumTime = 0;
        list.add(value);
        for (int i = 0; i < 100; i++) {
            startTime = System.nanoTime();
            list.set(index, value);
            endTime = System.nanoTime();
            endTime -= startTime;
            sumTime += endTime;
        }
        list.clear();
        return sumTime / 10;
    }

    private static long getRemoveIndexTime(List list, String value, int index) {
        long startTime = 0, endTime = 0, sumTime = 0;
        list.add(value);
        for (int i = 0; i < 100; i++) {
            startTime = System.nanoTime();
            list.remove(index);
            endTime = System.nanoTime();
            endTime -= startTime;
            sumTime += endTime;
        }
        list.clear();
        return sumTime / 10;
    }

    private static long getIndexTime(List list, String value, int index) {
        long startTime = 0, endTime = 0, sumTime = 0;
        list.add(value);
        for (int i = 0; i < 100; i++) {
            startTime = System.nanoTime();
            list.get(index);
            endTime = System.nanoTime();
            endTime -= startTime;
            sumTime += endTime;
        }
        list.clear();
        return sumTime / 10;
    }
}
