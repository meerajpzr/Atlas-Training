public class Iphone16 implements Iphone {
    Charger chargerAdapter;

    public Iphone16(Charger chargerAdapter) {
        this.chargerAdapter = chargerAdapter;
    }

    @Override
    public void onCharge() {
        chargerAdapter.charge();
    }

    @Override
    public void offCharge() {
        chargerAdapter.removeCharge();
    }
}
