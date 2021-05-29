import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(1000);
        
        for (int i = 1; i <= 1000; i++) {
            list.add(i);
        }

        int index = Collections.binarySearch(list, 500);
        System.out.println(index);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        int index2 = Collections.binarySearch(list, 333);
        System.out.println(index2);
    }
}
