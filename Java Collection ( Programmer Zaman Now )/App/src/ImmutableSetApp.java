// Immutable Set
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Dede");

        Set<String> mutable = new HashSet<>();
        mutable.add("Dede");
        mutable.add("Syarif");
        Set<String> immutable = Collections.unmodifiableSet(mutable); // Jika sudah di set menjadi Immutable, maka selanjutnya tidak akan bisa di set lagi
        
        Set<String> set = Set.of("Dede", "Syarif");
        
        // set.add("Dede"); // Error
        // set.remove("Syarif"); // Error
    }
}
