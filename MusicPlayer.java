public class MusicPlayer implements Device {

    private int volume;
    private boolean isOn;

    public MusicPlayer() {
        this.volume = 50;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("\nMusic Player is now On!");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("\nMusic Player powering Off");
    }

    public void setVolume(int value) {
        if (!isOn) {
            System.out.println("\nMusic Player must be on to set volume.");
            return;
        }
        if (value < 0 || value > 100) {
            System.out.println("\nVolume must be set between 0 and 100.");
            return;
        }
        volume = value;
        System.out.println("\nVolume set to " + value + ".");
    }
}
