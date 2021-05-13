// package Constructor;

public class Constructor {
    public static void main(String[] args) {
        var person1 = new Person("Dede", "Surabaya", 24, true);
        // person1.name = "Dede";
        // person1.address = "Surabaya";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.age);
        System.out.println(person1.status);
        System.out.println(person1.country); // Ini merupakan field dari keyword Final

        person1.sayHello("Guys", "Malang");

        Person person2 = new Person("Rian", "Sidoarjo");
        person2.age = 30;
        person2.status = false;

        Person person3;
        person3 = new Person();
        person3.name = "Hendro"; // Mengubah nilai field
        person3.address = "Jakarta"; // Mengubah nilai field
        person3.age = 22; // Mengubah nilai field
        person3.status = false; // Mengubah nilai field
        person3.sayHello("Elok", "Malang");
    }
}