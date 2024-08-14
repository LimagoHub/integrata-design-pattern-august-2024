package main.fileprocessor.handler;

import main.fileprocessor.FileProcessor;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy  implements CharacterHandler {

    private FileWriter fileWriter;
    @Override
    public void init() {
        try {
            fileWriter = new FileWriter("./resources/ausgabe.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void process(char c) {
        try {
            fileWriter.write(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dispose() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
