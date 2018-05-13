package chapter6.Client;

import chapter6.Command.LightOnCommand;
import chapter6.Invoker.RemoteControl;
import chapter6.Receiver.CeilingFan;
import chapter6.Receiver.Light;

public class RemoteLoader {
    public static void main (String args[]) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
