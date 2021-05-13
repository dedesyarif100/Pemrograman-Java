// Static / class attribute ----------------------------------------------

package com.tutorial;

class Display {
    // sesuatu yang berhubungan dengan static, akan menempel ke classnya
    public static String type = "Ini type"; // static variabel
    public static String kata = "Ini kata"; // static variabel
    public static int number;
    private String name; // dynamic variabel

    Display(String name) {
        this.name = name;
    }

    void setType(String typeInput) {
        // type = typeInput;  // alternatif 1
        // this.type = typeInput;  // alternatif 2
        Display.type = typeInput;  // alternatif 3
    }

    void setKata(String kataInput) {
        kata = kataInput;
    }

    void setNumber(int numberInput) {
        number = numberInput;
    }

    void show() {
        System.out.println("Display name = " + this.name);
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        Display display1 = new Display("Monitor"); // new object
        display1.show();

        Display display2 = new Display("Smartphone"); // new object
        display2.show();

        Display applyDisplay = new Display("Tampilkan Display");
        applyDisplay.show();

        // setting method setType
        applyDisplay.setType("Tampilan");
        applyDisplay.setKata("Input Kata");
        applyDisplay.setNumber(12);

        // tampilkan static variabel atau class variabel
        System.out.println("Menampilkan static variabel");
        System.out.println(applyDisplay.type);
        System.out.println(applyDisplay.kata);
        System.out.println(applyDisplay.number);
        System.out.println(Display.type);
        System.out.println(Display.kata);
        System.out.println(Display.number);
    }
}