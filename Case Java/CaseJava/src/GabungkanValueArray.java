public class GabungkanValueArray {
    void getNumber(int a, int b, int numberA[], int numberB[]) {
        int saveNumber[] = new int [5];
        int y = 0;
        for (int x = 0; x < numberA.length; x++) {
            // System.out.print(saveNumber[x]);
            if (a <= b) {
                saveNumber[x] = numberA[x];
                a++; 
                // x = 0, 1, 2, 3, 4
                // a = 2, 3, 4, 5, 6
            } else {
                if (y <= 0) {
                    for (y = 0; y < numberB.length; y++) {
                        System.out.print(numberB[y]);
                        System.out.print(", ");
                    }
                } else {
                    System.out.print(numberA[x]);
                    System.out.print(", ");
                }
            }
        }
        for (int c = 0; c < saveNumber.length; c++) {
            if (saveNumber[c] == 0) break;
            System.out.print(saveNumber[c]);
            System.out.print(", ");
        }
    }
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int numberA[] = {1, 2, 3, 4, 5};
        int numberB[] = {6, 7, 8, 9, 10};
        GabungkanValueArray process = new GabungkanValueArray();
        process.getNumber(a, b, numberA, numberB);
    }
}
