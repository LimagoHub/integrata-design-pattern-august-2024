package command;

public abstract class AbstractCommand implements Command {
    @Override
    public void parse(String[] token) {

    }

    @Override
    public abstract void execute();

    @Override
    public void undo() {
        throw new UnsupportedOperationException("can't undo");
    }

    @Override
    public boolean isQuery() {
        return true;
    }
}
