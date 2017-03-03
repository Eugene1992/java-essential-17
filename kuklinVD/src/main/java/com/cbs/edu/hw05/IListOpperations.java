package com.cbs.edu.hw05;

/**
 * Interface for list operations.
 */
public interface IListOpperations {
    void add(String value);

    void addIndex(int index, String value);

    void set(int index, String value);

    void remove(int index);

    void get(int index);

    void clear();
}
