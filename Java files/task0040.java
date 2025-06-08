// Abstract base class
abstract class Gadgets {
    abstract void turnOn();
    abstract void turnOff();
}

// Concrete subclass for TVRemote
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

// Concrete subclass for ACRemote
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

// Concrete subclass for FanRemote
class FanRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("Fan is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Fan is turned OFF.");
    }
}

// Concrete subclass for CoolerRemote
class CoolerRemote extends Gadgets {
    @Override
    void turnOn() {
        System.out.println("Cooler is turned ON.");
    }

    @Override
    void turnOff() {
        System.out.println("Cooler is turned OFF.");
    }
}

// Main public class named task0040
public class task0040 {
    public static void main(String[] args) {
        Gadgets remote;

        remote = new TVRemote();
        remote.turnOn();
        remote.turnOff();

        remote = new ACRemote();
        remote.turnOn();
        remote.turnOff();

        remote = new FanRemote();
        remote.turnOn();
        remote.turnOff();

        remote = new CoolerRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
