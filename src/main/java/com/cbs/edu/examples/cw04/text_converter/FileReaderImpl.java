package com.cbs.edu.examples.cw04.text_converter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileReaderImpl implements IReader {

    private String filePath;

    public FileReaderImpl(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String read() throws IOException {
        return Files
                .readAllLines(Paths.get(filePath))
                .stream()
                .collect(Collectors.joining());
    }
}
