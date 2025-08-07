import java.util.Hashtable;

public class HumanBeingCache {
    private static Hashtable<String, HumanBeing> cache = new Hashtable<>();

    public static HumanBeing getHuman(String type) {
        HumanBeing cached = cache.get(type);
        return (HumanBeing) cached.clone();
    }

    public static void loadCache() {
        SpiderMan spidey = new SpiderMan();
        cache.put("spidey", spidey);

        Batman batman = new Batman();
        cache.put("batman", batman);

        IronMan ironMan = new IronMan();
        cache.put("ironman", ironMan);
    }
}
