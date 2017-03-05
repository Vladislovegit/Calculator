package command;

import command.impl.GetQuestionsCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandRecognizer {
    private static final Map<CommandName, Command> commands = new HashMap<>();

    static {
        commands.put(CommandName.GET_QUESTIONS, new GetQuestionsCommand());
    }

    public static Command getCommand(CommandName commandName){
        return commands.get(commandName);
    }
}
