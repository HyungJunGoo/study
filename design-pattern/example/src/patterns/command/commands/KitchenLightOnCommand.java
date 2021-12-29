package patterns.command.commands;

import patterns.command.hardware.KitchenLights;

public class KitchenLightOnCommand implements Command{

    private KitchenLights kitchenLights;


    public KitchenLightOnCommand(KitchenLights kitchenLights) {
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        kitchenLights.on();
    }
}
