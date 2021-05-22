package LinkedListJava;

import java.util.Scanner;

public class LinkedListAlumniUniversitas {
    Integer id_alumniUniversitas, nim_alumni, tahun_masuk, tahun_lulus, update_alumni;
    String nama_alumni, judul_skripsi;
    Double IPK;
    LinkedListAlumniUniversitas head, tail, next, prev;
    Scanner integer = new Scanner(System.in);
    Scanner string = new Scanner(System.in);
    Scanner doubleValue = new Scanner(System.in);
    public void addAlumniUniversitas(int idNumber) {
        LinkedListAlumniUniversitas addData = new LinkedListAlumniUniversitas();
        LinkedListAlumniUniversitas tm = new LinkedListAlumniUniversitas();
        addData.inputDataAlumniUniversitas(idNumber);
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

    public void inputDataAlumniUniversitas(int idNumber) {
        System.out.print("ID TERBUAT OTOMATIS   : " + (id_alumniUniversitas = idNumber) + "\n");
        id_alumniUniversitas = idNumber;
        System.out.print("NIM ALUMNI            : ");
        nim_alumni = integer.nextInt();
        System.out.print("NAMA ALUMNI           : ");
        nama_alumni = string.nextLine();
        System.out.print("TAHUN MASUK           : ");
        tahun_masuk = integer.nextInt();
        System.out.print("TAHUN LULUS           : ");
        tahun_lulus = integer.nextInt();
        System.out.print("JUDUL SKRIPSI         : ");
        judul_skripsi = string.nextLine();
        System.out.print("IPK                   : ");
        IPK = doubleValue.nextDouble();
    }

    public void viewAlumniUniversitas(int id_alumniUniversitas) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("-------------------------------------------\n");
            return;
        } else {
            id_alumniUniversitas = head.id_alumniUniversitas;
            System.out.println("| ID ALUMNI | NIM ALUMNI | NAMA ALUMNI | TAHUN MASUK | TAHUN LULUS | JUDUL SKRIPSI | IPK |");
            System.out.println("------------------------------------------------------------------------------------------");
            LinkedListAlumniUniversitas viewData = head;
            while (viewData != null) {
                viewData.viewData();
                viewData = viewData.next;
                id_alumniUniversitas++;
            }
            System.out.println("View Data Selesai");
            System.out.println("-----------------------------------------\n");
            // System.out.println("Cek Id Number di View : " + id_dosen);
        }
    }

    public void viewData() {
        System.out.println("| "+ id_alumniUniversitas +" | "+ nim_alumni +" | "+ nama_alumni +" | "+ tahun_masuk +" | "+ tahun_lulus +" | "+ judul_skripsi +" | "+ IPK +" |");
    }

    public void editAlumniUniversitas(int id_alumniUniversitas) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("-------------------------------------------\n");
        } else {
            LinkedListAlumniUniversitas send = new LinkedListAlumniUniversitas();
            int save = send.inputIDeditAlumni();
            LinkedListAlumniUniversitas selectData = head;
            while (selectData != null) {
                if (selectData.id_alumniUniversitas == save) {
                    System.out.println("| ID ALUMNI | NIM ALUMNI | NAMA ALUMNI | TAHUN MASUK | TAHUN LULUS | JUDUL SKRIPSI | IPK |");
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("| "+ selectData.id_alumniUniversitas +" | "+ selectData.nim_alumni +" | "+ selectData.nama_alumni +" | "+ selectData.tahun_masuk +" | "+ selectData.tahun_lulus +" | "+ selectData.judul_skripsi +" | "+ selectData.IPK +" |");
                    System.out.println("Berhasil Masuk Pengujian");
                    System.out.println("Update Data : ");
                    send.inputEditAlumni(selectData);
                    System.out.println("Data Berhasil Di Update");
                    System.out.println("------------------------------------\n");
                    break;
                } else {
                    selectData = selectData.next;
                }
            }
        }
    }

    public int inputIDeditAlumni() {
        System.out.print("Input Update Berdasarkan ID : ");
        Scanner updateData = new Scanner(System.in);
        update_alumni = updateData.nextInt();
        return update_alumni;
    }

    public void inputEditAlumni(LinkedListAlumniUniversitas selectData) {
        System.out.print("NIM ALUMNI            : ");
        selectData.nim_alumni = integer.nextInt();
        System.out.print("NAMA ALUMNI           : ");
        selectData.nama_alumni = string.nextLine();
        System.out.print("TAHUN MASUK           : ");
        selectData.tahun_masuk = integer.nextInt();
        System.out.print("TAHUN LULUS           : ");
        selectData.tahun_lulus = integer.nextInt();
        System.out.print("JUDUL SKRIPSI         : ");
        selectData.judul_skripsi = string.nextLine();
        System.out.print("IPK                   : ");
        selectData.IPK = doubleValue.nextDouble();
    }

    public void removeFirstAlumniUniversitas(int id_alumniUniversitas) {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else {
            System.out.println("| ID ALUMNI | NIM ALUMNI | NAMA ALUMNI | TAHUN MASUK | TAHUN LULUS | JUDUL SKRIPSI | IPK |");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("| "+ head.id_alumniUniversitas +" | "+ head.nim_alumni +" | "+ head.nama_alumni +" | "+ head.tahun_masuk +" | "+ head.tahun_lulus +" | "+ head.judul_skripsi +" | "+ head.IPK +" |");
            System.out.println("Data " + head.id_alumniUniversitas + " Berhasil Dihapus");
            head = head.next;
            System.out.println("Data Pertama Berhasil Dihapus");
            System.out.println("------------------------------------\n");
        }
    }

    public void removeLastAlumniUniversitas() {
        if (head == null) {
            System.out.println("Data Kosong");
            System.out.println("------------------------------------\n");
            return;
        } else if (head == tail) {
            System.out.println("| ID ALUMNI | NIM ALUMNI | NAMA ALUMNI | TAHUN MASUK | TAHUN LULUS | JUDUL SKRIPSI | IPK |");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("| "+ tail.id_alumniUniversitas +" | "+ tail.nim_alumni +" | "+ tail.nama_alumni +" | "+ tail.tahun_masuk +" | "+ tail.tahun_lulus +" | "+ tail.judul_skripsi +" | "+ tail.IPK +" |");
            System.out.println("Data "+ tail.id_alumniUniversitas +" Berhasil Dihapus");
            head = null;
            tail = null;
            System.out.println("Data Kembali NULL");
            System.out.println("------------------------------------\n");
        } else {
            System.out.println("| ID ALUMNI | NIM ALUMNI | NAMA ALUMNI | TAHUN MASUK | TAHUN LULUS | JUDUL SKRIPSI | IPK |");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("| "+ tail.id_alumniUniversitas +" | "+ tail.nim_alumni +" | "+ tail.nama_alumni +" | "+ tail.tahun_masuk +" | "+ tail.tahun_lulus +" | "+ tail.judul_skripsi +" | "+ tail.IPK +" |");
            System.out.println("Data "+ tail.id_alumniUniversitas +" Berhasil Dihapus");
            System.out.println("Data Terakhir Berhasil Dihapus");
            System.out.println("------------------------------------\n");
            LinkedListAlumniUniversitas removeLastData = head.next;
            LinkedListAlumniUniversitas backOff = head;
            while (removeLastData != tail) {
                removeLastData = removeLastData.next;
                backOff = backOff.next;
            }
            backOff.next = null;
            tail = backOff;
        }
    }

    public void removeByIdAlumniUniversitas() {
        
    }
}
