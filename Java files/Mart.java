class CusDtomer {

    int cost = 40;
    String item = "Tomatoes";


    public void purchaseList() {
        System.out.println("Customer purchased: " + item + " for Rs. " + cost);
    }
}

public class Mart extends Customer {


    void billing() {
        item = "Onions";
        cost = 30;
        System.out.println("Billing item: " + item);
        System.out.println("Billing cost: " + cost);
    }


    public static void main(String[] args) {

        Mart m = new Mart();


        m.item = "Potatoes";
        m.cost = 50;


        System.out.println("%%%%%%%%%%%%%%");
        System.out.println("Item: " + m.item);
        System.out.println("Cost: " + m.cost);
        System.out.println("%%%%%%%%%%%%%%");


        m.billing();
    }
}
