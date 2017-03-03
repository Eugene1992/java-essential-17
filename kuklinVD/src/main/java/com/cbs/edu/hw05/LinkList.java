package com.cbs.edu.hw05;

import java.util.LinkedList;

/**
 * Created by DarKnight on 002 02.03.17.
 */
public class LinkList extends List {
    private LinkedList<String> linkedList = new LinkedList<>();

    @Override
    public void add(String value) {
        String oldValue = value;
        for (int i = 0; i < 1000; i++) {
            value += i;
            linkedList.add(value);
            value = oldValue;
        }
        //System.out.println(linkedList.toString());
    }

    @Override
    public void addIndex(int index, String value) {
        String oldValue = value;
        if (index == 0) {
            for (int i = 0; i < 1000; i++) {
                value += i;
                linkedList.add(index, value);
                value = oldValue;
            }
        } else {
            for (int i = 0; i < 1000; i++) {
                value += i;
                linkedList.add((linkedList.size() / 2), value);
                value = oldValue;
            }
        }
    }

    @Override
    public void set(int index, String value) {
        linkedList.set(index, value);
    }

    @Override
    public void remove(int index) {
        if (index == 999) {
            index = linkedList.size() - 1;
            linkedList.remove(index);
        } else {
            linkedList.remove(index);
        }
    }

    @Override
    public void get(int index) {
        linkedList.get(index);
    }

    @Override
    public void clear() {
        linkedList.clear();
        for (int i = 0; i < 10; i++) {
            linkedList.add(Integer.toString(i));
        }
    }
}
