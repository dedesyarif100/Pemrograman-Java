// Single LinkedList Program -----------------------------------------------------------------------
import java.util.Scanner;

import javax.xml.crypto.Data;

public class GabunganLinkedListBaru {
    public static void main(String[] args) {
        GabunganLinkedListBaruNewClass LinkedList = new GabunganLinkedListBaruNewClass();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah = ");
        int jumlahData = input.nextInt();

        for (int c = 1; c <= jumlahData; c++) {
            LinkedList.addData(c);
        }

        Scanner enter = new Scanner(System.in);
        System.out.print("Enter Data Ketika Mencapai Angka = ");
        int enterData = enter.nextInt();

        GabunganLinkedListBaruNewClass current = LinkedList.head;
        int x = 1;
        while (current != null) {
            if (x == enterData) {
                x = 1;
                System.out.print(current.data + ", ");
                System.out.println();
            } else {
                System.out.print(current.data + ", ");
                x++;
            }
            current = current.next;
        }
    }
}

class GabunganLinkedListBaruNewClass {
    GabunganLinkedListBaruNewClass current, next, prev, head, tail;
    int data;

    // Constructor tanpa parameter
    GabunganLinkedListBaruNewClass() { 
        next = null;
        prev = null;
        head = null;
        // tail = null;
    }

    // Constructor dengan parameter
    GabunganLinkedListBaruNewClass(int dataValue) {
        data = dataValue;
    }

    // Method / Fungsi dengan type Object hak akses Public
    public GabunganLinkedListBaruNewClass getNext() {
        return next;
    }

    // Method / Fungsi addData
    public void addData( int data ) {
        if (head == null) {
            // Constructor dengan parameter disimpan di variabel temp type object
            GabunganLinkedListBaruNewClass temp = new GabunganLinkedListBaruNewClass(data);
            // Variabel temp type object disimpan di variabel head type object
            head = temp; // head == 1
            // tail = temp;
            // current = temp;
        } else if (head != null) {
            // Head ditampung variabel temp2 type object, code ini yang membuat single LinkedList
            GabunganLinkedListBaruNewClass temp2 = head;
            // Ketika temp2 dijalankan pertama kali, saat diuji di while dia bernilai false
            while (temp2.getNext() != null) {
                temp2 = temp2.getNext();
            }
            // Ketika Fungsi addData dijalankan kedua kalinya, nilai yang dikirim disimpan di dalam constructor, lalu disimpan ke dalam variabel temp bertype object
            // Variabel temp bertype object, disimpan ke dalam Variabel temp2(head), namun pada node yang selanjutnya
            GabunganLinkedListBaruNewClass temp = new GabunganLinkedListBaruNewClass(data);
            temp2.next = temp;
            // Setelah melewati code ini, sekarang LinkedList telah memiliki 2 node
            // System.out.println(current.getNext());
        }
    }
}



// Single LinkedList Cara Manual --------------------------------------------------------------------------

        // GabunganLinkedListBaruNewClass newDataA = new GabunganLinkedListBaruNewClass();
        // newDataA.addData(1);
        // GabunganLinkedListBaruNewClass newDataB = new GabunganLinkedListBaruNewClass();
        // newDataB.addData(2);

        // LinkedList.next = newDataA; // node 1
        // LinkedList.prev = null; // null

        // LinkedList.next.next = newDataB; // node 2 newDataA.next
        // LinkedList.next.next.prev = newDataA; // node 1
        // GabunganLinkedListBaruNewClass LinkedList = new GabunganLinkedListBaruNewClass();
        // LinkedList.addData(1);
        // LinkedList.addData(2);
        // LinkedList.addData(3);