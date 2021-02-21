package Inheritance;

class Manager {
    String name;

    // Method Overloading, adalah method yang dipanggil di class dirinya sendiri ( Class Parent )
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }
}
