package Fruits;

public class Fruits {
    Integer idFruits;
    String name;
    Double price;
    public void Buah() {
        System.out.println("ID : " + idFruits + "\nNAME : " + name + "\nPRICE : " + price);
    }
}

class FruitsChild extends Fruits {

}
