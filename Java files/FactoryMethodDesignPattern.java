public class FactoryMethodDesignPattern {
    public static void main(String[] args) {
        // Create Cheezy Pizza
        PizzaFactory cheezyFactory = new CheezyPizzaFactory();
        Pizza cheezyPizza = cheezyFactory.createPizza();
        cheezyPizza.prepare();
        cheezyPizza.bake();
        cheezyPizza.cut();
        cheezyPizza.box();

        System.out.println();

        // Create Pepperoni Pizza
        PizzaFactory pepperoniFactory = new PepperoniPizzaFactory();
        Pizza pepperoniPizza = pepperoniFactory.createPizza();
        pepperoniPizza.prepare();
        pepperoniPizza.bake();
        pepperoniPizza.cut();
        pepperoniPizza.box();
    }
}
