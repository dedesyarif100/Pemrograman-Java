// Comparable Interface
import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {
        Person[] people = {
            new Person("Hen", "INDONESIA"),
            new Person("De", "INDONESIA"),
            new Person("Ab", "INDONESIA"),
        };
        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
