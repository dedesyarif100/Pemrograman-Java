// Polimorfisme ---------------------------------
package com.tutorial;

class Mahasiswa {
    void maba() {
        System.out.println("Ini maba");
    }
}

class Universitas extends Mahasiswa {
    void maba() {
        System.out.println("Ini bukan maba");
    }
}

class Kampus extends Mahasiswa {
    void maba() {
        System.out.println("Ini mahasiswa lama");
    }
}

public class Polimorfisme {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.maba();
        
        Mahasiswa universitas = new Universitas();
        universitas.maba();
        
        Mahasiswa kampus = new Kampus();
        kampus.maba();
    }    
}
