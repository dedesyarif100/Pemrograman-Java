import java.util.Scanner;

public class DoubleLinkedList {
    public static void main(String[] args) {
        ClassDoubleLinkedList DoubleLinkedList = new ClassDoubleLinkedList();
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah = ");
        int jumlahData = input.nextInt();

        for (int c = 1; c <= jumlahData; c++) {
            DoubleLinkedList.addData(c);
        }

        // Scanner enter = new Scanner(System.in);
        // System.out.print("Enter Data Ketika Mencapai Angka = ");
        // int enterData = enter.nextInt();

        ClassDoubleLinkedList current = DoubleLinkedList.head;
        int x = 1;
        // for (int a = 1; a <= jumlahData; a++) {
        //     current = current.next;
        // }

        // System.out.println(current.getPrev().data);
        while (current != null) {
            // if (x == enterData) {
            //     x = 1;
            //     System.out.print(current.data + ", ");
            //     System.out.println();
            // } else {
            //     System.out.print(current.data + ", ");
            //     x++;
            // }
            System.out.print(current.data + ", ");
            if (current.prev != null) {
                System.out.println(current.prev.data);
            }
            // System.out.print(current);
            current = current.next;
        }
        // while (current.getPrev() != null) {
        //     System.out.print(current.data + ", ");
        //     current = current.prev;
        // }
    }
}

class ClassDoubleLinkedList {
    ClassDoubleLinkedList next, prev, head, tail;
    int data;

    ClassDoubleLinkedList() {
        next = null;
        prev = null;
        head = null;
        tail = null;
    }

    // Constructor dengan parameter
    ClassDoubleLinkedList(int dataValue) {
        data = dataValue;
    }

    public ClassDoubleLinkedList getPrev() {
        return prev;
    }

    public ClassDoubleLinkedList getNext() {
        return next;
    }

    public void addData( int data ) {
        if (head == null) {
            ClassDoubleLinkedList temp = new ClassDoubleLinkedList(data);
            head = temp;
            prev = null;
        } else if (head != null) {
            ClassDoubleLinkedList temp2 = head;
            // int x = 1;
            // while (temp2.getPrev() != null) {
            //     temp2 = temp2.getPrev();
            // }
            while (temp2.getNext() != null) {
                temp2 = temp2.getNext();
                // x++;
            }
            
            ClassDoubleLinkedList temp = new ClassDoubleLinkedList(data);
            temp2.next = temp;
            temp.prev = temp2;

            // temp2.next.prev = temp2;
            // tail = temp2.next;
        }
    }
}