public class Iphone16Charger implements Charger {

    public Iphone16Charger() {
        System.out.println("Iphone16Charger ready.");
    }

    @Override
    public void charge() {
        System.out.println("⚡ I am charging iPhone 16");
    }

    @Override
    public void removeCharge() {
        System.out.println("❌ iPhone 16 charging stopped");
    }
}
