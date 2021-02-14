package VariabelHiding;

public class Parent {
    String name;
    void Wordl() {
        System.out.println("Hello World in Parent");
    }
}

class Child extends Parent {
    String name;
    void Wordl() {
        System.out.println("Hello World in Child");
        System.out.println("Parent name is " + super.name);
    }
}
