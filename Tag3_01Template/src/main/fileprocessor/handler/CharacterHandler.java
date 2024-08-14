package main.fileprocessor.handler;

public interface CharacterHandler {

    void init();
    void process(char c);
    void dispose();
}
