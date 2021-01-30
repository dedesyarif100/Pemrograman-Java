// public dan private keywords ---------------------------------------------------------

package com.tutorial;

class Player{
    String name; // default, dia akan bisa dibaca dan ditulis dari luar class
    public int exp; // public, dia akan bisa dibaca dan ditulis dari luar class
    private int health; // private, hanya akan bisa dibaca dan ditulis di dalam class saja

    Player(String name, int exp, int health) {
        this.name = name;
        this.exp = exp;
        this.health = health;
    }

    // default modifier access
    void display(){
        tambahExp(); // contoh mengakses private methods
        System.out.println("Name    : " + this.name);
        System.out.println("Exp     : " + this.exp);
        System.out.println("Health  : " + this.health); // membaca, namun di dalam class
    }

    // public
    public void ubahName(String nameBaru) {
        this.name = nameBaru;
    }

    // private
    private void tambahExp() {
        this.exp += 100;
    }
}

public class Main {
    public static void main(String[] args) {
        Player playerJava = new Player("Dede", 0, 100);

        // default
        System.out.println(playerJava.name); // membaca data
        playerJava.name = "Hendro"; // menulis data
        System.out.println(playerJava.name); // membaca data

        // public
        System.out.println(playerJava.exp);
        playerJava.exp = 100;
        System.out.println(playerJava.exp);

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