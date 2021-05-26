// Pengenalan Collection
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class CollectionApp {
    public static void main(String[] args) {
        String[] names = {"Hend", "Rian", "Ali"};
        Collection<String> collection = new ArrayList<>();
    
        collection.add("A");
        collection.add("B");
        collection.add("C");

        collection.addAll(List.of(names));
        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("------REMOVE-------");

        collection.remove("A");
        collection.remove("B");
        collection.remove("C");
        collection.removeAll(List.of(names));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("-------Contains--------");

        if (collection.contains("Hend")) {
            System.out.println(true);
        } else if (collection.contains("Rian")) {
            System.out.println(true);
        } else if (collection.contains("Ali")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        Integer[] number = {1, 2, 3, 4, 5};
        Collection<Integer> numberCollection = new ArrayList<>();

        numberCollection.addAll(List.of(number));
        for (var value : numberCollection) {
            System.out.println(value);
        }
    }
}
