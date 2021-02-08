// Getter & setter ( Encapsulasi ) ------------------------------------------------------------

package com.tutorial;

class Data {
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    // constructor dari class Data
    public Data(){
        this.intPublic = 5;
        this.intPrivate = 7;
    }

    // constructor dari class Data
    public void display(){
        System.out.println("variabel intPublic = " + this.intPublic);
        System.out.println("variabel intPrivate = " + this.intPrivate);
        System.out.println("variabel doublePrivate = " + this.doublePrivate); // 0.05
    }

    // getter
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // setter
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran{
    private double diameter;

    // constructor dari class Lingkaran
    public Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // setter
    public void setJari2(double jari2){
        this.diameter = jari2 * 2;
    }

    // getter
    public double getJari2(){
        return this.diameter / 4;
    }

    // getter
    public double getLuas(){
        return 3.14 * diameter * diameter / 4;
    }
}

public class Main{
    public static void main(String[] args) {
        Data object = new Data();
        // read and write dengan menggunakan public
        System.out.println("Visibility Public ------------------------------");
        object.intPublic = 10; // write
        System.out.println("variabel intPublic = " + object.intPublic); // read

        // read only (kita bisa menggunakan GETTER)
        System.out.println("Visibility Private ------------------------------");
        int angka = object.getIntPrivate();
        System.out.println("getter intPrivate : " + angka);

        // write only (kita hanya bisa menulis SETTER)
        object.setDoublePrivate(0.05);
        object.display(); // menampilkan output dari object

        // gabungkan read dan write dengan setter dan getter
        System.out.println("Output Class Lingkaran ------------------------------");
        Lingkaran objectLingkaran = new Lingkaran(4);
        System.out.println("jari-jari / 4 : " + objectLingkaran.getJari2()); // jari-jari = 1
        objectLingkaran.setJari2(14);
        System.out.println("jari-jari : " + objectLingkaran.getJari2()); // jari-jari = 7
        System.out.println("Luas : " + objectLingkaran.getLuas()); // untuk menghitung luas, diameter = 28
    }
}