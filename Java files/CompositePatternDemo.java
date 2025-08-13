// Put imports at the top of the file
import java.util.ArrayList;
import java.util.List;

// Component interface
interface Component {
    void brandName();
}

// Leaf class (individual objects)
class Leaf implements Component {
    private String brand;

    // Constructor
    public Leaf(String brand) {
        this.brand = brand;
    }

    @Override
    public void brandName() {
        System.out.println("Brand: " + brand);
    }
}

// Composite class (can contain leaves or other composites)
class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    public Composite() {
    }

    public Composite(List<Component> components) {
        this.components = components;
    }

    @Override
    public void brandName() {
        for (Component comp : components) {
            comp.brandName();
        }
    }

    public void add(Component subComponent) {
        components.add(subComponent);
    }
}

// Client
public class CompositePatternDemo {
    public static void main(String[] args) {
        Component dell = new Leaf("Dell");
        Component hp = new Leaf("HP");
        Component lenovo = new Leaf("Lenovo");

        Composite laptopBrands = new Composite();
        laptopBrands.add(dell);
        laptopBrands.add(hp);

        Composite allBrands = new Composite();
        allBrands.add(laptopBrands);
        allBrands.add(lenovo);

        allBrands.brandName();
    }
}
