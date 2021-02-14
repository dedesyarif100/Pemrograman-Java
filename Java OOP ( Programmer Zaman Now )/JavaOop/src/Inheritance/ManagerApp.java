package Inheritance;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Dede";
        // Method Overloading
        manager.sayHello("Budi");

        var vp = new VicePresident();
        vp.name = "Hendro";
        // Method Overriding
        vp.sayHello("Guys");
        vp.sayHello("Rian");
    }
}
