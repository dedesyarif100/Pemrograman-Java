import java.util.Scanner;

public class DoubleLinkedList5 {
    public static void main(String[] args) {
        ClassDoubleLinkedList5 doubleLinkedList = new ClassDoubleLinkedList5();
        System.out.print("Input Range Awal : ");
        Scanner rangeAwal = new Scanner(System.in);
        int awal = rangeAwal.nextInt();
        System.out.print("Input Range Akhir : ");
        Scanner rangeAkhir = new Scanner(System.in);
        int akhir = rangeAkhir.nextInt();

        for (int a = awal; a <= akhir; a++) {
            doubleLinkedList.tambahData(a);
        }

        ClassDoubleLinkedList5 currentHead = doubleLinkedList.head;
        ClassDoubleLinkedList5 currentTail = doubleLinkedList.tail;
        // System.out.println(currentTail.data);

        while (true) {
            System.out.print(currentHead.data);
            if (currentHead.next == null) {
                // Tampilkan dengan metode head
                // System.out.println("\n\nKembali Ke Index Awal : ");
                // while (currentHead != null) {
                //     System.out.print(currentHead.data);
                //     if (currentHead.prev == null) {
                //         break;
                //     } else {
                //         currentHead = currentHead.prev;
                //         System.out.print(", ");
                //     }
                // }
                // Tampilkan dengan metode tail
                System.out.println("\n\nKembali ke index awal : ");
                while (currentTail != null) {
                    System.out.print(currentTail.data);
                    if (currentTail.prev == null) {
                        break;
                    } else {
                        currentTail = currentTail.prev;
                        System.out.print(", ");
                    }
                }
                break;
            } else {
                currentHead = currentHead.next;
                System.out.print(", ");
            }
        }
    }
}

class ClassDoubleLinkedList5 {
    ClassDoubleLinkedList5 head, tail, next, prev;
    int data;

    ClassDoubleLinkedList5() {
        head = null;
        tail = null;
        next = null;
        prev = null;
    }

    ClassDoubleLinkedList5(int value) {
        data = value;
    }

    public void tambahData(int data) {
        if (head == null) {
            ClassDoubleLinkedList5 temp = new ClassDoubleLinkedList5(data);
            head = temp;
        } else if (head != null) {
            ClassDoubleLinkedList5 temp2 = head;
            ClassDoubleLinkedList5 temp = new ClassDoubleLinkedList5(data);

            while (temp2.next != null) {
                temp2 = temp2.next;
            }

            temp2.next = temp;
            tail = temp2.next;
            temp.prev = temp2;
        }
    }
}