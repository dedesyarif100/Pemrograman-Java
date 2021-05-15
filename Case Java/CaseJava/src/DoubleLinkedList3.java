import java.util.Scanner;

public class DoubleLinkedList3 {
    public static void main(String[] args) {
        ClassDoubleLinkedList3 doubleLinkedList = new ClassDoubleLinkedList3();

        while (true) {
            System.out.print("Index Awal : ");
            Scanner rangeAwal = new Scanner(System.in);
            int awal = rangeAwal.nextInt();

            System.out.print("Index Awal : ");
            Scanner rangeAkhir = new Scanner(System.in);
            int akhir = rangeAkhir.nextInt();

            if (awal > akhir) {
                System.out.println("Nilai Awal harus lebih besar dari nilai akhir\n");
            } else {
                System.out.print("Enter kelipatan angka : ");
                Scanner enterNode = new Scanner(System.in);
                int enter = enterNode.nextInt();
    
                for (int a = awal; a <= akhir; a++) {
                    doubleLinkedList.tambahData(a);
                }
    
                ClassDoubleLinkedList3 current = doubleLinkedList.head;
                System.out.println("\nDouble Linked List : ");
    
                Integer n = 0;
                while (true) {
                    n++;
                    System.out.print(current.data);
                    if (current.next == null) {
                        System.out.print("\n\nKembali Ke Index Awal : \n");
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
                        if (n == enter) {
                            n = 0;
                            current = current.next;
                            System.out.println();
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
}

class ClassDoubleLinkedList3 {
    ClassDoubleLinkedList3 head, tail, next, prev;
    int data;

    ClassDoubleLinkedList3() {
        head = null;
        tail = null;
        next = null;
        prev = null;
    }

    ClassDoubleLinkedList3(int value) {
        data = value;
    }

    public void tambahData(int data) {
        if (head == null) {
            ClassDoubleLinkedList3 temp = new ClassDoubleLinkedList3(data);
            head = temp;
        } else if (head != null) {
            ClassDoubleLinkedList3 temp2 = head;
            ClassDoubleLinkedList3 temp = new ClassDoubleLinkedList3(data);

            while (temp2.next != null) {
                temp2 = temp2.next;
            }

            temp2.next = temp;
            temp.prev = temp2;
        }
    }
}