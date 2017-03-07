package command;

import command.impl.CalculateCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandRecognizer {
    private static final Map<CommandName, Command> commands = new HashMap<>();

    static {
        commands.put(CommandName.CALCULATE, new CalculateCommand());
    }

    public static Command getCommand(CommandName commandName){
        return commands.get(commandName);
    }
}
