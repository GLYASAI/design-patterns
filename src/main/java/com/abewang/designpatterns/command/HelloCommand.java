package com.abewang.designpatterns.command;

/**
 * @Author Abe
 * @Date 2018/8/12.
 */
public class HelloCommand implements Command {
    private HelloReceiver receiver;

    public HelloCommand(HelloReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
