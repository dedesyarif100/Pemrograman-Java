// package Abstract;

public class City extends Location {
    public final Integer applyNumberMethodFromClassCity(final int a, final int b) {
        int c = a;
        c = 5;
        System.out.println(a + b + c);
        return a;
    }

    public final Boolean applyBooleanMethodFromClassCity(int applyNumber1, int applyNumber2) {
        if (applyNumber1 == applyNumber2) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }
        return true;
    }

    public final String[] applyAbjadArray(final String[] abjadFromClassLocationApp, final String[][] collectionFromClassLocationApp) {
        for (int a = 0; a < abjadFromClassLocationApp.length; a++) {
            System.out.print(abjadFromClassLocationApp[a] + ", ");
        }
        System.out.println();
        for (int b = 0; b < collectionFromClassLocationApp.length; b++) {
            for (int c = 0; c < collectionFromClassLocationApp[b].length; c++) {
                System.out.print(collectionFromClassLocationApp[b][c] + ", ");
            }
        }
        return abjadFromClassLocationApp;
    }

    public final void applyAllTypeFromClassCity(int a, int b) {
        City cityFromApply = new City();
        System.out.println("From Class City, Method applyAllType : " + (a + b));
        System.out.println(cityFromApply.nimFromClassLocation);
    }
    public String nameFromClassCity = "Alex";
    public Double[] numberDoubleFromClassCity = {1.1, 1.2, 1.3};
    public Integer[] numberFromClassCity = {11, 22, 33, 44, 55, 66};
}
