import java.util.Scanner;
 
public class LinkedListCase {
    int id, modul;
    String nama, kelas, jadwal;
    LinkedListCase next;
    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public static Scanner inputDummy = new Scanner(System.in);

    public void input(int jumlahData) {
        // System.out.print("Masukkan id               : ");
        // in.useRadix(jumlahData);
        for (int c = jumlahData; c <= jumlahData; c++) {
            id = c;
            nama = "Data";
            kelas = "Data";
            jadwal = "Data";
            modul = c;
        }
        // id = in.nextInt();
        // System.out.print("Masukkan Nama             : ");
        // nama = str.nextLine();
        // System.out.print("Masukkan Kelas            : ");
        // kelas = str.nextLine();
        // System.out.print("Masukkan Jadwal LinkedListCase : ");
        // jadwal = str.nextLine();
        // System.out.print("Masukkan Jumlah Modul     : ");
        // modul = in.nextInt();
        // next = null;
    }
    public void viewData(LinkedListCase pointer) {
        System.out.println("| " + pointer.id + " | " + pointer.nama + " | " + pointer.kelas + " | " + pointer.jadwal + " | " + pointer.modul + " |");
        // System.out.println(pointer.id);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int menu = 0, del;
        int saveDummy;
        int jumlahData = 1;
        linkedlist ll = new linkedlist();

        while (menu != 4){
            System.out.print("1.Input\n2.View\n3.Delete\n4.Exit\n");
            System.out.print("Input Pilihan : ");
            menu = in.nextInt();
            if (menu == 1) {
                System.out.print("Input Data Dummy = ");
                saveDummy = inputDummy.nextInt();
                for (jumlahData = 1; jumlahData <= saveDummy; jumlahData++) {
                    ll.add(jumlahData, saveDummy);
                }
            } else if (menu == 2) {
                ll.view(jumlahData);
            } else if (menu == 3) {
                System.out.print("1.Data Pertama\n2.Data Terkahir : \n");
                System.out.print("Pilih Nomor : ");
                del = in.nextInt();
                if (del == 1) {
                    ll.removeFirst();
                } else if (del == 2) {
                    ll.removeLast();
                } else {
                    System.out.println("Salah");
                }
            }
            else if (menu == 4) {
                System.out.println("Keluar");
            } else {
                System.out.println("Maksimal Nomor Adalah 4");
            }
            System.out.println();
        }
    }
}
 
class linkedlist{
    LinkedListCase head, tail;
    linkedlist() {
        head = null;
        tail = null;
    }
    public void add( int jumlahData, int saveDummy ) {
        LinkedListCase baru = new LinkedListCase();
        baru.input(jumlahData);
        
        if (head == null) {
            head = baru;
            System.out.println("Data ID " + head.id + " berhasil disimpan");
        } else {
            tail.next = baru;
            System.out.println("Data ID " + tail.next.id + " berhasil disimpan");
        }
        tail = baru;
        // System.out.println(tail);
    }
    public void view(int jumlahData) {
        if (head == null) {
            System.out.println("Data Masih Kosong");
            return;

            // -------------------------------------------------------------------------------------
            // LinkedListCase pointer = head;
            // System.out.println("| Id | Modul |");
            // System.out.println("--------------");
            // while (jumlahData < saveDummy) {
            //     System.out.println("| " + idDummy + " | " + modulDummy + " |");
            //     idDummy++;
            //     modulDummy++;
            //     jumlahData++;
            // }
            // System.out.println("\nJumlah Data = " + jumlahData);
            // jumlahData = jumlahData / 2;
            // System.out.println("\n| " + jumlahData + " | " + jumlahData + " |");
            // idDummy = 1;
            // modulDummy = 1;
            // jumlahData = 0;
        } else {
            jumlahData = 0;
            System.out.println("| Id | Nama | Kelas | Jadwal | Modul |");
            System.out.println("--------------------------------------");
            LinkedListCase pointer = head;
            while (pointer != null) {
                pointer.viewData(pointer);
                jumlahData++;
                pointer = pointer.next;
            }
            System.out.println("Jumlah Data = " + jumlahData);
            jumlahData = jumlahData / 2;
            pointer = head;
            for (int b = 1; b <= jumlahData - 1; b++) {
                pointer = pointer.next;
            }
            // pointer.id = jumlahData;
            pointer.viewData(pointer);
            jumlahData = 0;
        }
    }
    public void removeFirst() {
        if (head == null) {
            System.out.println("Data Kosong");
            return;
        } else {
            System.out.println("Data "+head.nama+" Berhasil Dihapus");
            head = head.next;
        }
    }
    public void removeLast() {
        if (head == null) {
            System.out.println("Data Kosong");
            return;
        }
        System.out.println("Data "+tail.nama+" Berhasil Dihapus");
        if (head == tail) {
            head = null;
            tail = null;
            System.out.println("Data Kembali Null");
        } else {
            LinkedListCase pointer = head.next;
            LinkedListCase prev = head;
            while (pointer != tail) {
                pointer = pointer.next;
                prev = prev.next;
            }
            prev.next = null;
            tail = prev;
        }
    }
}