// import java.math.BigInteger;

// package programmer.zaman.now.generic.application;
// import programmerZamanNowGeneric.MyData;

// Generic Class

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Dede");
        MyData<Integer> integerMyData = new MyData<Integer>(100);
        MyData<Double> doubleMyData = new MyData<Double>(2.5);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();
        Double doubleValue = doubleMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);
        System.out.println(doubleValue);

    }
}
