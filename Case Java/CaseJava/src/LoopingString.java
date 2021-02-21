import java.util.Scanner;

public class LoopingString {
    void pilihKata(String data, int indexPembuka) {
        System.out.print("Masukkan Index Pembuka = ");
        Scanner input = new Scanner(System.in);
        indexPembuka = input.nextInt();
        
        int number = 0;
        for (int a = indexPembuka; a < data.length(); a++) {
            int result = data.charAt(a);
            if (result == '<') {
                number++;
            } else if (result == '>') {
                number--;
                if (number == 0) {
                    System.out.println("Index Penutup adalah = " + a);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        String data = "<|>-<-<->|<-<->->->";
        int indexPembuka = 0;
        LoopingString string = new LoopingString();
        string.pilihKata(data, indexPembuka);
    }
}

// Temukan output dari angka = "1 - 2 - 3 - 4 - 3 - 2 - 1";
