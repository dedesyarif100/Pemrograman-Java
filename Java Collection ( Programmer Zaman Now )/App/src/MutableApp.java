import java.util.List;

// Imutable List
import data.Person;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Eko");

        person.addHobby("A");
        person.addHobby("B");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("zzzzzzzzzzzz");
    }
}
