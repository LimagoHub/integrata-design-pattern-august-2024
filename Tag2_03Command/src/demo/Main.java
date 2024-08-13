package demo;

import command.Command;
import command.CommandFactory;
import history.CommandHistory;
import math.Calculator;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        CommandHistory history = new CommandHistory();
        while(true) {
            System.out.print("#>");
            String zeile = scanner.nextLine();// Add 3
            switch (zeile) {
                case "undo" -> {history.undo(); continue;}
                case "redo" -> {history.redo(); continue;}
            }
            Command command = CommandFactory.getInstance().createCommand(zeile);
            if(command == null) continue;
            command.execute();
            history.add(command);

        }
    }
}