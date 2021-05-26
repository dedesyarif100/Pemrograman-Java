// Generic method

public class ArrayHelperApp {
    public static void main(String[] args) {
        String[] names = {"Dede", "Syarifudin", "hidayat"};

        Integer[] numbers = {1,2,3,4,5};

        Integer[][] numbersDynamic = {{1,2,3,4},{3,4,6}};

        System.out.println(
            ArrayHelper.<String>count(names)
        );

        System.out.println(ArrayHelper.<Integer>count(numbers));

        System.out.println(
            ArrayHelper.count(numbersDynamic[0])
        );
    }
}
