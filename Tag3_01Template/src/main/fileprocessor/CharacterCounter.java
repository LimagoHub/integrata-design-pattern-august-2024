package main.fileprocessor;

public class CharacterCounter extends FileProcessor{

    private int counter;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void process(char c) {
        counter ++;
    }

    @Override
    public void dispose() {
        System.out.println("Counter: " + counter);
    }
}
