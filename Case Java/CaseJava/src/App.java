import java.util.Scanner;

public class App {

    void Test(String data, int indexPembuka) {
        System.out.print("Masukkan Index Pembuka : ");
        Scanner input = new Scanner(System.in);
        indexPembuka = input.nextInt();

        // String data = "a (b c (d e (f) g) h) i (j k)";
        int number = 0;
        for (int a = indexPembuka; a < data.length(); a++) {
            char result = data.charAt(a);
            if (result == '(') {
                number++;
            } else if (result == ')') {
                number--;
                if (number == 0) {
                    System.out.println("String Index Penutup = " + a);
                    break;
                } 
            }
        }






            // else if (result != '(' || result != ')') {
            //     continue;
            // }

            // else if (indexPembuka == data.indexOf("(", indexPembuka)) {
            //     int indexPenutup = data.indexOf(")");
            //     System.out.print("Index Penutup = " + indexPenutup);
            //     break;
            // }
            // if (indexPembuka == data.indexOf("a")) {
                //     System.out.print("zz");
                //     System.out.println("Karakter Pembuka = " + result);
                //     int indexPenutup = data.indexOf(")", a);
                //     System.out.println("Karakter Penutup = " + indexPenutup);
                //     break;
                //     // System.out.println("Penutup Index Ke = " + penutupIndex);
                // }

        // try {
        //     char result = data.charAt(indexPembuka);
        //     if (indexPembuka == data.indexOf(" ")) {
        //         System.out.println("Karakter Pembuka = Index hanya berupa spasi");
        //     } else {
        //         System.out.println("Karakter Pembuka = " + result);
        //         // System.out.println("Panjang Karakter = " + data.length());
        //         if (indexPembuka == 2) {
        //             char result1 = data.charAt(20);
        //             System.out.println("Karakter Penutup = " + result1);
        //             int penutupIndex = data.indexOf(")", 20);
        //             System.out.println("Penutup Index ke = " + penutupIndex);
        //         } else if (indexPembuka == 7) {
        //             char result1 = data.charAt(17);
        //             System.out.println("Karakter Penutup = " + result1);
        //             int penutupIndex = data.indexOf(")", 17);
        //             System.out.println("Penutup Index ke = " + penutupIndex);
        //         } else if (indexPembuka == 12) {
        //             char result1 = data.charAt(14);
        //             System.out.println("Karakter Penutup = " + result1);
        //             int penutupIndex = data.indexOf(")", 14);
        //             System.out.println("Penutup Index ke = " + penutupIndex);
        //         } else if (indexPembuka == 24) {
        //             char result1 = data.charAt(28);
        //             System.out.println("Karakter Penutup = " + result1);
        //             int penutupIndex = data.indexOf(")", 28);
        //             System.out.println("Penutup Index ke = " + penutupIndex);
        //         }
        //     }
        // } catch (Exception e){
        //     // e.printStackTrace();
        //     if (indexPembuka >= data.length()) {
        //         System.out.println("Index Tidak tersedia");
        //     }
        // }
    }

    public static void main(String[] args) throws Exception {
        // String data = "a (b c (d e (f) g) h) i (j k)";
        String data = "ab (n) c d (e (f g(h i) j k) l) p q";
        int indexPembuka = 2;
        App case1 = new App();
        case1.Test(data, indexPembuka);
    }
}
