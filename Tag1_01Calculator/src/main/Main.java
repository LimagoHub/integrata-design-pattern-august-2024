package main;

import client.CalcClient;
import de.math.*;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Instant start = Instant.now();
        CalculatorFactory.setLogger(true);
        CalculatorFactory.setSecure(true);
        Calculator calc = CalculatorFactory.createCalculator();

        CalcClient client = new CalcClient(calc);
        client.go();
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println(duration.toNanos());
    }
}