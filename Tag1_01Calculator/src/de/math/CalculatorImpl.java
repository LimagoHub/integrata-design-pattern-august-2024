package de.math;

public class CalculatorImpl implements Calculator {

    /* package */ CalculatorImpl() {
    }

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double sub(double a, double b) {
        return add(a, -b);
    }
}
