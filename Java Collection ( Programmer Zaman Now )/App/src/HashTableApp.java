// HashTable / Legacy Collection
import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
        
        map.put("Eko", "Eko value");
        map.put("Budi", "Budi value");
        map.put("Joko", "Joko value");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
