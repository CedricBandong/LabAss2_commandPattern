public class Lights implements Device{

    private int brightness;
    private boolean isOn;

    public Lights() {
        this.brightness = 50;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("\nLights On!");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("\nLights Off!");
    }

    public void setBrightness(int value) {
        if (!isOn) { 
            System.out.println("\nMake sure the Lights are on to set brightness.");
            return;
        }
        if (value < 0 || value > 100) {
            System.out.println("\nBrightness must be set between 0 and 100.");
            return;
        }
        brightness = value;
        System.out.println("\nBrightness set to " + value + ".");
    }
}
