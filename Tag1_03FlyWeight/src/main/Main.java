package main;

import flyweight.AttributedCharacter;

public class Main {
    public static void main(String[] args) {

        AttributedCharacter a = AttributedCharacter.getInstance('A', true);
        AttributedCharacter b = AttributedCharacter.getInstance('A', true);
        AttributedCharacter c = AttributedCharacter.getInstance('A', false);

        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println("Hello world!");
    }
}