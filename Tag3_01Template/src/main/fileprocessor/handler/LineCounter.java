package main.fileprocessor.handler;

import main.fileprocessor.FileProcessor;

public class LineCounter  extends AbstractCounterHandler{


    @Override
    public void process(char c) {
        if(c == '\n')
            incrementCounter();
    }

}
