package Abstract.application;

// import Abstract.data.*; // Fungsi import digunakan untuk mengimport 
// import Abstract.data.Location;

public class LocationApp {
      public static void main(String[] args) {
         //   var location = new Location(); // Error karna Class ini adalah Abstract

         City city = new City();
         city.name = "Jakarta";

         System.out.println(city.name);
      }
}
