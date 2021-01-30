// Method ---------------------------------------------------------

package com.tutorial;

class Mahasiswa {
    // Variabel
    String nama;
    int NIM;
    String jurusan;

    // Constructor adalah fungsi yang dijalankan saat pertama kali object dibuat
    // Constructor Dengan Parameters --------------------------------
    Mahasiswa(String nama, int NIM, String jurusan) {
        // System.out.println(nama); // Variabel ini memanggil local scope
        // System.out.println(this.nama); // Variabel ini variabel di global scope, sama seperti object
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    // method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama    : " + this.nama);
        System.out.println("NIM     : " + this.NIM);
        System.out.println("Jurusan : " + this.jurusan);
    }

    // method tanpa return dan dengan parameter
    void setValue(String nama, int NIM, String jurusan) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
    }

    // method dengan return tapi tidak ada parameter
    String getNama() {
        return this.nama;
    }
    int getNim() {
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String sayHi(String message){
        return message + " juga, nama saya adalah " + this.nama;
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswaUNPAS = new Mahasiswa("Dede", 1461505260, "Informatika");
        Mahasiswa mahasiswaUNDIP = new Mahasiswa("Hendro", 1461505252, "Psikologi");
        Mahasiswa mahasiswaUI = new Mahasiswa("Trisuli", 1461505052, "Informatika");
        // System.out.println(mahasiswaUNPAS.nama);
        // System.out.println(mahasiswaUNPAS.NIM);
        // test();

        
        // Tampilkan method tanpa return dan tanpa parameter
        System.out.println("Tampilkan method tanpa return dan tanpa parameter");
        mahasiswaUNPAS.show();
        System.out.println("-----------------------------------------------");
        mahasiswaUNDIP.show();
        System.out.println("-----------------------------------------------");
        mahasiswaUI.show();
        System.out.println("-----------------------------------------------");

        // Tampilkan method tanpa return dan dengan parameter
        System.out.println("Tampilkan method tanpa return dan dengan parameter");
        mahasiswaUNDIP.setValue("Febby", 1461505280, "Psikologi anak");
        mahasiswaUNDIP.show();

        // Tampilkan method dengan return tapi tidak ada parameter
        System.out.println("Tampilkan method dengan return tapi tidak ada parameter");
        System.out.println(mahasiswaUNPAS.getNama());
        System.out.println(mahasiswaUNPAS.getNim());
        
        // Tampilkan method dengan return tapi tidak ada parameter
        System.out.println("Tampilkan method dengan return dan dengan parameter");
        String data = mahasiswaUI.sayHi("Hallo");
        System.out.println(data);
    }

    // Ini adalah method ----------------------------------------
    static void test() {
        System.out.println("ini adalah method test");
    }
}