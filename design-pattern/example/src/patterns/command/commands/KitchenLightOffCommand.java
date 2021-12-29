package patterns.command.commands;

import patterns.command.hardware.KitchenLights;

public class KitchenLightOffCommand implements Command{

    private KitchenLights kitchenLights;

    public KitchenLightOffCommand(KitchenLights kitchenLights) {
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        kitchenLights.off();
    }
}
