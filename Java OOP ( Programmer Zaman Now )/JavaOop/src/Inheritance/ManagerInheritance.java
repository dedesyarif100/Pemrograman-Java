// package Polimorfisme;

class ManagerInheritance extends Employee {
    String name;
    String company;

    // Method Overloading, adalah method yang dipanggil di class dirinya sendiri ( Class Parent )
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is Manager " + name);
    }
    ManagerInheritance(String name) {
        super(name);
        this.name = name;
    }

    ManagerInheritance(String name, String company){
        super(name);
        this.company = company;
    }

    // void sayHello(String name) {
    //     System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    // }
}
