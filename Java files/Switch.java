// Switch.java
public class Switch {
    private SwitchOnOff device;

    // Constructor to initialize the device
    public Switch(SwitchOnOff device) {
        this.device = device;
    }

    // Method to operate (turn on the device)
    public void operate() {
        device.turnOn();
    }
}
