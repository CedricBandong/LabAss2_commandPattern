public class PowerOn implements Command {
    private Device device;

    public PowerOn(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.powerOn();
    }
}
