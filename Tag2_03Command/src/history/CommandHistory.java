package history;

import command.Command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {

    private final Deque<Command> undoStack = new ArrayDeque<>();
    private final Deque<Command> redoStack = new ArrayDeque<>();
    public void add(Command command) {
        if(command.isQuery()) return;
        // Code für Command
    }

    public void undo() {
        System.out.println("can't undo");
    }

    public void redo() {
        System.out.println("can't redo");
    }
}
