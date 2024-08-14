package main.fileprocessor.handler;

import main.fileprocessor.FileProcessor;

public class CharacterCounter extends AbstractCounterHandler{

    @Override
    public void process(char c) {
        incrementCounter();
    }


}
