package LinkedListJava;

import java.util.Scanner;

public class LinkedListMhs {
    int id, nim;
    String nama, jadwal, skill;
    LinkedListMhs next, prev; // Pointer

    public static Scanner integer = new Scanner(System.in); // Input Data
    public static Scanner string = new Scanner(System.in); // Input Data
    public void inputData() {
        System.out.print("Masukkan ID             : ");
        id = integer.nextInt();
        System.out.print("Masukkan Nama           : ");
        nama = string.nextLine();
        System.out.print("Masukkan NIM            : ");
        nim = integer.nextInt();
        System.out.print("Masukkan Jadwal         : ");
        jadwal = string.nextLine();
        System.out.print("Masukkan Skill          : ");
        skill = string.nextLine();
    }

    public void viewData() {
        System.out.println(" | "+ id +" | "+ nama +" | "+ nim +" | "+ jadwal +" | "+ skill +" | ");
    }

    public static void main(String[] args) {
        int menu = 0, delete;
        LinkedList inputMenu = new LinkedList(); // Instansiasi Object dari nama Class
        while (menu != 4) {
            System.out.print("1.Input\n2.View\n3.Delete\n4.Exit\n : ");
            System.out.print("Masukkan Menu = ");
            menu = integer.nextInt();
            if (menu == 1) {
                inputMenu.add();
            } else if (menu == 2) {
                inputMenu.view();
            } else if (menu == 3) {
                System.out.print("1.Data Pertama\n2.Data Terkahir\n : ");
                delete = integer.nextInt();
                if (delete == 1) {
                    inputMenu.removeFirst();
                } else if (delete == 2) {
                    inputMenu.removeLast();
                } else {
                    System.out.println("Batas maksimal hapus sampai angka 2");
                }
            } else if (menu == 4) {
                System.out.println("Keluar");
            } else {
                System.out.println("Maksimal Nomor Adalah 4");
            }
            System.out.println();
        }
    } 
}

class LinkedList {
    LinkedListMhs head, tail;
    public LinkedList() { // Constructor
        head = null;
        tail = null;
    }
    public void add() {
        LinkedListMhs addData = new LinkedListMhs();
        addData.inputData();
        if (head == null) {
            head = addData;
        } else {
            tail.next = addData;
        }
        tail = addData;
    }

    public void view() {
        if (head == null) {
            System.out.println("Data Kosong");
            return;
        } else {
            System.out.println("| ID | Nama | NIM | Jadwal | Skill |");
            System.out.println("------------------------------------");
            LinkedListMhs viewData = head;
            while (viewData != null) {
                viewData.viewData();
                viewData = viewData.next;
            }
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Data Kosong");
            return;
        } else {
            System.out.println("Data "+ head.nama +" Berhasil Dihapus");
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Data Kosong");
            return;
        }

        if (head == tail) {
            System.out.println("Data "+ tail.nama +" Berhasil Dihapus");
            head = null;
            tail = null;
            System.out.println("Data Kembali Null");
        } else {
            System.out.println("Data "+ tail.nama +" Berhasil Dihapus");
            LinkedListMhs removeLastData = head.next;
            LinkedListMhs prev = head;
            while (removeLastData != tail) {
                removeLastData = removeLastData.next;
                prev = prev.next;
            }
            prev.next = null;
            tail = prev;
        }
    }
}