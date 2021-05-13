

class Manager extends Employee {
    String name;
    String company;

    // Method Overloading, adalah method yang dipanggil di class dirinya sendiri ( Class Parent )
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    }
    Manager(String name){
        super(name);
        this.name = name;
    }

    Manager(String name, String company){
        super(name);
        this.company = company;
    }

    // void sayHello(String name) {
    //     System.out.println("Hi " + name + ", My Name Is Manager " + this.name);
    // }
}
