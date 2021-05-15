import java.util.Scanner;

public class DoubleLinkedList4 {
    static ClassDoubleLinkedList4 doubleLinkedList = new ClassDoubleLinkedList4();
    static Scanner integer = new Scanner(System.in);
    static int awal, akhir;

    // public static boolean reset_AwalAkhir(int awal, int akhir) {
    //     return awal == akhir;
    // }

    // public static boolean resetValue_AwalAkhir() {
    //     awal = 0;
    //     akhir = 0;
    //     System.out.println("cek 1");
    //     return resetValue_AwalAkhir();
    // }

    public static void resetValue_AwalAkhir() {
        awal = 0;
        akhir = 0;
    }

    public void inputRange() {
        System.out.print("Index Awal : ");
        Scanner rangeAwal = new Scanner(System.in);
        awal = rangeAwal.nextInt();

        System.out.print("Index Akhir : ");
        Scanner rangeAkhir = new Scanner(System.in);
        akhir = rangeAkhir.nextInt();    
    }

    public void menu1() {
        while (true) {
            if (awal == 0 || akhir == 0) {
                inputRange();
            }

            if (awal > akhir) {
                System.out.println("Awal harus lebih kecil dari Akhir\n");
                resetValue_AwalAkhir();
            } else {
                System.out.print("Enter kelipatan ke : ");
                Scanner enterNode = new Scanner(System.in);
                int enter = enterNode.nextInt();

                for (int i = awal; i <= akhir; i++) { // Ini yang membedakan menu 1 dan menu 2
                    doubleLinkedList.tambahData(i);
                }

                ClassDoubleLinkedList4 current = doubleLinkedList.head;

                Integer n = 0;
                while (true) {
                    System.out.print(current.data);
                    if (current.next == null) {
                        System.out.print("\nKembali Ke Index Awal : \n");
                        while (true) {
                            System.out.print(current.data);
                            if (current.prev == null) {
                                break;
                            } else {
                                current = current.prev;
                                System.out.print(", ");
                            }
                        }
                        break;
                    } else {
                        n++; // Increment Variabel n
                        if (n == enter) {
                            System.out.println();
                            current = current.next;
                            n = 0;
                        } else {
                            current = current.next;
                            System.out.print(", ");
                        }
                    }
                }
                break;
            }
        }
    }

    public void menu2() {
        while (true) {
            if (awal == 0 || akhir == 0) {
                inputRange();
            } 

            if (awal < akhir) {
                System.out.println("Awal harus lebih besar dari Akhir\n");
                resetValue_AwalAkhir();
            } else {
                System.out.print("Enter kelipatan ke : ");
                Scanner enterNode = new Scanner(System.in);
                int enter = enterNode.nextInt();
        
                for (int j = awal; j >= akhir; j--) { // Ini yang membedakan menu 1 dan menu 2
                    doubleLinkedList.tambahData(j);
                }
        
                ClassDoubleLinkedList4 current = doubleLinkedList.head;
        
                Integer n = 0;
                while (true) {
                    System.out.print(current.data);
                    if (current.next == null) {
                        System.out.print("\nKembali ke Index Awal : \n");
                        while (true) {
                            System.out.print(current.data);
                            if (current.prev == null) {
                                break;
                            } else {
                                current = current.prev;
                                System.out.print(", ");
                            }
                        }
                        break;
                    } else {
                        n++; // Increment Variabel n
                        if (n == enter) {
                            System.out.println();
                            current = current.next;
                            n = 0;
                        } else {
                            current = current.next;
                            System.out.print(", ");
                        }
                    }
                }
                break;
            }
        }
    }

    public void menu3() {
        inputRange();
        if (awal < akhir) {
            menu1();
        } else if (awal > akhir) {
            menu2();    
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList4 inputData = new DoubleLinkedList4();
        int menu = 0;

        while (menu != 4 && menu <= 4) {
            doubleLinkedList = new ClassDoubleLinkedList4();
            System.out.println("\n\n1. Input Awal < Akhir : ");
            System.out.println("2. Input Awal > Akhir : ");
            System.out.println("3. dua-duanya bisa di input : ");
            System.out.print("Pilih Menu Input = ");
            menu = integer.nextInt();

            if (menu == 1) {
                resetValue_AwalAkhir();
                inputData.menu1();
            } else if (menu == 2) {
                resetValue_AwalAkhir();
                inputData.menu2();
            } else if (menu == 3) {
                inputData.menu3();
            } else {
                System.out.println("menu tidak diketahui");
            }
        }
    }
}

class ClassDoubleLinkedList4 {
    ClassDoubleLinkedList4 head, tail, next, prev;
    int data;

    ClassDoubleLinkedList4() {
        head = null;
        tail = null;
        next = null;
        prev = null;
    }

    ClassDoubleLinkedList4(int value) {
        data = value;
    }

    public void tambahData(int data) {
        if (head == null) {
            ClassDoubleLinkedList4 temp = new ClassDoubleLinkedList4(data);
            head = temp;
        } else if (head != null) {
            ClassDoubleLinkedList4 temp2 = head;
            ClassDoubleLinkedList4 temp = new ClassDoubleLinkedList4(data);

            while (temp2.next != null) {
                temp2 = temp2.next;
            }

            temp2.next = temp;
            temp.prev = temp2;
        }
    }
}