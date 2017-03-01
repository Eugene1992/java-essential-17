package com.cbs.edu.examples.cw04.text_converter;

import java.io.IOException;

public class Converter {

    private FileReaderImpl reader;
    private IWriter writer;

    public Converter(FileReaderImpl reader, IWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void setReader(FileReaderImpl reader) {
        this.reader = reader;
    }

    public void setWriter(IWriter writer) {
        this.writer = writer;
    }

    public void convert() throws IOException {
        String text = reader.read();
        String result = text.toUpperCase();
        writer.write(result);
    }
}
