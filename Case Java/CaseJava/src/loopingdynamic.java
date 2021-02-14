public class loopingdynamic {
    public static void main(String[] args) {
        int data[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
        };
        for(int a = 0; a < data.length; a++) {
            for (int b = 0; b < data[a].length; b++) {
                System.out.print(data[a][b]);
                if (a == 10) break;
                System.out.print(", ");
            }
        }
    }
}
