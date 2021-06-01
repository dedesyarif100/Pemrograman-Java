package RekursiveMethod;
public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        // System.out.println(1 * 2 * 3 * 4 * 5);

        System.out.println("Factorial Recursive");
        System.out.println(factorialRecursive(1));

        System.out.println("Loop Recursive");
        loopRecursive(1);
    }

    static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) 
        {
            result = result * counter;
        }
        return result;
    }

    static int factorialRecursive(int value) 
    {
        if (value == 6) 
        {
            return 1;
        } 
        else 
        {
            return value * factorialRecursive(value + 1);
        }
    }

    static void loopRecursive(int value) {
        if (value == 0) 
        {
            System.out.println("Selesai");
        } 
        else 
        {
            System.out.println("Loop " + value);
            loopRecursive(value * 2);
        }
    }
}
