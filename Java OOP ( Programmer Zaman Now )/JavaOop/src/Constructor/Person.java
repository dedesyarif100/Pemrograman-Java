package Constructor;

public class Person {
    // Field
    String name;
    String address;
    int age;
    boolean status;
    final String country = "Indonesia";

    // Constructor Dengan Parameters -----------------------------
    Person(String paramName, String paramAddress, int paramAge, boolean paramStatus) {
        name = paramName;
        address = paramAddress;
        age = paramAge;
        status = paramStatus;
    }

    // Constructor Dengan Parameters -----------------------------
    Person(String name, String address) {
        // name = paramName;
        // address = paramAddress;
        // name = name; // Variabel Shadowing
        // address = address; // Variabel Shadowing
        this.name = name;
        this.address = address;
    }

    // Constructor Tanpa Parameter -----------------------------
    Person() {

    }

    // Method Dengan Parameters -----------------------------
    void sayHello(String name, String address) {
        System.out.println("Hello " + this.name + ", My name is " + this.name + ", My Adress is " + this.address);
    }
}
