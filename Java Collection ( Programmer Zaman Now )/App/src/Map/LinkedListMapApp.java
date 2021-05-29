package Map;
// Map -> LinkedHashMap
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedListMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "dede");
        map.put("last", "syarifudin");
        map.put("middle", "hidayat");

        Set<String> keys = map.keySet();

        for (var key : keys) {
            System.out.println(key);
        }
        
    }
}
