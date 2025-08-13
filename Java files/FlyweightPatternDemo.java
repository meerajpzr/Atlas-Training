import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface Laptop {
    void display(String ram, String storage);
}

// Concrete Flyweight
class LaptopModel implements Laptop {
    private String brand; // intrinsic state (shared)

    public LaptopModel(String brand) {
        this.brand = brand;
    }

    @Override
    public void display(String ram, String storage) {
        System.out.println("Laptop Brand: " + brand + ", RAM: " + ram + ", Storage: " + storage);
    }
}

// Flyweight Factory
class LaptopFactory {
    private static final Map<String, Laptop> laptopMap = new HashMap<>();

    public static Laptop getLaptop(String brand) {
        Laptop laptop = laptopMap.get(brand);
        if (laptop == null) {
            laptop = new LaptopModel(brand);
            laptopMap.put(brand, laptop);
            System.out.println("Creating new Laptop object for brand: " + brand);
        }
        return laptop;
    }
}

// Client
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        Laptop dell1 = LaptopFactory.getLaptop("Dell");
        dell1.display("8GB", "512GB SSD");

        Laptop dell2 = LaptopFactory.getLaptop("Dell"); // reused
        dell2.display("16GB", "1TB SSD");

        Laptop hp1 = LaptopFactory.getLaptop("HP");
        hp1.display("8GB", "256GB SSD");
    }
}
