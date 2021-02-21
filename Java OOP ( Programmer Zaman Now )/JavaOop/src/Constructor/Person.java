package Constructor;

public class Person {
    // Field
    String name;
    String address;
    int age;
    boolean status;
    final String country = "Indonesia"; // Setiap Keyword Final, field di dalamnya tidak dapat diubah lagi

    // Constructor Dengan Parameters -----------------------------
    Person(String paramName, String paramAddress, int paramAge, boolean paramStatus) {
        name = paramName; // Ini Memanggil parameter yang ada di constructor itu sendiri
        address = paramAddress;
        age = paramAge;
        status = paramStatus;
    }

    // Constructor Dengan Parameters -----------------------------
    Person(String name, String address) {
        // name = paramName;
        // address = paramAddress;
        // name = name; // Variabel Shadowing, adalah variabel yang memiliki nama yang sama di dalam constructor itu sendiri
        // address = address; // Variabel Shadowing
        // Jika tidak ada keyword this, onomatis memanggil variavel dari parameter constructor itu sendiri

        this.name = name; // Jika ada Keyword This, otomatis memanggil variabel yang diluar scope constructor
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
