package main;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {

        Instant start = Instant.now();
        String string = " ";
        for (int i = 0; i < 2_000_000; i++) {
            string+='a';
        }

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println(duration.toMillis() );
    }
}