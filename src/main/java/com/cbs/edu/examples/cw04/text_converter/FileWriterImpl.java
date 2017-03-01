package com.cbs.edu.examples.cw04.text_converter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriterImpl implements IWriter {

    private String filePath;

    public FileWriterImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void write(String text) throws IOException {
        Files.write(Paths.get(filePath), text.getBytes());
    }
}
