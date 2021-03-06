import java.util.Scanner;

public class DoubleLinkedList2 {
    public static void main(String[] args) {
        ClassCircularLinkedList3 circularLinkedList = new ClassCircularLinkedList3();

        while (true) {
            System.out.print("Index Awal : ");
            Scanner rangeAwal = new Scanner(System.in);
            int awal = rangeAwal.nextInt();

            System.out.print("Index Akhir : ");
            Scanner rangeAkhir = new Scanner(System.in);
            int akhir = rangeAkhir.nextInt();

            if (awal > akhir) {
                System.out.println("Nilai awal tidak boleh lebih besar dari nilai akhir");
            } else {
                System.out.print("Enter ketika node mencapai angka : ");
                Scanner enterNode = new Scanner(System.in);
                int enter = enterNode.nextInt();
                
                System.out.println("\nDouble LinkedList : ");
                for (int a = awal; a <= akhir; a++) {
                    circularLinkedList.tambahData(a);
                }

                ClassCircularLinkedList3 current = circularLinkedList.head;
                Integer n = 0;

                while (true) {
                    System.out.print(current.data);
                    n++;
                    if (current.next == null) {
                        System.out.println("\nKembali Ke Nilai Awal");
                        while (true) {
                            System.out.print(current.data);
                            if (current.prev == null) {
                                break;
                            } else {
                                current = current.prev;
                            }
                            System.out.print(", ");
                        }
                        break;
                    } else {
                        if (n == enter) {
                            n = 0;
                            current = current.next;
                            System.out.print(", \n");
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

class ClassCircularLinkedList3 {
    ClassCircularLinkedList3 head, tail, next, prev;
    int data;

    ClassCircularLinkedList3() {
        head = null;
        tail = null;
        next = null;
        prev = null;
    }

    ClassCircularLinkedList3(int value) {
        data = value;
    }

    public void tambahData(int data) {
        if (head == null) {
            ClassCircularLinkedList3 temp = new ClassCircularLinkedList3(data);
            head = temp;
        } else if (head != null) {
            ClassCircularLinkedList3 temp2 = head;
            ClassCircularLinkedList3 temp = new ClassCircularLinkedList3(data);

            while (temp2.next != null) {
                temp2 = temp2.next;
            }

            temp2.next = temp;
            temp.prev = temp2;
        }
    }
}