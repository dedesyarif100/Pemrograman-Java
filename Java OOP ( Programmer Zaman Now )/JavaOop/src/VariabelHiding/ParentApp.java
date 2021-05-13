// package VariabelHiding;

public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Eko";
        child.Wordl();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.Wordl();
        System.out.println(parent.name);
    }    
}
