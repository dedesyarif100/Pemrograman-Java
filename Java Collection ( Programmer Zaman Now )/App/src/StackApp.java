// stack
import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        stack.push("Eko");
        stack.push("Kurniawan");
        stack.push("Khannedy");

        for (var value = stack.pop(); value != null; value = stack.pop()) {
            System.out.println(value);
        }
    }
}
