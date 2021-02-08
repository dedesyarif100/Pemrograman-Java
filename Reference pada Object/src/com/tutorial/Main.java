// Reference pada Object --------------------------------------------------

package com.tutorial;

class Buku {
    int idBuku;
    String judul;
    String penulis;
    int tahunPembuatan;
    int harga;

    // Constructor --------------------------------------------------
    Buku(int idBuku, String judul, String penulis, int tahunPembuatan, int harga){
        this.idBuku = idBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunPembuatan = tahunPembuatan;
        this.harga = harga;
    }

    // Method tanpa return dan tanpa parameter
    void display() {
        System.out.println("Id Buku         : " + this.idBuku);
        System.out.println("Judul           : " + this.judul);
        System.out.println("Penulis         : " + this.penulis);
        System.out.println("Tahun Pembuatan : " + this.tahunPembuatan);
        System.out.println("Harga           : " + this.harga);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku buku_a = new Buku(01, "Algorithm & Data Structure", "Dede Syarifudin", 2018, 50000);
        buku_a.display();

        // Menampilkan address
        String addressBuku_a = Integer.toHexString(System.identityHashCode(buku_a));
        System.out.println(addressBuku_a);

        // assignment object
        Buku buku_b = new Buku(02, "Back end developer", "Hendro Rachmad", 2018, 50000);
        buku_b.display();

        // Menampilkan address
        String addressBuku_b = Integer.toHexString(System.identityHashCode(buku_b));
        System.out.println(addressBuku_b);

        // karena buku a dan buku b berada pada address atau referensi yang sama
        buku_a.judul = "Front End Developer";
        System.out.println("Ganti value --------------------------------------");
        buku_a.display();
        buku_b.display();

        // kita akan memasukkan object ke dalam method
        fungsi(buku_b);
        System.out.println("Output fungsi --------------------------------------");
        buku_a.display();
        buku_b.display();
    }
    
    public static void fungsi(Buku dataBuku) {
        String addressDataBuku = Integer.toHexString(System.identityHashCode(dataBuku));
        System.out.println("Address dalam fungsi " + addressDataBuku);
        dataBuku.penulis = "Trisuli Prasetyo";
    }
}