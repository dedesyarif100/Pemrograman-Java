// Covariant

public class CovariantApp {
    public static void main(String[] args) {
        MyData<String> stringMyData = new MyData<>("Eko");
        process(stringMyData);

        MyData<? extends Object> myData = stringMyData; // Set Object Covariant
    }

    public static void process(MyData<? extends Object> myData) { // Parameter Covariant
        System.out.println(myData.getData());
        // myData.setData(1); tidak boleh, karena berbahaya
    }
}
