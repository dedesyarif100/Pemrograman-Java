import java.util.Scanner;

public class GabunganArrayLinkedList {
    int data_a, data_b;
    GabunganArrayLinkedList next, prev;
    public static Scanner integer = new Scanner(System.in); // Input Data
    public static Scanner inputDummy = new Scanner(System.in);

    public void inputData(int jumlahData) {
        for (int c = jumlahData; c <= jumlahData; c++) {
            data_a = c;
        }
    }

    public void viewData(GabunganArrayLinkedList pointer, GabunganArrayLinkedList tampilGenap, GabunganArrayLinkedList tampilGanjil, GabunganArrayLinkedList tampilKelipatan5, int viewData) {
        if (viewData == 1) {
            System.out.print("| " + pointer.data_a + " |");
        } else if (viewData == 2) {
            System.out.print("| " + tampilGenap.next.data_a + " |");
        } else if (viewData == 3) {
            System.out.print("| " + tampilGanjil.data_a + " |");
        } else if (viewData == 4) {
            System.out.print("| " + tampilKelipatan5.data_a + " |");
        }
    }

    // public void viewDataGenap(GabunganArrayLinkedList tampilGenap) {
    // }

    public static void main(String[] args) {
        int menu = 0;
        int saveDummy = 1;
        int jumlahData = 1;

        ActionLinkedList inputMenu = new ActionLinkedList();
        while (menu != 4) {
            System.out.print("1.Input\n2.View\n3.Delete\n4.Exit\n");
            System.out.print("Masukkan Menu = ");
            menu = integer.nextInt();
            if (menu == 1) {
                System.out.print("Input Data Dummy = ");
                saveDummy = inputDummy.nextInt();
                System.out.println();
                for (jumlahData = 1; jumlahData <= saveDummy; jumlahData++) {
                    inputMenu.add(jumlahData, saveDummy);
                }
                System.out.println();
            } else if (menu == 2) {
                System.out.println();
                inputMenu.view(jumlahData, saveDummy);
            } else {
                System.out.println("\nPILIHAN MENU HANYA 1 - 4 !!!\n");
            }
        }
    }
}

class ActionLinkedList {
    GabunganArrayLinkedList head, tail;
    public ActionLinkedList() {
        head = null;
        tail = null;
    }

    public void add( int jumlahData, int saveDummy ) {
        GabunganArrayLinkedList baru = new GabunganArrayLinkedList();
        baru.inputData(jumlahData);

        if (head == null) {
            head = baru;
            System.out.println("Data ID " + head.data_a + " berhasil disimpan");
        } else {
            tail.next = baru;
            System.out.println("Data ID " + tail.next.data_a + " berhasil disimpan");
        }
        tail = baru;
    }

    public void view( int jumlahData, int saveDummy ) {
        if (head == null) {
            System.out.println("Data Masih Kosong");
            return;
        } else {
            jumlahData = 0;
            GabunganArrayLinkedList pointer = head;
            GabunganArrayLinkedList tampilGenap = head;
            GabunganArrayLinkedList tampilGanjil = head;
            GabunganArrayLinkedList tampilKelipatan5 = head;
            int viewData = 1;

            // TAMPILKAN SEMUA OUTPUTNYA
            while (pointer != null) {
                tampilKelipatan5.viewData(pointer, tampilGenap, tampilGanjil, tampilKelipatan5, viewData);
                jumlahData++;
                pointer = pointer.next;
            }
            System.out.println("\nJumlah Data = " + jumlahData);
            System.out.println();
            
            // TAMPILKAN ANGKA GENAP
            viewData = 2;
            jumlahData = 0;
            while (tampilGenap != null) {
                tampilKelipatan5.viewData(pointer, tampilGenap, tampilGanjil, tampilKelipatan5, viewData);
                jumlahData++;
                tampilGenap = tampilGenap.next;
                tampilGenap = tampilGenap.next;
            }
            System.out.println("\nJumlah Data = " + jumlahData);
            System.out.println();
            
            // TAMPILKAN ANGKA GANJIL
            viewData = 3;
            jumlahData = 0;
            while (tampilGanjil != null) {
                tampilKelipatan5.viewData(pointer, tampilGenap, tampilGanjil, tampilKelipatan5, viewData);
                jumlahData++;
                tampilGanjil = tampilGanjil.next;
                tampilGanjil = tampilGanjil.next;
            }
            System.out.println("\nJumlah Data = " + jumlahData);
            System.out.println();

            // TAMPILKAN ANGKA KELIPATAN 5
            viewData = 4;
            jumlahData = 1;
            while (tampilKelipatan5 != null) {
                for (int d = 1; d <= 1; d++) {
                    if (jumlahData == 1) {
                        tampilKelipatan5 = tampilKelipatan5.next;
                        tampilKelipatan5 = tampilKelipatan5.next;
                        tampilKelipatan5 = tampilKelipatan5.next;
                        tampilKelipatan5 = tampilKelipatan5.next;
                    } else {
                        for (int e = 1; e <= 5; e++) {
                            // if (tampilKelipatan5.data_a == saveDummy) {
                            //     break;
                            // } else {
                            // }
                            tampilKelipatan5 = tampilKelipatan5.next;
                        }
                    }
                }
                tampilKelipatan5.viewData(pointer, tampilGenap, tampilGanjil, tampilKelipatan5, viewData);
                jumlahData++;
            }
            System.out.println("\nJumlah Data = " + jumlahData);
            System.out.println();
        }
    }
}