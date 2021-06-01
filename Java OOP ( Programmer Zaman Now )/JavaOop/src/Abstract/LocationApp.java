// package Abstract;
// import Abstract.data.*; // Fungsi import digunakan untuk mengimport 
// import Abstract.data.Location;

public class LocationApp {
      public static void main(String[] args) {
            // var location = new Location(); // Error karna Class ini adalah Abstract
            // location.name = "Surabaya";
            // System.out.println(location.name);
            System.out.println("------------Class City------------");

            final Integer applyNumber1 = 99;
            final Integer applyNumber2 = 99;
            final String abjadFromClassLocationApp[] = {"A", "B", "C", "D", "E"};
            final String collectionFromClassLocationApp[][] = {
                  {"F", "G", "H", "I"},
                  {"J", "K", "L", "N"},
                  {"M", "O", "P", "Q"},
            };

            City city = new City();
            city.nimFromClassLocation = 1461595260;
            // city.nameFromClassLocation = "Jakarta";
            for (int i = 0; i < city.numberFromClassLocation.length; i++) {
                  System.out.print(city.numberFromClassLocation[i] + ", ");
            }
            System.out.println();
            for (int a = 0; a < city.numberDynamicFromClassLocation.length; a++) {
                  for (int b = 0; b < city.numberDynamicFromClassLocation[a].length; b++) {
                        System.out.print(city.numberDynamicFromClassLocation[a][b] + ", ");
                  }
            }
            System.out.println();
            System.out.println(city.nimFromClassLocation);
            System.out.println(city.nameFromClassLocation);

            int w = 0;
            while (w < city.numberDoubleFromClassCity.length) {
                  System.out.print(city.numberDoubleFromClassCity[w] + ", ");
                  w++;
            }
            System.out.println();
            int x = 0;
            while (x < city.numberFromClassCity.length) {
                  System.out.print(city.numberFromClassCity[x] + ", ");
                  x++;
            }
            System.out.println();
            city.applyNumberMethodFromClassCity(applyNumber1, applyNumber2);
            city.applyBooleanMethodFromClassCity(applyNumber1, applyNumber2);
            city.applyAllTypeFromClassCity(applyNumber1, applyNumber2);
            city.applyAbjadArray(abjadFromClassLocationApp, collectionFromClassLocationApp);

            System.out.println("\n\n------------Class Location------------");
            city.methodFromClassLocation(applyNumber1, applyNumber2, abjadFromClassLocationApp, collectionFromClassLocationApp);
      }
}
