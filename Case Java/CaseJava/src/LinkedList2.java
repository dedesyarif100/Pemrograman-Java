import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> number = new LinkedList<>();

        // add(index) Untuk menambahkan data
        number.add(1);
        number.add(2);

        System.out.println(number);

        number.add(3);
        System.out.println(number);
        number.add(4);
        number.add(5);

        // size() Untuk menghitung jumlah elemen
        System.out.println(number.size());

        // addFirst() Untuk menambahkan data di elemen pertama
        number.addFirst(0);

        // addLast() Untuk menambahkan data di elemen terakhir
        number.addLast(6);

        // set(index, input) Untuk mengubah elemen pada index tertentu
        number.set(1, 11);
        number.set(3, 33);
        System.out.println(number);
        // getFirst() Untuk mendapatkan data pada elemen pertama
        // getLast() Untuk mendapatkan data pada elemen terakhir
        // get(index) Untuk mendapatkan data pada elemen tertentu
        System.out.println("Get First : " + number.getFirst());
        System.out.println("Get Last : " + number.getLast());
        System.out.println("Get By Index : " + number.get(1));

        number.removeFirst();
        number.removeLast();
        number.remove(0);
        number.remove(1);
        number.remove(2);
        System.out.println(number);

        if (number.isEmpty()) {
            System.out.println("Data Kosong");
        } else {
            System.out.println("Data Ada");
        }
        
        if (number.contains(3)) {
            System.out.println("Index Ditemukan");
        } else {
            System.out.println("Index Tidak Ditemukan");
        }

        number.add(2, 33);
        System.out.println(number);
    }
}
