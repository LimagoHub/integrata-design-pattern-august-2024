package command;

import math.Calculator;

public class ClearCommand implements Command {

    private double oldValue;
    @Override
    public void parse(String[] tokens) {

    }

    @Override
    public void execute() {
        oldValue = Calculator.getInstance().getMemory();
        Calculator.getInstance().clear();
    }

    @Override
    public void undo() {

    }

    @Override
    public boolean isQuery() {
        return false;
    }
}
