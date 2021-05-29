// Set
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        // Set<String> names = new LinkedHashSet<>();

        names.add("A");
        names.add("B");
        names.add("C");
        names.add("A");
        names.add("B");
        names.add("C");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
