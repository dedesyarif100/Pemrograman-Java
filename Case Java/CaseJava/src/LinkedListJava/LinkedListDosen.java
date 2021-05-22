package LinkedListJava;

import java.util.Scanner;

public class LinkedListDosen {
    Integer id_dosen, nim_dosen, update_dosen;
    String nama_dosen, alamat_dosen;
    LinkedListDosen head, tail, prev, next;
    Scanner integer = new Scanner(System.in);
    Scanner string = new Scanner(System.in);
    public void inputDataDosen(int idNumber) {
        System.out.print("ID TERBUAT OTOMATIS   : " + (id_dosen = idNumber) + "\n");
        id_dosen = idNumber;
        System.out.print("Masukkan Nim          : ");
        nim_dosen = integer.nextInt();
        System.out.print("Masukkan Nama         : ");
        nama_dosen = string.nextLine();
        System.out.print("Masukkan Alamat       : ");
        alamat_dosen = string.nextLine();
    }

    public void addDosen(int idNumber) {
        LinkedListDosen addData = new LinkedListDosen();
        LinkedListDosen tm = new LinkedListDosen();
        addData.inputDataDosen(idNumber);
        if (head == null) {
            head = addData;
            tail = addData;
            // System.out.println(head);
        } else {
            tm = tail;
            tail.next = addData;
            tail = addData;
            tail.prev = tm;
            // System.out.println(tail);
        }
    }

    public void viewDosen(int id_dosen) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("-------------------------------------------\n");
            return;
        } else {
            id_dosen = head.id_dosen;
            int menuView = 0;
            while (menuView <= 3) {
                System.out.print("\n1. View Berdasarkan ID\n2. View Berdasarkan Nilai Akhir\n");
                System.out.print("Masukkan Menu : ");
                Scanner integer = new Scanner(System.in);
                menuView = integer.nextInt();
                if (menuView == 1) {
                    System.out.println("| ID DOSEN | NIM DOSEN | NAMA DOSEN | ALAMAT DOSEN |");
                    System.out.println("--------------------------------------------------------------");
                    LinkedListDosen viewData = head;
                    while (viewData != null) {
                        viewData.viewData();
                        viewData = viewData.next;
                        id_dosen++;
                    }
                    System.out.println("View Data Selesai");
                    System.out.println("-----------------------------------------\n");
                    System.out.println("Cek Id Number di View : " + id_dosen);
                }
            }
        }
    }

    public void viewData() {
        System.out.println("| "+ id_dosen +" | "+ nim_dosen +" | "+ nama_dosen +" | "+ alamat_dosen +" | ");
    }

    public void editDosen(int id_dosen) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("-------------------------------------------\n");
        } else {
            LinkedListDosen send = new LinkedListDosen();
            int save = send.inputIDEditDosen();
            LinkedListDosen selectData = head;
            while (selectData != null) {
                if (selectData.id_dosen == save) {
                    System.out.println("| ID DOSEN | NIM DOSEN | NAMA DOSEN | ALAMAT DOSEN |");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("| " + selectData.id_dosen + " | " + selectData.nim_dosen + " | " + selectData.nama_dosen + " | " + selectData.alamat_dosen + " |");
                    System.out.println("Berhasil Masuk Pengujian");
                    System.out.println("Update Data : ");
                    send.inputEditDosen(selectData);
                    System.out.println("Data Berhasil Di Update");
                    System.out.println("------------------------------------\n");
                    break;
                } else {
                    selectData = selectData.next;
                }
            }
        }
    }

    public int inputIDEditDosen() {
        System.out.print("Input Update Berdasarkan ID : ");
        Scanner updateData = new Scanner(System.in);
        update_dosen = updateData.nextInt();
        return update_dosen;
    }

    public void inputEditDosen(LinkedListDosen selectData) {
        System.out.print("Masukkan Nim          : ");
        selectData.nim_dosen = integer.nextInt();
        System.out.print("Masukkan Nama Dosen   : ");
        selectData.nama_dosen = string.nextLine();
        System.out.print("Masukkan Alamat Dosen : ");
        selectData.alamat_dosen = string.nextLine();
    }

    public void removeFirstDosen(int id_dosen) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else {
            System.out.println("| ID DOSEN | NIM DOSEN | NAMA DOSEN | ALAMAT DOSEN |");
            System.out.println("--------------------------------------------------------------");
            System.out.println("| " + head.id_dosen + " | " + head.nim_dosen + " | " + head.nama_dosen + " | " + head.alamat_dosen + " |");
            System.out.println("Data " + head.id_dosen + " Berhasil Dihapus");
            head = head.next;
            System.out.println("Data Pertama Berhasil Dihapus");
            System.out.println("------------------------------------\n");
        }
    }

    public void removeLastDosen() {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else if (head == tail) {
            System.out.println("| ID DOSEN | NIM DOSEN | NAMA DOSEN | ALAMAT DOSEN |");
            System.out.println("--------------------------------------------------------------");
            System.out.println("| " + tail.id_dosen + " | " + tail.nim_dosen + " | " + tail.nama_dosen + " | " + tail.alamat_dosen + " |");
            System.out.println("Data "+ tail.id_dosen +" Berhasil Dihapus");
            head = null;
            tail = null;
            System.out.println("Data Kembali NULL");
            System.out.println("------------------------------------\n");
        } else {
            System.out.println("| ID DOSEN | NIM DOSEN | NAMA DOSEN | ALAMAT DOSEN |");
            System.out.println("--------------------------------------------------------------");
            System.out.println("| " + tail.id_dosen + " | " + tail.nim_dosen + " | " + tail.nama_dosen + " | " + tail.alamat_dosen + " |");
            System.out.println("Data "+ tail.id_dosen +" Berhasil Dihapus");
            System.out.println("Data Terakhir Berhasil Dihapus");
            System.out.println("------------------------------------\n");
            LinkedListDosen removeLastData = head.next;
            LinkedListDosen backOff = head;
            while (removeLastData != tail) {
                removeLastData = removeLastData.next;
                backOff = backOff.next;
            }
            backOff.next = null;
            tail = backOff;
        }
    }

    public void removeByIdDosen() {
        
    }
}
