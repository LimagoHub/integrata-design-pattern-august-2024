package history;

import command.Command;

public class CommandHistory {

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
