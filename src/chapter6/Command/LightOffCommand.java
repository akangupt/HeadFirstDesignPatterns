package chapter6.Command;

import chapter6.Receiver.Light;

public class LightOffCommand  implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}