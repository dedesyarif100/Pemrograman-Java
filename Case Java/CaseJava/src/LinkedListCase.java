import java.util.Scanner;
 
public class LinkedListCase {
    int id, modul;
    String nama, kelas, jadwal;
    LinkedListCase next;
    public static Scanner in = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public void input(){
        System.out.print("Masukkan id               : ");
        id = in.nextInt();
        System.out.print("Masukkan Nama             : ");
        nama = str.nextLine();
        System.out.print("Masukkan Kelas            : ");
        kelas = str.nextLine();
        System.out.print("Masukkan Jadwal LinkedListCase : ");
        jadwal = str.nextLine();
        System.out.print("Masukkan Jumlah Modul     : ");
        modul = in.nextInt();
        // next = null;
    }
    public void view(LinkedListCase ptr) {
        System.out.println("| "+id+" | "+nama+" | "+kelas+" | "+jadwal+" | "+modul+" |");
        // System.out.println(ptr);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int menu = 0, del;
        linkedlist ll = new linkedlist();
        while (menu != 4){
            System.out.print("1.Input\n2.View\n3.Delete\n4.Exit\n : ");
            menu = in.nextInt();
            if (menu == 1) {
                ll.add();
            } else if (menu == 2) {
                ll.view();
            } else if (menu == 3) {
                System.out.print("1.Data Pertama\n2.Data Terkahir\n : ");
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
    public void add() {
        LinkedListCase baru = new LinkedListCase();
        baru.input();
        if (head == null) {
            head = baru;
            System.out.println(head);
        } else {
            tail.next = baru;
            System.out.println(tail.next);
        }
        tail = baru;
        System.out.println(tail);
    }
    public void view() {
        if (head == null) {
            System.out.println("Data Masih Kosong");
            return;
        } else {
            System.out.println("| Id | Nama | Kelas | Jadwal | Modul |");
            System.out.println("--------------------------------------");
            LinkedListCase ptr = head;
            while (ptr != null) {
                ptr.view(ptr);
                ptr = ptr.next;
            }
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
            LinkedListCase ptr = head.next;
            LinkedListCase prev = head;
            while (ptr != tail) {
                ptr = ptr.next;
                prev = prev.next;
                System.out.println(ptr.id);
                System.out.println(tail.id);
            }
            System.out.println(prev.next.id);
            System.out.println(tail.id);
            prev.next = null;
            tail = prev;
            System.out.println("Done move : " + prev.next.id);
            System.out.println("Done move : " + tail.id);
        }
    }
}