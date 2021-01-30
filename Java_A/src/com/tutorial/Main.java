// Class & Object , Constructor ---------------------------------------------------------
package com.tutorial;

class Mahasiswa {
    String nama;
    int NIM;
    String jurusan;
    double IPK;
    int umur;


    // Constructor adalah fungsi yang dijalankan saat pertama kali object dibuat
    // Mahasiswa() {
    //     System.out.println("Ini adalah constructor");
    // }

    // Constructor Dengan Parameters --------------------------------
    Mahasiswa(String names, int nbi, String department, double value, int age) {
        nama = names;
        NIM = nbi;
        jurusan = department;
        IPK = value;
        umur = age;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
        System.out.println(IPK);
        System.out.println(umur);
    }
}

public class Main {
    
    public static void main(String[] args) {

        // // Instansiasi / membuat object --------------------------------
        // Mahasiswa mahasiswaUnpas = new Mahasiswa();
        // mahasiswaUnpas.nama = "Dede Syarifudin";
        // mahasiswaUnpas.NIM = 12;
        // mahasiswaUnpas.jurusan = "Teknik Informatika";
        // mahasiswaUnpas.IPK = 35;
        // mahasiswaUnpas.umur = 25;
        
        // System.out.println(mahasiswaUnpas.nama);
        // System.out.println(mahasiswaUnpas.NIM);
        // System.out.println(mahasiswaUnpas.jurusan);
        // System.out.println(mahasiswaUnpas.IPK);
        // System.out.println(mahasiswaUnpas.umur);

        // System.out.println("--------------------------------------");
        // Mahasiswa mahasiswaUI = new Mahasiswa();
        // mahasiswaUI.nama = "Hendro Rachmad";
        // mahasiswaUI.NIM = 14;
        // mahasiswaUI.jurusan = "Teknik Informatika";
        // mahasiswaUI.IPK = 40;
        // mahasiswaUI.umur = 25;
        
        // System.out.println(mahasiswaUI.nama);
        // System.out.println(mahasiswaUI.NIM);
        // System.out.println(mahasiswaUI.jurusan);
        // System.out.println(mahasiswaUI.IPK);
        // System.out.println(mahasiswaUI.umur);

        // Object dari Constructor --------------------------------
        Mahasiswa mahasiswaUntag = new Mahasiswa("Dede Syarifudin", 1461505260, "Informatika", 3.5, 22);
        System.out.println("--------------------------------------------------");
        Mahasiswa mahasiswaUnpas = new Mahasiswa("Hendro Rachmad", 1461505250, "Informatika", 3.8, 22);
        System.out.println("--------------------------------------------------");
        Mahasiswa mahasiswaUnitomo = new Mahasiswa("Riand Pratama", 1461505252, "Informatika", 3.6, 22);
    }
}
