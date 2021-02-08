// Method ---------------------------------------------------------
package com.tutorial;

class Buah {
    String apel;
    String nanas;
    String pisang;
    String tomat;
    int number1;
    double number2;
    boolean myBool;

    // Constructor ------------
    Buah(String buahApel, String buahNanas, String buahPisang, String buahTomat, int number1, double number2, boolean myBool){
        this.apel = buahApel;
        this.nanas = buahNanas;
        this.pisang = buahPisang;
        this.tomat = buahTomat;
        this.number1 = number1;
        this.number2 = number2;
        this.myBool = myBool;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Buah " + this.apel);
        System.out.println("Buah " + this.nanas);
        System.out.println("Buah " + this.pisang);
        System.out.println("Buah " + this.tomat);
        System.out.println(this.number1);
        System.out.println(this.number2);
        System.out.println(this.myBool);
    }

    // method tanpa return dan dengan parameter
    void setValue(String apel, String nanas, String pisang, String tomat){
        this.apel = apel;
        this.nanas = nanas;
        this.pisang = pisang;
        this.tomat = tomat;
    }
}

class Hewan {
    String kucing;
    String anjing;
    String burung;
    String bebek;

    // Constructor ------------
    Hewan(String kucing, String anjing, String burung, String bebek) {
        this.kucing = kucing;
        this.anjing = anjing;
        this.burung = burung;
        this.bebek = bebek;
    }

    // method tanpa return dan tanpa parameter 1
    void show() {
        System.out.println("Hewan : " + this.kucing);
        System.out.println("Hewan : " + this.anjing);
        System.out.println("Hewan : " + this.burung);
        System.out.println("Hewan : " + this.bebek);
    }

    // method tanpa return dan dengan parameter 1
    void setValue(String kucing, String anjing, String burung, String bebek) {
        this.kucing = kucing;
        this.anjing = anjing;
        this.burung = burung;
        this.bebek = bebek;
    }

    // method dengan return tapi tidak ada parameter
    String getHewan() {
        return this.kucing + ", " + this.anjing + ", " + this.burung + ", " + this.bebek;
    }

    // method dengan return dan dengan parameter
    String text(String message) {
        return message + "ini adalah hewan " + this.kucing;
    }
}

public class MethodJava2 {
    public static void main(String[] args) {
        System.out.println("Tampilkan Class Buah");
        Buah data_1 = new Buah("Ini apel", "Ini nanas", "ini Pisang", "Ini tomat", 2021, 2022.1, true);
        Buah data_2 = new Buah("This is Apple", "This is Nanas", "This is Pisang", "This is Tomat", 2021, 2022.2, false);

        // Tampilkan method tanpa return dan tanpa parameter
        System.out.println("Tampilkan method tanpa return dan tanpa parameter");
        data_1.show();

        // Tampilkan method tanpa return dan dengan parameter
        System.out.println("Tampilkan method tanpa return dan dengan parameter");
        data_2.setValue("Mangga", "Kelengkeng", "Jeruk", "Duku");
        data_2.show();

        System.out.println("Tampilkan Class Hewan");
        Hewan hewan_1 = new Hewan("Kucing", "anjing", "burung", "bebek");
        Hewan hewan_2 = new Hewan("Kucing", "anjing", "burung", "bebek");

        // Tampilkan method tanpa return dan tanpa parameter
        System.out.println("Tampilkan method tanpa return dan tanpa parameter");
        hewan_1.show();

        // Tampilkan method tanpa return dan dengan parameter
        System.out.println("Tampilkan method tanpa return dan dengan parameter");
        hewan_2.setValue("ayam", "babi", "ikan", "gajah");
        hewan_2.show();

        // Tampilkan method dengan return tapi tidak ada parameter
        System.out.println("Tampilkan method dengan return dan tanpa parameter");
        System.out.println(hewan_1.getHewan());

        // Tampilkan method dengan return dan dengan parameter
        System.out.println("Tampilkan method dengan return dan dengan parameter");
        String data = hewan_1.text("Hallo, ");
        System.out.println(data);
    }
}
