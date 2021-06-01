import java.math.BigInteger;

// package Constructor;

public class PersonOne {
    // Field
    String name;
    String address;
    int age;
    boolean status;
    // int phoneNumber;
    final String country = "Indonesia"; // Setiap Keyword Final, field di dalamnya tidak dapat diubah lagi

    // Constructor Dengan Parameters -----------------------------
    PersonOne(String paramName, String paramAddress, int paramAge, boolean paramStatus) {
        this.name = paramName; // Ini Memanggil parameter yang ada di constructor itu sendiri
        this.address = paramAddress;
        this.age = paramAge;
        this.status = paramStatus;
    }

    // Constructor Dengan Parameters -----------------------------
    PersonOne(String name, String address) {
        // name = paramName;
        // address = paramAddress;
        // name = name; // Variabel Shadowing, adalah variabel yang memiliki nama yang sama di dalam constructor itu sendiri
        // address = address; // Variabel Shadowing
        // Jika tidak ada keyword this, onomatis memanggil variabel dari parameter constructor itu sendiri

        this.name = name; // Jika ada Keyword This, otomatis memanggil variabel yang diluar scope constructor
        this.address = address;
    }

    // Constructor Tanpa Parameter -----------------------------
    PersonOne() {

    }

    // Method Dengan Parameters -----------------------------
    void sayHello(String name, String address, Integer phoneNumber) {
        System.out.println("Hello " + this.name + ", My name is " + this.name + ", My Adress is " + this.address + ", My Phone Number " + phoneNumber);
    }
}
