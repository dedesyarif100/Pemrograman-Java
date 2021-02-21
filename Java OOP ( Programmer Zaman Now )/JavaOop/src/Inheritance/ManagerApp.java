package Inheritance;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Dede";

        // Method Overloading, adalah method yang dipanggil di class dirinya sendiri ( Class Parent )
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "Hendro";

        // Method Overriding, adalah method yang dipanggil di class Child dari class Parent
        vp.sayHello("Guys");
        vp.sayHello("Rian");
    }
}
