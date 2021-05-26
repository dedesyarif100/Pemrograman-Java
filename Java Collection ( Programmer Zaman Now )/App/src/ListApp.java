// List Interface
import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        String[] chars = {"A", "B", "C"};
        List<String> strings = new ArrayList<>();
        // strings.add("Eko");
        // strings.add("Kurniawan");
        strings.addAll(List.of(chars));
        strings.set(0, "Budi");
        strings.remove(1);
        // System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }
    }
}
