package SuperKeyword;

public class Shape {
    String city; // FIELD
    String address;
    
    // Method Int
    int getCorner() {
        return 12;
    }
    // Method String
    String getString() {
        return "Dede";
    }
    // Method String
    String getNameString(String city, String address) {
        // System.out.println("My Name is " + name + ", address in " + address);
        return "My Name is " + city + ", address in " + address;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 14;
    }

    // Super Method
    int getParentCorner() {
        return super.getCorner();
    }

    String getString() {
        return "Hendro";
    }

    // Super Method
    String getParentString() {
        return super.getString();
    }
    String getNameString(String city, String address) {
        return "My Name is " + city + ", address in " + address; 
    }

    // Super Method
    String getParentNameString(String city, String address) {
        return super.getNameString(city, address);
    }
}
