package main;

import status.Front;

public class Main {
    public static void main(String[] args) {

        Front front = new Front();
        front.drucken();
        front.changeToB();
        front.drucken();
        front.changeToB();
    }
}