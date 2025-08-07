public class Batman extends HumanBeing {
    public Batman() {
        name = "Bruce Wayne";
        type = "Batman";
    }

    @Override
    public void talk() {
        System.out.println("I am Batman!");
    }

    public void startBatMobile() {
        System.out.println("Batmobile activated!");
    }
}
