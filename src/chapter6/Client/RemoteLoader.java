package chapter6.Client;

import chapter6.Command.CeilingFanHighCommand;
import chapter6.Command.CeilingFanOffCommand;
import chapter6.Command.Command;
import chapter6.Command.LightOffCommand;
import chapter6.Command.LightOnCommand;
import chapter6.Command.MacroCommand;
import chapter6.Command.StereoOffCommand;
import chapter6.Command.StereoOnWithCDCommand;
import chapter6.Invoker.RemoteControl;
import chapter6.Receiver.CeilingFan;
import chapter6.Receiver.Light;
import chapter6.Receiver.Stereo;

public class RemoteLoader {
    public static void main(String args[]) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light("Living room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand livingRoomCeilingFanOn = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(ceilingFan);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, livingRoomCeilingFanOn, livingRoomCeilingFanOff);
        remote.setCommand(3, stereoOnWithCD, stereoOff);

        remote.onButtonWasPressed(0);
        remote.onButtonWasPressed(1);
        remote.onButtonWasPressed(2);
        remote.onButtonWasPressed(3);

        remote.undoButtonWasPressed();

        remote.offButtonWasPressed(0);
        remote.offButtonWasPressed(1);
        remote.offButtonWasPressed(2);
        remote.offButtonWasPressed(3);

        remote.undoButtonWasPressed();

        System.out.println();
        System.out.println("Party mode:");
        // Macro party command execution
        Command[] partyOnCommands = {livingRoomLightOn, livingRoomCeilingFanOn, stereoOnWithCD};
        Command[] partyOffCommands = {livingRoomLightOff, livingRoomCeilingFanOff, stereoOff};
        MacroCommand partyOn = new MacroCommand(partyOnCommands);
        MacroCommand partyoff = new MacroCommand(partyOffCommands);
        remote.setCommand(4, partyOn, partyoff);
        remote.onButtonWasPressed(4);
        remote.offButtonWasPressed(4);
    }
}