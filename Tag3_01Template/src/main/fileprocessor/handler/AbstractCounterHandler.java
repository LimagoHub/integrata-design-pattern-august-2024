package main.fileprocessor.handler;

public abstract class AbstractCounterHandler implements CharacterHandler{

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    @Override
    public void init() {
        counter = 0;
    }
    @Override
    public void dispose() {
        System.out.println(getClass().getSimpleName() + ": " + counter);
    }

    protected void incrementCounter() {
        counter++;
    }
}
