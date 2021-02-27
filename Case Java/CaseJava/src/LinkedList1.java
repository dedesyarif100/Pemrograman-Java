import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        //Membuat Instance/Objek dari LinkedList
        LinkedList<String> buah = new LinkedList<>();
        LinkedList<Integer> number = new LinkedList<>();
        LinkedList<Void> dynamic = new LinkedList<>();

        //Menambahkan Data pada Objek buah
        buah.add("Jeruk");
        buah.add("Jambu");
        buah.add("Apel");
        buah.add("Melon");
        buah.add("Semangka");
        buah.add("Nanas");
        buah.add("Sirsak");

        //Menambahkan Data pada Objek number
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        
        //Mencetak/Menampilkan Data
        System.out.println("Nama Buah : " + buah);
        
        //Menghitung Jumlah/Ukuran pada Objek LinkedList
        System.out.println("Jumlah Buah : " + buah.size());

        System.out.println("Nomor : " + number);
        System.out.println("Jumlah nomor : " + number.size());

        buah.addFirst("Atas"); // Menambahkan Data pada Index Teratas
        buah.addLast("Bawah"); // Menambahkan Data pada Index Terbawah
        buah.set(2, "Diubah"); // Mengubah Data pada Index No. 2
        buah.set(5, "Diubah"); // Mengubah Data pada Index No. 5
        System.out.println("Nama Buah : " + buah);

        // Mengambil Data pada Urutan Teratas
        System.out.println("Data Teratas: "+buah.getFirst());
        // Mengambil Data pada Urutan Terbawah
        System.out.println("Data Terbawah: "+buah.getLast());
        // Mengambil Data pada Nomor Index 1
        System.out.println("Data NoIndex 1: "+buah.get(1)); 
        // Mengambil Data pada Nomor Index 3
        System.out.println("Data NoIndex 3: "+buah.get(3));
    }
}
