package com.cbs.edu.examples.cw04.text_converter;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        IReader consoleReader = new ConsoleReaderImpl();
        FileReaderImpl fileReader = new FileReaderImpl("src\\main\\java\\com\\cbs\\edu\\examples\\cw04\\text_converter\\inputData");
        IWriter consoleWriter = new ConsoleWriterImpl();
        IWriter fileWriter = new FileWriterImpl("src\\main\\java\\com\\cbs\\edu\\examples\\cw04\\text_converter\\outputData");

        Converter converter = new Converter(fileReader, fileWriter);

        converter.setWriter(fileWriter);
//        converter.setReader(consoleReader);

        converter.convert();
    }
}
