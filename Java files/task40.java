abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}
// Concrete class implementing the abstract methods
class TVRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("TV is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("TV is turned OFF.");
    }
}
class ACRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("AC is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("AC is turned OFF.");
    }
}
public class Task40 {
    public static void main(String[] args) {
        Gadgets remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();

        remote = new ACRemote();
        remote.turnOn();
        remote.turnOff();

        // Assuming you have FanRemote and CoolerRemote classes implemented
        remote = new FanRemote();
        remote.turnOn();
        remote.turnOff();

        remote = new CoolerRemote();
        remote.turnOn();
        remote.turnOff();
    }
}

