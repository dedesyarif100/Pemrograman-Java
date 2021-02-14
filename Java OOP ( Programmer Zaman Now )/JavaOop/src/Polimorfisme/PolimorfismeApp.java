package Polimorfisme;

public class PolimorfismeApp {
    public static void main(String[] args) {
        // Polimorfisme ------------------------------------------------------------------
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new Manager("Eko");
        employee.sayHello("Budi");

        employee = new VicePresident("Eko");
        employee.sayHello("Budi");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));
    }

    static void sayHello(Employee employee) {
        // Type Check & Casts ----------------------------------------------------------
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
