import java.util.Scanner;

import javax.xml.crypto.Data;

public class InputDataToArray {
    void inputData(int data[], int result) {
        for (int a = 0; a < data.length; a++) {
            System.out.print("Input Index "+ a + " = ");
            Scanner input = new Scanner(System.in);
            data[a] = input.nextInt();
        }
        
        System.out.println("1. Data Dijumlahkan");
        System.out.println("2. Data Dikurangi");
        System.out.println("3. Data yang sama dibuang");
        System.out.print("Pilih Nomor Data = ");
        Scanner pilihData = new Scanner(System.in);
        int saveData = pilihData.nextInt();
        if (saveData == 1) {
            int x = 0;
            int value = 0;
            while (x < data.length) {
                System.out.print(data[x]);
                value = value + data[x];
                if (x == result - 1) {
                    System.out.print(" = " + value);
                    break;
                }
                System.out.print(" + ");
                x++;
            }
        } else if (saveData == 2) {
            int value = 0;
            int x = 0;
            while (x < data.length) {
                System.out.print(data[x]);
                if (value == 0 && x == 0) {
                    value = data[x];
                } else {
                    value = value - data[x];
                }
                if (x == result - 1) {
                    System.out.print(" = " + value);
                    break;
                }
                System.out.print(" - ");
                x++;
            }
        } else if (saveData == 3) {
            
        }
    }
    public static void main(String[] args) {
        System.out.print("Input Jumlah Index = ");
        Scanner inputIndex = new Scanner(System.in);
        int result = inputIndex.nextInt();
        int data[] = new int [result];
        InputDataToArray DataMahasiswa = new InputDataToArray();
        DataMahasiswa.inputData(data, result);
    }
}
