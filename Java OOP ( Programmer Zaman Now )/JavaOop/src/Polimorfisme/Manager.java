

class Manager extends Employee {
    String name;
    String company;
    String names;

    // Super Constructor
    Manager(String name){
        super(name);
        this.name = name;
        names = name;
    }

    // Manager(String name, String company){
    //     super(name);
    //     this.company = company;
    // }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is Manager " + names);
    }
}


