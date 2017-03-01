package com.cbs.edu.examples.cw04.text_converter;

import java.util.Scanner;

public class ConsoleReaderImpl implements IReader {

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String read() {
        return scanner.next();
    }
}
