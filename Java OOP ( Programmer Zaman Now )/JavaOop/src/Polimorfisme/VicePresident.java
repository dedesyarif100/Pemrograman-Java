

class VicePresident extends ManagerInheritance {
    String names;

    // Super Constructor
    VicePresident(String name){
        super(name);
        this.name = name;
        names = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is VP " + names);
    }
}
