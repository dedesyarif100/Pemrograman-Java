package SuperConstructor;

public class Manager {
    String name;
    String company;
    // Constructor
    Manager(String name){
        this.name = name;
    }

    Manager(String name, String company){
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }
}


