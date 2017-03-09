package command;

import command.impl.CalculateCommand;
import command.impl.GetStatisticsCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandRecognizer {
    private static final Map<CommandName, Command> commands = new HashMap<>();

    static {
        commands.put(CommandName.CALCULATE, new CalculateCommand());
        commands.put(CommandName.GET_STATISTICS, new GetStatisticsCommand());
    }

    public static Command getCommand(CommandName commandName){
        return commands.get(commandName);
    }
}
