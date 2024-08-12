package main;

import client.CalcClient;
import de.math.*;

public class Main {
    public static void main(String[] args) {

        CalculatorFactor.setLogger(true);
        CalculatorFactor.setSecure(true);
        Calculator calc = CalculatorFactor.createCalculator();

        CalcClient client = new CalcClient(calc);
        client.go();
    }
}