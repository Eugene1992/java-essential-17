package com.cbs.edu.hw09;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Created by Vladimir on 17.03.2017.
 */
public class PrintWrite {
    public PrintWrite() {
    }

    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("a.txt"));
            out.println("Hello");
        } catch (Exception var3) {
            System.out.println("Exception");
        }

    }
}
