// public dan private keywords ---------------------------------------------------------

package com.tutorial;

class Player{
    String name; // default, dia akan bisa dibaca dan ditulis dari luar class
    public int exp; // public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; // private, hanya akan bisa dibaca dan ditulis di dalam class saja
    private int number;

    // Constructor -----------------------------------------------------
    Player(String name, int exp, int health, int number) {
        this.name = name;
        this.exp = exp;
        this.health = health;
        this.number = number;
    }

    // default modifier access For Private Variabel & method -----------------------------------------------------
    void display(){
        tambahExp(); // contoh mengakses private methods
        System.out.println("Health  : " + this.health); // membaca, namun di dalam class
        System.out.println("Number  : " + this.number); // membaca, namun di dalam class
    }

    // public method
    public void ubahName(String nameBaru) {
        this.name = nameBaru;
    }

    // private method
    private void tambahExp() {
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Player playerJava = new Player("Dede", 0, 100, 299);

        // default
        System.out.println(playerJava.name); // membaca data
        playerJava.name = "Hendro"; // menulis data
        System.out.println(playerJava.name); // membaca data

        // public
        System.out.println(playerJava.exp);
        playerJava.exp = 100;
        System.out.println(playerJava.exp);
        // System.out.println(playerJava.health);

        // private (tidak bisa diakses)
        // System.out.println(playerJava.health);
        // playerJava.health = 100;
        // System.out.println(playerJava.health);
 

        // method

        // default
        playerJava.display();

        // public
        playerJava.ubahName("Trisuli");
        playerJava.display();

        // private (tidak bisa diakses)
        // playerJava.tambahExp();
    }
}