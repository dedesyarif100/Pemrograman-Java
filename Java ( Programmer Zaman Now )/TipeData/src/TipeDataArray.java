public class TipeDataArray {
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "aaa";
        stringArray[1] = "bbb";
        stringArray[2] = "ccc";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Budi";
        
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        // Inisialisasi array
        String[] namaNama = {"dede", "hendro", "rian"};

        namaNama[0] = null;
        System.out.println(namaNama[0]);
        System.out.println(namaNama[1]);
        System.out.println(namaNama[2]);

        int[] arrayInt = new int[]{
            1,2,3,4,5,6,7,8,9,10
        };

        long[] arrayLong = {
            10L, 20L, 30L
        };

        byte[] arrayByte = {
            10, 20, 30
        };

        int[] arrint = {
            1, 2, 3, 4, 5
        };

    }
}
