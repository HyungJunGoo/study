package patterns.command;

import patterns.command.commands.*;
import patterns.command.hardware.KitchenLights;
import patterns.command.hardware.Music;

public class Main {

    public static void main(String[] args) {
        Alexa alexa = new Alexa();

        System.out.println(alexa);

        // Kitchen Light on
        System.out.println("================================================");
        KitchenLights kitchenLights = new KitchenLights();
        alexa.setCommand(0, new KitchenLightOnCommand(kitchenLights), new KitchenLightOffCommand(kitchenLights));
        System.out.println(alexa);
        alexa.activateSlot(0);

        // Add music command
        System.out.println("================================================");
        Music music = new Music();
        alexa.setCommand(1, new MusicOnCommand(music), new MusicOffCommand(music));
        System.out.println(alexa);
        alexa.activateSlot(1);

        // Everything
        System.out.println("================================================");
        alexa.setCommand(2, new EverythingOnCommand(music, kitchenLights), new EverythingOffCommand(music, kitchenLights));
        System.out.println(alexa);
        alexa.activateSlot(2);

    }
}
