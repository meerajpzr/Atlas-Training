public class IronMan extends HumanBeing {
    public IronMan() {
        name = "Tony Stark";
        type = "IronMan";
    }

    @Override
    public void talk() {
        System.out.println("I am IronMan!");
    }

    public void repulsorBlast() {
        System.out.println("Firing repulsor blast!");
    }
}
