// NavigableSet
import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        String[] abjad = {"C", "E", "D", "B", "F", "A"};
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Eko", "Kurniawan", "Khaneddy", "Programmer", "Zaman", "Now"));

        NavigableSet<String> namesReserve = names.descendingSet();
        // NavigableSet<String> kurniawan = names.headSet("Kurniawan", true);
        NavigableSet<String> kurniawan = names.tailSet("Kurniawan", false);

        for (var name : kurniawan) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names); // Jika sudah di set menjadi Immutable, maka selanjutnya tidak akan bisa di set lagi
        immutable.add("HALLO");
    }
}
