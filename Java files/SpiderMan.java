public class SpiderMan extends HumanBeing {
    public SpiderMan() {
        name = "Peter Parker";
        type = "SpiderMan";
    }

    @Override
    public void talk() {
        System.out.println("I am SpiderMan!");
    }

    public void webShoot() {
        System.out.println("Shooting webs...");
    }
}
