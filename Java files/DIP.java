// DIP.java
public class DIP {
    public static void main(String[] args) {
        // Creating the LightBulb object (could be any device implementing SwitchOnOff)
        SwitchOnOff lightBulb = new LightBulb();

        // Creating a Switch object that can operate the lightbulb
        Switch lightSwitch = new Switch(lightBulb);

        // Operating the light (turning it on)
        lightSwitch.operate();  // Output: Light turned on

        // If we were to add another device like Fan:
        SwitchOnOff fan = new Fan();
        Switch fanSwitch = new Switch(fan);
        fanSwitch.operate();  // Output: Fan is running
    }
}
