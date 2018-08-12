package com.abewang.designpatterns.command;

/**
 * @Author Abe
 * @Date 2018/8/12.
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }

    public static void main(String[] args) {
        MacroCommand macro = new MacroCommand();
        macro.addCommand(new HelloCommand(new HelloReceiver()));
        macro.addCommand(new WorldCommand(new WorldReceiver()));

        Invoker invoker = new Invoker(macro);
        invoker.call();
    }
}
