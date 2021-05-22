package LinkedListJava;

import java.util.Scanner;

public class LinkedListRelasiPerusahaan {
    Integer id_relasiPerusahaan, update_relasiPerusahaan;
    String nama_perusahaan, nama_alumni;
    LinkedListRelasiPerusahaan head, tail, prev, next;
    Scanner integer = new Scanner(System.in);
    Scanner string = new Scanner(System.in);
    public void addRelasiPerusahaan(int idNumber) {
        LinkedListRelasiPerusahaan addData = new LinkedListRelasiPerusahaan();
        LinkedListRelasiPerusahaan tm = new LinkedListRelasiPerusahaan();
        addData.inputDataRelasiPerusahaan(idNumber);
        if (head == null) {
            head = addData;
            tail = addData;
        } else {
            tm = tail;
            tail.next = addData;
            tail = addData;
            tail.prev = tm;
        }
    }

    public void inputDataRelasiPerusahaan(int idNumber) {
        System.out.print("ID TERBUAT OTOMATIS   : " + (id_relasiPerusahaan = idNumber) + "\n");
        id_relasiPerusahaan = idNumber;
        System.out.print("NAMA PERUSAHAAN       : ");
        nama_perusahaan = string.nextLine();
        System.out.print("NAMA ALUMNI           : ");
        nama_alumni = string.nextLine();
    }

    public void viewRelasiPerusahaan(int id_relasiPerusahaan) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("-------------------------------------------\n");
            return;
        } else {
            id_relasiPerusahaan = head.id_relasiPerusahaan;
            System.out.println("| ID PERUSAHAAN | NAMA PERUSAHAAN | NAMA ALUMNI |");
            System.out.println("-------------------------------------------------");
            LinkedListRelasiPerusahaan viewData = head;
            while (viewData != null) {
                viewData.viewData();
                viewData = viewData.next;
                id_relasiPerusahaan++;
            }
            System.out.println("View Data Selesai");
            System.out.println("-----------------------------------------\n");
            // System.out.println("Cek Id Number di View : " + id_dosen);
        }
    }

    public void viewData() {
        System.out.println("| "+ id_relasiPerusahaan+" | "+ nama_perusahaan +" | "+ nama_alumni +" |");
    }

    public void editRelasiPerusahaan(int id_relasiPerusahaan) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("-------------------------------------------\n");
            return;
        } else {
            LinkedListRelasiPerusahaan send = new LinkedListRelasiPerusahaan();
            int save = send.inputIDeditRelasiPerusahaan();
            LinkedListRelasiPerusahaan selectData = head;
            while (selectData != null) {
                if (selectData.id_relasiPerusahaan == save) {
                    System.out.println("| ID PERUSAHAAN | NAMA PERUSAHAAN | NAMA ALUMNI |");
                    System.out.println("-------------------------------------------------");
                    System.out.println("| "+ selectData.id_relasiPerusahaan +" | "+ selectData.nama_perusahaan +" | "+ selectData.nama_alumni +" | ");
                    System.out.println("Berhasil Masuk Pengujian");
                    System.out.println("Update Data : ");
                    send.inputEditRelasiPerusahaan(selectData);
                    System.out.println("Data Berhasil Di Update");
                    System.out.println("------------------------------------\n");
                    break;
                } else {
                    selectData = selectData.next;
                }
            }
        }
    }

    public int inputIDeditRelasiPerusahaan() {
        System.out.print("Input Update Berdasarkan ID : ");
        Scanner updateData = new Scanner(System.in);
        update_relasiPerusahaan = updateData.nextInt();
        return update_relasiPerusahaan;
    }

    public void inputEditRelasiPerusahaan(LinkedListRelasiPerusahaan selectData) {
        System.out.print("MASUKKAN NAMA PERUSAHAAN  : ");
        selectData.nama_perusahaan = string.nextLine();
        System.out.print("MASUKKAN NAMA ALUMNI      : ");
        selectData.nama_alumni = string.nextLine();
    }

    public void removeFirstRelasiPerusahaan(int id_relasiPerusahaan) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else {
            System.out.println("| ID PERUSAHAAN | NAMA PERUSAHAAN | NAMA ALUMNI |");
            System.out.println("-------------------------------------------------");
            System.out.println("| "+ head.id_relasiPerusahaan +" | "+ head.nama_perusahaan +" | "+ head.nama_alumni +" |");
            System.out.println("Data " + head.id_relasiPerusahaan + " Berhasil Dihapus");
            head = head.next;
            System.out.println("Data Pertama Berhasil Dihapus");
            System.out.println("------------------------------------\n");
        }
    }

    public void removeLastRelasiPerusahaan() {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else if (head == tail) {
            System.out.println("| ID PERUSAHAAN | NAMA PERUSAHAAN | NAMA ALUMNI |");
            System.out.println("-------------------------------------------------");
            System.out.println("| "+ tail.id_relasiPerusahaan +" | "+ tail.nama_perusahaan +" | "+ tail.nama_alumni +" |");
            System.out.println("Data " + tail.id_relasiPerusahaan + " Berhasil Dihapus");
            head = null;
            tail = null;
            System.out.println("Data Kembali NULL");
            System.out.println("------------------------------------\n");
        } else {
            System.out.println("| ID PERUSAHAAN | NAMA PERUSAHAAN | NAMA ALUMNI |");
            System.out.println("-------------------------------------------------");
            System.out.println("| "+ tail.id_relasiPerusahaan +" | "+ tail.nama_perusahaan +" | "+ tail.nama_alumni +" |");
            System.out.println("Data " + tail.id_relasiPerusahaan + " Berhasil Dihapus");
            System.out.println("Data Terakhir Berhasil Dihapus");
            System.out.println("------------------------------------\n");
            LinkedListRelasiPerusahaan removeLastData = head.next;
            LinkedListRelasiPerusahaan backOff = head;
            while (removeLastData != tail) {
                removeLastData = removeLastData.next;
                backOff = backOff.next;
            }
            backOff.next = null;
            tail = backOff;
        }
    }

    public void removeByIdRelasiPerusahaan() {

    }
}
