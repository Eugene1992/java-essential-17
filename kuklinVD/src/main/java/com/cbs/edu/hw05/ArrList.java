package com.cbs.edu.hw05;

import java.util.ArrayList;

/**
 * Created by DarKnight on 002 02.03.17.
 */
public class ArrList extends List {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public void add(String value) {
        String oldValue = value;
        for (int i = 0; i < 1000; i++) {
            value += i;
            arrayList.add(value);
            value = oldValue;
        }
        //System.out.println(arrayList.toString());
    }

    @Override
    public void addIndex(int index, String value) {
        String oldValue = value;
        if (index == 0) {
            for (int i = 0; i < 1000; i++) {
                value += i;
                arrayList.add(index, value);
                value = oldValue;
            }
        } else {
            for (int i = 0; i < 1000; i++) {
                value += i;
                arrayList.add((arrayList.size() / 2), value);
                value = oldValue;
            }
        }
    }

    @Override
    public void set(int index, String value) {
        arrayList.set(index, value);
    }

    @Override
    public void remove(int index) {
        if (index == 999) {
            index = arrayList.size() - 1;
            arrayList.remove(index);
        } else {
            arrayList.remove(index);
        }
    }

    @Override
    public void get(int index) {
        arrayList.get(index);
    }

    @Override
    public void clear() {
        arrayList.clear();
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.toString(i));
        }
    }
}
