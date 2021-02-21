public class test {
    void getNumber(int numberA[], int numberB[]) {
        int saveNumber[] = new int [5];
        for (int a = 0; a < numberA.length; a++) {
            if (a == 0) {
                System.out.print(numberA[a]);
                System.out.print(", ");
            } else {
                saveNumber[a] = a;
            }
        }
        for (int b = 0; b < numberB.length; b++) {
            System.out.print(numberB[b]);
            System.out.print(", ");
        }
        for (int c = 0; c < saveNumber.length; c++) {
            if (c == 0) {
                continue;
            } else {
                System.out.print(saveNumber[c]);
                System.out.print(", ");
            }
        }
    }
    public static void main(String[] args) {
        int numberA[] = {1, 2, 3, 4, 5};
        int numberB[] = {6, 7, 8, 9, 10};
        test process = new test();
        process.getNumber(numberA, numberB);
    }
}
