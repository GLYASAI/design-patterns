package com.abewang.designpatterns.command;

import java.util.*;

import static java.util.Comparator.comparing;

/**
 * @Author Abe
 * @Date 2018/8/12.
 */
public class MacroCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command c) {
        commands.add(c);
    }

    public void removeCommand(Command c) {
        commands.remove(c);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
