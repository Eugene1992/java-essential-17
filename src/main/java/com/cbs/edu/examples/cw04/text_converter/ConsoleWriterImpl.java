package com.cbs.edu.examples.cw04.text_converter;

public class ConsoleWriterImpl implements IWriter {

    @Override
    public void write(String text) {
        System.out.println(text);
    }
}
