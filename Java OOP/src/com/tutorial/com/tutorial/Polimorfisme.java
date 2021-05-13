// Polimorfisme ---------------------------------
package com.tutorial;

class Mahasiswa1 {
    void maba() {
        System.out.println("Ini maba");
    }
}

class Universitas extends Mahasiswa1 {
    void maba() {
        System.out.println("Ini bukan maba");
    }
}

class Kampus extends Mahasiswa1 {
    void maba() {
        System.out.println("Ini Mahasiswa1 lama");
    }
}

public class Polimorfisme {
    public static void main(String[] args) {
        Mahasiswa1 Mahasiswa1 = new Mahasiswa1();
        Mahasiswa1.maba();
        
        Mahasiswa1 universitas = new Universitas();
        universitas.maba();
        
        Mahasiswa1 kampus = new Kampus();
        kampus.maba();
    }    
}
