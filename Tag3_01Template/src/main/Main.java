package main;

import main.fileprocessor.FileCopy;
import main.fileprocessor.FileProcessor;

public class Main {
    public static void main(String[] args) {

        FileProcessor fileProcessor = new FileCopy();
        fileProcessor.run("./resource/eingabe.txt");
    }
}