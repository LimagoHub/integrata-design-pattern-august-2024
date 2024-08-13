package command;

public class CommandFactory {

    private static CommandFactory commandFactory = new CommandFactory();

    private CommandFactory() {

    }

    public static CommandFactory getInstance() {
        return commandFactory;
    }

    public Command createCommand(String command) {
        Command cmd = null ;
        String [] tokens = command.split(" ");
        if(tokens[0].equals("Add")) {
            cmd = new AddCommand();
            cmd.parse(tokens);
        }
        if(tokens[0].equals("Sub")) {
            cmd = new SubCommand();
            cmd.parse(tokens);
        }
        if(tokens[0].equals("Print")) {
            cmd = new PrintCommand();
            cmd.parse(tokens);
        }
        return cmd;
    }
}
