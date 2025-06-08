import java.util.HashMap;
import java.util.Map;

public enum Element {
    H("Hydrogen", 1, 1.008f),
    HE("Helium", 2, 4.0026f),
    NE("Neon", 10, 20.180f);

    private static final Map<String, Element> BY_LABEL = new HashMap<>();
    private static final Map<Integer, Element> BY_ATOMIC_NUMBER = new HashMap<>();
    private static final Map<Float, Element> BY_ATOMIC_WEIGHT = new HashMap<>();

    static {
        for (Element e : values()) {
            BY_LABEL.put(e.label, e);
            BY_ATOMIC_NUMBER.put(e.atomicNumber, e);
            BY_ATOMIC_WEIGHT.put(e.atomicWeight, e);
        }
    }

    public final String label;
    public final int atomicNumber;
    public final float atomicWeight;

    private Element(String label, int atomicNumber, float atomicWeight) {
        this.label = label;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public static Element valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public static Element valueOfAtomicNumber(int number) {
        return BY_ATOMIC_NUMBER.get(number);
    }

    public static Element valueOfAtomicWeight(float weight) {
        return BY_ATOMIC_WEIGHT.get(weight);
    }


    public static void main(String[] args) {
        /
        System.out.println("Displaying All Elements in the Periodic Table Enum:");
        for (Element e : Element.values()) {
            System.out.println("Element: " + e.label);
            System.out.println("Atomic Number: " + e.atomicNumber);
            System.out.println("Atomic Weight: " + e.atomicWeight);
            System.out.println("-----------------------------------");
        }


        System.out.println("Lookup by Label (HE): " + Element.valueOfLabel("HE"));
        System.out.println("Lookup by Atomic Number (2): " + Element.valueOfAtomicNumber(2));
        System.out.println("Lookup by Atomic Weight (20.180): " + Element.valueOfAtomicWeight(20.180f));
    }
}

