// package SuperKeyword;

public class Shape {
    String city; // FIELD
    String address;
    
    // Method Int
    // Jika ada Method bertipe data khusus (int, double, String, char, bool, array), di dalam method wajib memberikan return value
    public int getCorner() {
        return 12;
    }

    // Method String
    // Jika ada Method bertipe data khusus (int, double, String, char, bool, array), di dalam method wajib memberikan return value
    public String getString() {
        return "Dede";
    }

    // Method String
    // Jika ada Method bertipe data khusus (int, double, String, char, bool, array), di dalam method wajib memberikan return value
    public String getNameString(String city, String address) {
        // System.out.println("My Name is " + name + ", address in " + address);
        return "My Name is " + city + ", address in " + address;
    }
}

class Rectangle extends Shape {

    // Method Int
    // Jika ada Method bertipe data khusus (int, double, String, char, bool, array), di dalam method wajib memberikan return value
    public int getCorner() {
        return 14;
    }

    // Super Method
    // Jika ada Method bertipe data khusus (int, double, String, char, bool, array), di dalam method wajib memberikan return value
    public int getParentCorner() {
        return super.getCorner(); // Super Keyword pada method digunakan untuk memanggil method dari class Parent
    }

    // Jika ada Method bertipe data khusus (int, double, String, char, bool, array), di dalam method wajib memberikan return value
    public String getString() {
        return "Hendro";
    }

    // Super Method
    public String getParentString() {
        return super.getString(); // Super Keyword pada method digunakan untuk memanggil method dari class Parent
    }
    public String getNameString(String city, String address) {
        return "My Name is " + city + ", address in " + address;
    }

    // Super Method
    public String getParentNameString(String city, String address) {
        return super.getNameString(city, address); // Super Keyword pada method digunakan untuk memanggil method dari class Parent
    }
}
