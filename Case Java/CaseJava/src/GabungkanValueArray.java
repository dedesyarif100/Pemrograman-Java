import java.util.Scanner;

public class GabungkanValueArray {
    void getNumber(int a, int b, int numberA[], int numberB[]) {
        int x = 0;
        int y = 0;
        int saveRange[] = new int [5];
        int saveNumberA[] = new int [5];
        boolean applyDataB = true;
        for (int applyNumberA = 1; applyNumberA <= numberA.length; applyNumberA++) {
            // if (applyNumberA == 4) {
            //     System.out.println("Cek saja");
            // }
            if (applyNumberA < a) {
                System.out.print(numberA[applyNumberA - 1]);
                System.out.print(", ");
            } else {
                if (a <= b) {
                    saveRange[x] = numberA[a - 1];
                    a++;
                    x++;
                } else {
                    // if (applyNumberA == 4) {
                    //     System.out.println(applyNumberA);
                    // }
                    saveNumberA[y] = numberA[applyNumberA - 1];
                    y++;
                    // if (applyNumberA == 4) {
                    //     System.out.println("Cek saja 3");
                    // }
                }
            }
        }

        for (int n = 0; n < numberB.length; n++) {
            System.out.print(numberB[n]);
            System.out.print(", ");
        }
        for (int applyValueA = 0; applyValueA < saveNumberA.length; applyValueA++) {
            if (saveNumberA[applyValueA] == 0) {
                break;
            }
            System.out.print(saveNumberA[applyValueA]);
            System.out.print(", ");
        }
        System.out.print("Range : ");
        for (int applyRangeA = 0; applyRangeA < saveRange.length; applyRangeA++) {
            if (saveRange[applyRangeA] == 0) {
                break;
            }
            System.out.print(saveRange[applyRangeA]);
            System.out.print(", ");
        }
    }
    public static void main(String[] args) {
        int numberA[] = {1, 2, 3, 4, 5};
        int numberB[] = {6, 7, 8, 9, 10};

        
        Scanner rangeA = new Scanner(System.in);
        Scanner rangeB = new Scanner(System.in);

        System.out.print("Input Range A : ");

        if (!rangeA.hasNextInt()) {
            System.out.println("INPUTAN HARUS ANGKA");
        }
        System.out.print("Input Range A : ");
        if (!rangeB.hasNextInt()) {
            System.out.println("INPUTAN HARUS ANGKA");
        }
        else {
            int a = rangeA.nextInt();
            int b = rangeB.nextInt();
            if (a >= 5 && b >= 5) {
                System.out.println("DATA A DAN B TIDAK BOLEH LEBIH DARI 5");
            } else if (a >= 5) {
                System.out.println("DATA A TIDAK BOLEH LEBIH DARI 5");
            } else if (b >= 5) {
                System.out.println("DATA B TIDAK BOLEH LEBIH DARI 5");
            } else if (a > b) {
                System.out.println("DATA A HARUS LEBIH KECIL DARI DATA B");
            } else {
                GabungkanValueArray process = new GabungkanValueArray();
                process.getNumber(a, b, numberA, numberB);
            }
        }
        
    }
}
