// Penjumlahan 2 matrik secara dinamis
package Matriks;

import java.util.Scanner;
public class Matriks3 {

    public static void main(String[] args) {
        int jumlahBaris, jumlahKolom;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Membuat Matriks Dinamis ===");

        System.out.print("Jumlah indeks baris martriks : ");
        jumlahBaris = scanner.nextInt();
        System.out.print("Jumlah indeks kolom martriks : ");
        jumlahKolom = scanner.nextInt();
        Integer[][] array = new Integer[jumlahBaris][jumlahKolom];

        for (int i = 0; i < jumlahBaris; i++) 
        {
            for (int j = 0; j < jumlahKolom; j++) 
            {
                System.out.print("Masukan isi indeks beris ke " + i + " kolom ke " + j + " : ");
                array[i][j] = scanner.nextInt();
            }
            System.out.println("-------------------------------------------");
        }

        System.out.println();
        System.out.println("berikut adalah isi array yang tadi dimasukan:");
        for (int i = 0; i < jumlahBaris; i++) 
        {
            for (int j = 0; j < jumlahKolom; j++) 
            {
                System.out.println("Isi indeks baris ke " + i + " kolom ke " + j + " adalah : " + array[i][j]);
            }
            System.out.println("-------------------------------------------");
        }
        
        System.out.println();
        System.out.println("Bentuk matriks :");
        for (int i = 0; i < jumlahBaris; i++) 
        {
            for (int j = 0; j < jumlahKolom; j++) 
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}