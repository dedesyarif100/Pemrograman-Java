public class MethodVariabelArguments {
    public static void main(String[] args) {
        int[] values = {80, 90, 80, 60, 75};
        sayCongrats("Dede", values);

        sayCongrats("Hallo", 80, 85, 70, 90);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) 
        {
            total = total + value;
        }

        var finalValue = total / values.length;
        System.out.println("Nilai anda " + finalValue);
        if (finalValue >= 75) 
        {
            System.out.println("Selamat " + name + ", anda lulus");
        } 
        else 
        {
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    }
}


// Method yang Return Value array ada 2 macam :
// 1. int[]  = Tanpa Variabel Argument
// 2. int... = Dengan Variabel Argument