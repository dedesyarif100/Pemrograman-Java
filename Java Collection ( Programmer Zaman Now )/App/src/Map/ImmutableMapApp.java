// Immutable Map
package Map;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("Name", "Eko");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Eko");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
            "First", "Eko",
            "Middle", "Kurniawan",
            "Last", "Khannedy"
        );

        // map.put("a", "a"); // Ini Error, karna Map telah dijadikan Immutable
    }
}
