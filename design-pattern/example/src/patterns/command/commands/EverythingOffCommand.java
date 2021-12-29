package patterns.command.commands;

import patterns.command.hardware.KitchenLights;
import patterns.command.hardware.Music;

public class EverythingOffCommand implements Command{

    private Music music;
    private KitchenLights kitchenLights;

    public EverythingOffCommand(Music music, KitchenLights kitchenLights) {
        this.music = music;
        this.kitchenLights = kitchenLights;
    }

    @Override
    public void execute() {
        System.out.println("Everything Off command is executed!");
        kitchenLights.off();
        music.setVolume(0);
        music.off();
    }
}
