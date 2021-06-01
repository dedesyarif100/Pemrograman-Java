// package SuperConstructor;

public class ManagerSuperConstructor {
    String name;
    String company;
    // Constructor
    ManagerSuperConstructor(String name){
        this.name = name;
    }

    ManagerSuperConstructor(String name, String company){
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }
}


