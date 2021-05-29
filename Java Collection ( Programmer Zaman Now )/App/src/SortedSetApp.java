// SortedSet
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import data.Person;
import data.PersonComparator;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());

        people.add(new Person("Dede"));
        people.add(new Person("Syarif"));
        people.add(new Person("Hidayat"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people); // Jika sudah di set menjadi Immutable, maka selanjutnya tidak akan bisa di set lagi
    }
}
