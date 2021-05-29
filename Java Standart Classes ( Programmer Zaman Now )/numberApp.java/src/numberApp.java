public class numberApp {
    public static void main(String[] args) throws Exception {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();


        System.out.println(longValue);
        System.out.println(doubleValue);

        String contoh1 = "123456";
        Integer contoh2 = 123456;
        Integer contoh3 = 7892;
        Double contohInt = Double.valueOf(contoh1);
        Double contohDouble = Double.valueOf(contoh2);
        String contohString = String.valueOf(contoh3);
        System.out.println(contohInt);
        System.out.println(contohDouble);
        System.out.println(contohString);


    }
}
