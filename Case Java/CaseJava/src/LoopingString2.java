import java.util.Scanner;

public class LoopingString2 {
    void inputString(String data, int indexPembuka) {
        System.out.print("Masukkan Index Pembuka = ");
        Scanner input = new Scanner(System.in);
        indexPembuka = input.nextInt();

        int number = 0;
        for (int x = indexPembuka; x < data.length(); x++) {
            int result = data.charAt(x);
            if (result == '[' || result == '<') {
                number++;
            } else if (result == ']' || result == '>') {
                number--;
                if (number == 0) {
                    System.out.println("Index Penutup  = " + x);
                    break;
                }
            } 
        }
    }
    public static void main(String[] args) {
        String data = "[<>]-[<[-]>]";
        int indexPembuka = 0;
        LoopingString2 kata = new LoopingString2();
        kata.inputString(data, indexPembuka);
    }
}
