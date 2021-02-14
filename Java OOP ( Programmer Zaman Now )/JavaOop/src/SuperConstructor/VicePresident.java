package SuperConstructor;

class VicePresident extends Manager {

    // Super Constructor
    VicePresident(String company){
        super(company);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }
}
