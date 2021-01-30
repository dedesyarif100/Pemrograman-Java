// Method ---------------------------------------------------------
package com.tutorial;

class Kota {
    String surabaya;
    String sidoarjo;
    String gresik;
    String lamongan;

    Kota(String surabaya, String sidoarjo, String gresik, String lamongan) {
        this.surabaya = surabaya;
        this.sidoarjo = sidoarjo;
        this.gresik = gresik;
        this.lamongan = lamongan;
    }

    // Method tanpa return & tanpa parameter
    void showKota() {
        System.out.println("Kota : " + this.surabaya);
        System.out.println("Kota : " + this.sidoarjo);
        System.out.println("Kota : " + this.gresik);
        System.out.println("Kota : " + this.lamongan);
    }

    // Method tanpa return & dengan parameter
    void setValue(String surabaya, String sidoarjo, String gresik, String lamongan) {
        this.surabaya = surabaya;
        this.sidoarjo = sidoarjo;
        this.gresik = gresik;
        this.lamongan = lamongan;
    }

    // Method dengan return & tanpa parameter
    String getSurabaya() {
        return this.surabaya;
    }

    String getSidoarjo() {
        return this.sidoarjo;
    }

    String getGresik() {
        return this.gresik;
    }

    String getLamongan() {
        return this.lamongan;
    }

    // Method dengan return & dengan parameter
    String message(String message) {
        return  "ini adalah kota " + this.surabaya + ", " + message + 
                "\nini adalah kota " + this.sidoarjo + ", " + message +
                "\nini adalah kota " + this.gresik + ", " + message +
                "\nini adalah kota " + this.lamongan + ", " + message;
    }
}

public class MethodJava3 {
    public static void main(String[] args) 
    {
        // Method tanpa return & tanpa parameter
        System.out.println("\nApply Data 1");
        Kota applyKota1 = new Kota("Surabaya", "Sidoarjo", "Gresik", "Lamongan");
        applyKota1.showKota();

        // Method tanpa return & dengan parameter
        System.out.println("\nApply Data 2");
        Kota applyKota2 = new Kota("Surabaya", "Sidoarjo", "Gresik", "Lamongan");
        applyKota2.setValue("SBY", "SDA", "GRK", "LMG");
        applyKota2.showKota();

        // Method dengan return & tanpa parameter
        System.out.println("\nApply Data 3");
        System.out.println(applyKota1.getSurabaya());
        System.out.println(applyKota1.getSidoarjo());
        System.out.println(applyKota1.getGresik());
        System.out.println(applyKota1.getLamongan());

        // Method dengan return & dengan parameter
        System.out.println("\nApply Data 4");
        System.out.println("Tampilkan method dengan return dan dengan parameter");
        String data = applyKota1.message("Jawa Timur");
        System.out.println(data);
    }
}
