package Parent;

// import SuperKeyword.Employee;
import Fruits.*;
// import Fruits.Fruits;
// import Fruits.FruitsApp;
// package VariabelHiding;

public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Eko";
        child.Wordl();
        // System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.Wordl();

        // Rectangle shape = new Rectangle();

        hallo hallo = new hallo();

        Fruits fruits = new Fruits();
        fruits.Buah();

        FruitsApp fruitsApp = new FruitsApp();
        fruitsApp.apply();
        // System.out.println(parent.name);

        // Employee sape = new Employee();
        // sape.sayHello();
    }    
}
