

public class ManagerApp {
    public static void main(String[] args) {
        ManagerInheritance manager = new ManagerInheritance("manager test");
        manager.name = "Dede";

        // Method Overloading, adalah method yang dipanggil di class dirinya sendiri ( Class Parent )
        manager.sayHello("Budi");

        VP vp = new VP("Vice President test");
        vp.name = "Hendro";

        // Method Overriding, adalah method yang dipanggil di class Child dari class Parent
        vp.sayHello("Guys");
        vp.sayHello("Rian");
    }
}
