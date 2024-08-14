package main.fileprocessor;

import main.fileprocessor.handler.CharacterHandler;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileProcessor {

    private final List<CharacterHandler> handlers = new ArrayList<>();

    public void addHandler(CharacterHandler handler) {
        handlers.add(handler);
    }
    public void removeHandler(CharacterHandler handler) {
        handlers.remove(handler);
    }

    public final void run(String filename) {
        try(FileReader reader = new FileReader(filename)) {
            init();
            int c;
            while ((c = reader.read()) != -1) {
                process((char) c);
            }
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void init() {
        handlers.forEach(CharacterHandler::init);
    }

    private  void process(char c) {
        handlers.forEach(handler -> handler.process(c));
    }

    private void dispose() {
        handlers.forEach(CharacterHandler::dispose);
    }
}
