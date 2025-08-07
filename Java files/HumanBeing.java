public abstract class HumanBeing implements Cloneable {
    public String name;
    public String type;

    public abstract void talk();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone(); // Shallow copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
