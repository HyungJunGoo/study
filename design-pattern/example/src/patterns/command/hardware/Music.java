package patterns.command.hardware;

public class Music {

    private int volume;


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void on() {
        System.out.println("Turning on music");
    }

    public void off() {
        System.out.println("Turning off music");
    }
}
