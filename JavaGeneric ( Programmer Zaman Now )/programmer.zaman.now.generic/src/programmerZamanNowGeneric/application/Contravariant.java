// Contravariant
public class Contravariant {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Dede");
        objectMyData.setData(1000);
        MyData<? super String> myData = objectMyData;

        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        // String value = (String) myData.getData();
        Object value = myData.getData();

        System.out.println("Process parameter " + value);
        myData.setData("Hend");
    }
}
