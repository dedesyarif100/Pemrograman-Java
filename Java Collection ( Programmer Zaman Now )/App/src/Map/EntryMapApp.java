// Entry Map
package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(3, "Eko value");
        map.put(2, "Budi value");
        map.put(1, "Joko value");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
