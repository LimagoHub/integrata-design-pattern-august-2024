package main;

import main.fileprocessor.handler.CharacterCounter;
import main.fileprocessor.handler.FileCopy;
import main.fileprocessor.FileProcessor;
import main.fileprocessor.handler.LineCounter;

public class Main {
    public static void main(String[] args) {

        FileProcessor fileProcessor = new FileProcessor();
        fileProcessor.addHandler(new CharacterCounter());
        fileProcessor.addHandler(new LineCounter());
        fileProcessor.run("./resources/eingabe.txt");
    }
}