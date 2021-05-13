import java.util.Scanner;

public class C_LinkedList {
    public static void main(String[] args) {
        ClassCircularLinkedList CircularLinkedList = new ClassCircularLinkedList(); 
        Scanner rangeAwal = new Scanner(System.in);
        Scanner rangeAkhir = new Scanner(System.in);

        System.out.println("Circular LinkedList");

        System.out.print("Masukkan Range Awal : ");
        int awal = rangeAwal.nextInt();

        System.out.print("Masukkan Range Akhir : ");
        int akhir = rangeAkhir.nextInt();

        for (int i = awal; i <= akhir; i++) {
            CircularLinkedList.addData(i);
        }

        ClassCircularLinkedList current = CircularLinkedList.head;

        while (true) {
            System.out.print(current.data);
            current = current.next;
            if (current == null) {
                current = CircularLinkedList.head;
                System.out.println("\nKembali ke Node awal");
                System.out.println(current.data);
                break;
            }
            System.out.print(", ");
        }
    }
}

class ClassCircularLinkedList {
    ClassCircularLinkedList next, prev, head, tail;
    int data;

    ClassCircularLinkedList() {
        next = null;
        prev = null;
        head = null;
        tail = null;
    }

    ClassCircularLinkedList(int convertData) {
        data = convertData;
    }

    public void addData(int data) {
        if (head == null) {
            ClassCircularLinkedList temp = new ClassCircularLinkedList(data);
            head = temp;
        } else if (head != null) {
            ClassCircularLinkedList temp2 = head;

            while (temp2.next != null) {
                temp2 = temp2.next;
            }

            ClassCircularLinkedList temp = new ClassCircularLinkedList(data);
            temp2.next = temp;
            temp.prev = temp2;
        }
    }
}