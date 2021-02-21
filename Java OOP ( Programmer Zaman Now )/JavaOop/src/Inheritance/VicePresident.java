package Inheritance;

class VicePresident extends Manager {
    // Method Overriding, adalah method yang dipanggil di class Child dari class Parent
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }
}
