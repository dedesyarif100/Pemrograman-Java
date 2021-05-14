import java.util.ArrayList;
import java.util.Scanner;

public class C_LinkedList2 {
    public static void main(String[] args) {
        ClassCircularLinkedList2 circularLinkedList = new ClassCircularLinkedList2();
        int count = 0;
        Scanner rangeAwal = new Scanner(System.in);
        Scanner rangeAkhir = new Scanner(System.in);

        System.out.println("Linked List Circular : ");
        System.out.print("Masukkan Range Awal : ");
        int awal = rangeAwal.nextInt();
        System.out.print("Masukkan Range AKhir : ");
        int akhir = rangeAkhir.nextInt();

        for (int i = awal; i <= akhir; i++) {
            circularLinkedList.addData(i, count);
        }

        ClassCircularLinkedList2 current = circularLinkedList.head;

        while (true) {
            System.out.print(current.data);
            current = current.next;
            if (current == null) {
                System.out.print("\n------------------------------------");
                // NODE AWAL
                current = circularLinkedList.head;
                System.out.print("\nNode Awal : ");
                System.out.print(current.data);
                // NODE AKHIR
                while (true) {
                    if (current.next == null) {
                        break;
                    } else {
                        current = current.next;
                    }
                }
                System.out.print("\nNode Akhir : ");
                System.out.print(current.data);
                // JUMLAH NODE
                current = circularLinkedList.head;
                System.out.print("\nJumlah Node : ");
                Integer n = 1;
                while (true) {
                    if (current.next == null) {
                        break;
                    } else {
                        current = current.next;
                    }
                    n++;
                }
                System.out.print(n);
                // KALKULASI NODE
                System.out.print("\nKalkulasi Node : ");
                System.out.print(count);
                break;
            }
            System.out.print(", ");
        }
    }
}

class ClassCircularLinkedList2 {
    ClassCircularLinkedList2 head, tail, next, prev;
    int data;

    ClassCircularLinkedList2(int value, int count) {
        count = count + value;
        data = value;
    }

    ClassCircularLinkedList2() {
        head = null;
        tail = null;
        next = null;
        prev = null;
    }

    public void addData(int data, int count) {
        if (head == null) {
            ClassCircularLinkedList2 temp = new ClassCircularLinkedList2(data, count);
            head = temp;
        } else if (head != null) {
            ClassCircularLinkedList2 temp2 = head;

            while (temp2.next != null) {
                temp2 = temp2.next;
            }

            ClassCircularLinkedList2 temp = new ClassCircularLinkedList2(data, count);
            temp2.next = temp;
            temp.prev = temp2;
        }
    }
}