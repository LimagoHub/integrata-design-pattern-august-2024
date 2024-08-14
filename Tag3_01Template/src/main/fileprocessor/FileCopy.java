package main.fileprocessor;

import java.io.FileWriter;
import java.io.IOException;

public class FileCopy extends FileProcessor {

    private FileWriter fileWriter;
    @Override
    public void init() {
        try {
            fileWriter = new FileWriter("./resource/ausgabe.txt");
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
