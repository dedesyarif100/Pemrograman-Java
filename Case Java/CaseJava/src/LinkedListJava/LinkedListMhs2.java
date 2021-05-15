package LinkedListJava;

import java.util.Scanner;

public class LinkedListMhs2 {
    Integer id, nim, update;
    Double uts, uas;
    String nama, alamat, skill;
    LinkedListMhs2 next, prev;

    static Scanner integer = new Scanner(System.in);
    Scanner string = new Scanner(System.in);
    Scanner doubleValue = new Scanner(System.in);
    public void inputData() {
        System.out.print("Masukkan ID           : ");
        id = integer.nextInt();
        System.out.print("Masukkan Nim          : ");
        nim = integer.nextInt();
        System.out.print("Masukkan Nama         : ");
        nama = string.nextLine();
        System.out.print("Masukkan Alamat       : ");
        alamat = string.nextLine();
        System.out.print("Masukkan Skill        : ");
        skill = string.nextLine();
        System.out.print("Masukkan Nilai UTS    : ");
        uts = doubleValue.nextDouble();
        System.out.print("Masukkan Nilai UAS    : ");
        uas = doubleValue.nextDouble();
    }

    public void viewData() {
        System.out.println("| "+ id +" | "+ nim +" | "+ nama +" | "+ alamat +" | "+ skill +" | "+ uts +" | "+ uas +" | ");
    }

    public int inputIDupdate() {
        System.out.print("Input Update Berdasarkan ID : ");
        Scanner updateData = new Scanner(System.in);
        update = updateData.nextInt();
        return update;
    }

    public void InputUpdateData(LinkedListMhs2 selectData) {
        System.out.print("Masukkan Nim          : ");
        selectData.nim = integer.nextInt();
        System.out.print("Masukkan Nama         : ");
        selectData.nama = string.nextLine();
        System.out.print("Masukkan Alamat       : ");
        selectData.alamat = string.nextLine();
        System.out.print("Masukkan Skill        : ");
        selectData.skill = string.nextLine();
        System.out.print("Masukkan Nilai UTS    : ");
        selectData.uts = doubleValue.nextDouble();
        System.out.print("Masukkan Nilai UAS    : ");
        selectData.uas = doubleValue.nextDouble();
    }

    public static void main(String[] args) {
        int menu = 0, delete;
        LinkedList2 inputMenu = new LinkedList2();
        while (menu != 5 && menu <= 5) {
            System.out.print("1. Input\n2. View\n3. Update\n4. Delete\n5. Exit\n");
            System.out.print("Masukkan Menu : ");
            menu = integer.nextInt();
            if (menu == 1) {
                inputMenu.add();
                System.out.println("Tambah Data Selesai");
                System.out.println("-----------------------------------------\n");
            } else if (menu == 2) {
                inputMenu.view();
            } else if (menu == 3) {
                inputMenu.updateData();
            } else if (menu == 4) {
                System.out.print("\n1. Data Pertama\n2. Data Terakhir\n");
                System.out.print("Pilih Menu : ");
                delete = integer.nextInt();
                if (delete == 1) {
                    inputMenu.removeFirst();
                } else if (delete == 2) {
                    inputMenu.removeLast();
                } else {
                    System.out.println("Batas Maksimal hapus sampai 2 angka");
                }
            } else if (menu == 5) {
                System.out.println("Keluar");
            } else {
                System.out.println("Maksimal nomor sampai 4");
            }
        }
    }
}

class LinkedList2 {
    LinkedListMhs2 head, tail;
    public LinkedList2() { // Constructor
        head = null;
        tail = null;
    }

    public void add() {
        LinkedListMhs2 addData = new LinkedListMhs2();
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
            System.out.println("------------------------------------\n");
            return;
        } else {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS |");
            System.out.println("------------------------------------");
            LinkedListMhs2 viewData = head;
            while (viewData != null) {
                viewData.viewData();
                viewData = viewData.next;
            }
            System.out.println("View Data Selesai");
            System.out.println("-----------------------------------------\n");
        }
    }

    public void updateData() {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
        } else {
            // int update;
            LinkedListMhs2 send = new LinkedListMhs2();
            int save = send.inputIDupdate();
            // System.out.print("lewati ini");
            LinkedListMhs2 selectData = head;
            while (selectData != null) {
                if (selectData.id == save) {
                    System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS |");
                    System.out.println("------------------------------------");
                    System.out.println("| "+ selectData.id +" | "+ selectData.nim +" | "+ selectData.nama +" | "+ selectData.alamat +" | "+ selectData.skill +" | "+ selectData.uts +" | "+ selectData.uas +" | ");
                    System.out.println("Berhasil Masuk Pengujian");
                    System.out.println("Update Data : ");
                    send.InputUpdateData(selectData);
                    System.out.println("Data Berhasil Di Update");
                    System.out.println("------------------------------------\n");
                    break;
                } else {
                    selectData = selectData.next;
                }
            }
            System.out.println("ID TIDAK DITEMUKAN");
            System.out.println("------------------------------------\n");
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS |");
            System.out.println("------------------------------------");
            System.out.println("| "+ head.id +" | "+ head.nim +" | "+ head.nama +" | "+ head.alamat +" | "+ head.skill +" | "+ head.uts +" | "+ head.uas +" |");
            System.out.println("Data "+ head.nama +" Berhasil Dihapus");
            head = head.next;
            System.out.println("Data Pertama Berhasil Dihapus");
            System.out.println("------------------------------------\n");
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else if (head == tail) {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS |");
            System.out.println("------------------------------------");
            System.out.println("| "+ tail.id +" | "+ tail.nim +" | "+ tail.nama +" | "+ tail.alamat +" | "+ tail.skill +" | "+ tail.uts +" | "+ tail.uas +" |");
            System.out.println("Data "+ tail.nama +" Berhasil Dihapus");
            head = null;
            tail = null;
            System.out.println("Data Kembali NULL");
            System.out.println("------------------------------------\n");
        } else {
            System.out.println("| ID | NIM | Nama | Alamat | Skill | UTS | UAS |");
            System.out.println("------------------------------------");
            System.out.println("| "+ tail.id +" | "+ tail.nim +" | "+ tail.nama +" | "+ tail.alamat +" | "+ tail.skill +" | "+ tail.uts +" | "+ tail.uas +" |");
            System.out.println("Data "+ tail.nama +" Berhasil Dihapus");
            System.out.println("Data Terakhir Berhasil Dihapus");
            System.out.println("------------------------------------\n");
            LinkedListMhs2 removeLastData = head.next;
            LinkedListMhs2 backOff = head;
            while (removeLastData != tail) {
                removeLastData = removeLastData.next;
                backOff = backOff.next;
            }
            backOff.next = null;
            tail = backOff;
        }
    }
}