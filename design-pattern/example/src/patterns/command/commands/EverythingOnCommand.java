package patterns.command.commands;

import patterns.command.hardware.KitchenLights;
import patterns.command.hardware.Music;

public class EverythingOnCommand implements Command{

    private Music music;
    private KitchenLights kitchenLights;

    public EverythingOnCommand(Music music, KitchenLights kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        System.out.println("Everything On Command is executed!");
        kitchenLights.on();
        music.on();
        music.setVolume(5);
    }
}
