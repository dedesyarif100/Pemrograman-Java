package Inheritance;

class VicePresident extends Manager {
    // Method Overriding
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }
}
