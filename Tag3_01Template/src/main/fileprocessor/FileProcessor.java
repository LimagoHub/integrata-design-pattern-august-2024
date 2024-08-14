package main.fileprocessor;

import java.io.FileNotFoundException;
import java.io.FileReader;

public abstract class FileProcessor {

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

    public void init() {
        // ok
    }

    public abstract void process(char c) ;

    public void dispose() {
        // ok
    }
}
