package LinkedListJava;

import java.util.Scanner;

public class LinkedListMataKuliah {
    Integer id_mataKuliah, kode_mataKuliah, update_mataKuliah;
    String nama_mataKuliah, bobot_mataKuliah;
    LinkedListMataKuliah head, tail, next, prev;
    Scanner integer = new Scanner(System.in);
    Scanner string = new Scanner(System.in);
    public void addMataKuliah(int idNumber) {
        LinkedListMataKuliah addData = new LinkedListMataKuliah();
        LinkedListMataKuliah tm = new LinkedListMataKuliah();
        addData.inputDataMataKuliah(idNumber);
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

    public void inputDataMataKuliah(int idNumber) {
        System.out.print("ID TERBUAT OTOMATIS : " + (id_mataKuliah = idNumber) + " \n");
        id_mataKuliah = idNumber;
        System.out.print("KODE MATA KULIAH    : "); // Kode ini DI INPUT OTOMATIS. Contoh : Kode 001, 002, 003
        kode_mataKuliah = integer.nextInt();
        System.out.print("NAMA MATA KULIAH    : ");
        nama_mataKuliah = string.nextLine();
        System.out.print("BOBOT MATA KULIAH   : "); // Bobot mata kuliah di inputkan berdasarkan Opsi. 
        bobot_mataKuliah = string.nextLine();       // Contoh : 1. High. 2. Medium. 3. Low
    }

    public void viewMataKuliah(int id_mataKuliah) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("-------------------------------------------\n");
            return;
        } else {
            id_mataKuliah = head.id_mataKuliah;
            System.out.println("| ID MATA KULIAH | KODE MATA KULIAH | NAMA MATA KULIAH | BOBOT MATA KULIAH |");
            System.out.println("----------------------------------------------------------------------------");
            LinkedListMataKuliah viewData = head;
            while (viewData != null) {
                viewData.viewData();
                viewData = viewData.next;
                id_mataKuliah++;
            }
            System.out.println("View Data Selesai");
            System.out.println("-----------------------------------------\n");
            // System.out.println("Cek Id Number di View : " + id_dosen);
        }
    }

    public void viewData() {
        System.out.println("| " + id_mataKuliah + " | " + kode_mataKuliah + " | " + nama_mataKuliah + " | " + bobot_mataKuliah + " |");
    }

    public void editMataKuliah(int id_mataKuliah) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("-------------------------------------------\n");
        } else {
            LinkedListMataKuliah send = new LinkedListMataKuliah();
            int save = send.inputIDeditMataKuliah();
            LinkedListMataKuliah selectData = head;
            while (selectData != null) {
                if (selectData.id_mataKuliah == save) {
                    System.out.println("| ID MATA KULIAH | KODE MATA KULIAH | NAMA MATA KULIAH | BOBOT MATA KULIAH |");
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("| " + selectData.id_mataKuliah + " | " + selectData.kode_mataKuliah + " | " + selectData.nama_mataKuliah + " | " + selectData.bobot_mataKuliah + " |");
                    System.out.println("Berhasil Masuk Pengujian");
                    System.out.println("Update Data : ");
                    send.inputEditMataKuliah(selectData);
                    System.out.println("Data Berhasil Di Update");
                    System.out.println("------------------------------------\n");
                    break;
                } else {
                    selectData = selectData.next;
                }
            }
        }
    }

    public int inputIDeditMataKuliah() {
        System.out.print("Input Update Berdasarkan ID : ");
        Scanner updateData = new Scanner(System.in);
        update_mataKuliah = updateData.nextInt();
        return update_mataKuliah;
    }

    public void inputEditMataKuliah(LinkedListMataKuliah selectData) {
        System.out.print("MASUKKAN NAMA MATA KULIAH     : ");
        selectData.nama_mataKuliah = string.nextLine();
        System.out.print("MASUKKAN BOBOT MATA KULIAH    : ");
        selectData.bobot_mataKuliah = string.nextLine();
    }

    public void removeFirstMataKuliah(int removeFirstMataKuliah) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("-------------------------------------------\n");
            return;
        } else {
            System.out.println("| ID MATA KULIAH | KODE MATA KULIAH | NAMA MATA KULIAH | BOBOT MATA KULIAH |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| " + head.id_mataKuliah + " | " + head.kode_mataKuliah + " | " + head.nama_mataKuliah + " | " + head.bobot_mataKuliah + " |");
            System.out.println("Data " + head.id_mataKuliah + " Berhasil Dihapus");
            head = head.next;
            System.out.println("Data Pertama Berhasil Dihapus");
            System.out.println("------------------------------------\n");
        }
    }

    public void removeLastMataKuliah() {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else if (head == tail) {
            System.out.println("| ID MATA KULIAH | KODE MATA KULIAH | NAMA MATA KULIAH | BOBOT MATA KULIAH |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| " + tail.id_mataKuliah + " | " + tail.kode_mataKuliah + " | " + tail.nama_mataKuliah + " | " + tail.bobot_mataKuliah + " |");
            System.out.println("Data "+ tail.id_mataKuliah +" Berhasil Dihapus");
            head = null;
            tail = null;
            System.out.println("Data Kembali NULL");
            System.out.println("------------------------------------\n");
        } else {
            System.out.println("| ID MATA KULIAH | KODE MATA KULIAH | NAMA MATA KULIAH | BOBOT MATA KULIAH |");
            System.out.println("----------------------------------------------------------------------------");
            System.out.println("| " + tail.id_mataKuliah + " | " + tail.kode_mataKuliah + " | " + tail.nama_mataKuliah + " | " + tail.bobot_mataKuliah + " |");
            System.out.println("Data "+ tail.id_mataKuliah +" Berhasil Dihapus");
            System.out.println("Data Terakhir Berhasil Dihapus");
            System.out.println("------------------------------------\n");
            LinkedListMataKuliah removeLastData = head.next;
            LinkedListMataKuliah backOff = head;
            while (removeLastData != tail) {
                removeLastData = removeLastData.next;
                backOff = backOff.next;
            }
            backOff.next = null;
            tail = backOff;
        }
    }

    public void removeByIdMataKuliah() {
        
    }
}
