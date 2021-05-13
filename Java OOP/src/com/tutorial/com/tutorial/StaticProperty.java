// Static / class Methods ----------------------------------------------

package com.tutorial;

import java.util.ArrayList;

class Player {
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<String>();
    
    private String mahasiswa;

    // Constructor dengan parameter ------------------------------
    Player(String name) {
        this.mahasiswa = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.mahasiswa);
    }

    void show() {
        System.out.println("Player name = " + this.mahasiswa);
    }

    // static method ------------------------------------
    static void showNumberOfPlayer() {
        System.out.println(Player.numberOfPlayer);
    }

    static ArrayList<String> getNames() {
        return Player.nameList;
    }
}

class Matkul {

    private static ArrayList<String> matkulList = new ArrayList<String>();

    String mataKuliah;

    Matkul(String ilkom) {
        this.mataKuliah = ilkom;
        Matkul.matkulList.add(this.mataKuliah);
    }

    void show() {
        System.out.println("Nama matkul = " + this.mataKuliah);
    }

    static ArrayList<String> getMatkul() {
        return Matkul.matkulList;
    }
}

public class StaticProperty {
    public static void main(String[] args) {
        Player player1 = new Player("Dede");
        Player player2 = new Player("Hendro");
        Player player3 = new Player("Trisuli");
        Player player4 = new Player("Rian");

        // player1.show();
        // player2.show();
        // player3.show();
        // player4.show();

        // Player.showNumberOfPlayer();

        System.out.println("Names = " + Player.getNames());


        Matkul matkul1 = new Matkul("Algoritma");
        Matkul matkul2 = new Matkul("Struktur Data");
        Matkul matkul3 = new Matkul("Statistik");
        Matkul matkul4 = new Matkul("Java");

        System.out.println("Mata Kuliah = " + Matkul.getMatkul());
    }
}
