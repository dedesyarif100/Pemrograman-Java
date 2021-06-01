// package SuperConstructor;

public class ManagerApp {
    public static void main(String[] args) {
        var manager = new ManagerSuperConstructor("Dede");
        // manager.sayHello("Budi"); // Method Overloading

        var vp = new VicePresident("Hendro");
        vp.sayHello("Budi"); // Method Overloading
    }
}
