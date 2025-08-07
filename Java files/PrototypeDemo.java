public class PrototypeDemo {
    public static void main(String[] args) {
        HumanBeingCache.loadCache();

        HumanBeing clone1 = HumanBeingCache.getHuman("spidey");
        clone1.talk();

        HumanBeing clone2 = HumanBeingCache.getHuman("batman");
        clone2.talk();

        HumanBeing clone3 = HumanBeingCache.getHuman("ironman");
        clone3.talk();
    }
}
