package Map;
// Map -> EnumMap
import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {

    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP // ini hanya sebagai identity dari method Enum
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Eko");
        map.put(Level.VIP, "Kurniawan");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
