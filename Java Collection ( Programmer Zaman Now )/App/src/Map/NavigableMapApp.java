package Map;
import java.util.Collection;
import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Eko", "Eko");
        map.put("Budi", "Budi");
        map.put("Joko", "Joko");
        
        // for (var key : map.keySet()) {
        //     System.out.println(key);
        // }

        System.out.println(map.lowerKey("Eko"));
        System.out.println(map.higherKey("Eko"));
        // System.out.println(map.floorKey("Eko"));
        // System.out.println(map.ceilingKey("Eko"));
        
        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) { 
            System.out.println(key); // Descending
        }
        
        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Eko", "Eko"); // Ini error, karna NavigableMap sudah immutable

    }
}
