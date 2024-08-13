package command;

import java.lang.reflect.InvocationTargetException;

public class CommandFactory {

    private static final String PREFIX = "command.";
    private static final String SUFFIX = "Command";

    private static CommandFactory commandFactory = new CommandFactory();



    private CommandFactory() {

    }

    public static CommandFactory getInstance() {
        return commandFactory;
    }

    public Command createCommand(String zeile) {
        try {
            return createCommandImpl(zeile);
        } catch (Throwable e) {
            System.out.println("unbekannter Befehl");
            return null;
        }
    }

    private static Command createCommandImpl(String zeile) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
        String [] tokens = zeile.split(" ");
        Command result = (Command) Class.forName(PREFIX + tokens[0] + SUFFIX).getConstructor().newInstance();
        result.parse(tokens);
        return result;
    }
}
