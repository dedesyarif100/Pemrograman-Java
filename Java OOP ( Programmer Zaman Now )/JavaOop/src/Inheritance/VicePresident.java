

class VicePresident extends Manager {

    // Super Constructor
    VicePresident(String name){
        super(name);
    }
    // Method Overriding, adalah method yang dipanggil di class Child dari class Parent
    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }
}
