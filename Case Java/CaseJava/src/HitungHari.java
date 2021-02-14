public class HitungHari {
    public static void main(String[] args) {
        int currentFeet = 0;
        int hari = 1;
        int kedalaman = 32;

        // int currentFeet = feet + 7;
        while(true) {
            currentFeet = currentFeet + 7;
            currentFeet = currentFeet - 2;
            // if (currentFeet == 30) {
            //     currentFeet += 2;
            // }
            System.out.println("Hari ke " + hari + " = " + currentFeet);
            if (currentFeet >= kedalaman) break;
            hari++;
        }
    }
}
