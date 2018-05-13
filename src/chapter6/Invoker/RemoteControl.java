package chapter6.Invoker;

import chapter6.Command.Command;

public class RemoteControl {
    private Command slot;

    public RemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
