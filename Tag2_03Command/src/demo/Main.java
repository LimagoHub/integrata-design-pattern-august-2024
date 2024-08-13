package demo;

import command.Command;
import command.CommandFactory;
import math.Calculator;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("#>");
            String zeile = scanner.nextLine();// Add 3
            Command command = CommandFactory.getInstance().createCommand(zeile);
            if(command != null) {command.execute();}
        }
    }
}