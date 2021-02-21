package SuperConstructor;

class VicePresident extends Manager {

    // Super Constructor
    // Constructor ini wajib dibuat di class Child, jika tidak maka akan menyebabkan error
    VicePresident(String name) {
        super(name); // Keyword Super digunakan untuk memanggil field yang ada di class Parent
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name Is VP " + this.name);
    }
}
