package patterns.command.commands;

import patterns.command.hardware.Music;

public class MusicOnCommand implements Command{

    private Music music;

    public MusicOnCommand(Music music) {
        this.music = music;
    }

    @Override
    public void execute() {
        music.on();
        music.setVolume(5);
    }
}
