package com.cbs.edu.examples.cw05.need_abstract;

import java.util.Iterator;

public class MyList extends AbstractList implements List {

    @Override
    public void add(Object obj) {

    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public int indexOf(Object obj) {
        return super.indexOf(obj);
    }
}
