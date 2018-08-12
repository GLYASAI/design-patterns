package com.abewang.designpatterns.command;

/**
 * @Author Abe
 * @Date 2018/8/12.
 */
public class WorldCommand implements Command {
    private WorldReceiver receiver;

    public WorldCommand(WorldReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
