// package Abstract;

// Abstract Class tidak bisa menginstansiasi Object
// Jika ingin menginstansiasi Object, harus dari class turunannya sendiri
public abstract class Location {
    public Integer nimFromClassLocation = 1111111;
    public final String nameFromClassLocation = "JKT";
    protected Integer[] numberFromClassLocation = {1,2,3,4,5,6};
    protected Integer[][] numberDynamicFromClassLocation = {
        {1,2,3,4,5,6}, 
        {7,8,9,10,11,12}
    };
    public void methodFromClassLocation(final int a, final int b, final String[] abjadFromClassLocationApp, final String[][] collectionFromClassLocationApp) {
        System.out.println("Data From Class Location : " + a + b);
        for (int x = 0; x < abjadFromClassLocationApp.length; x++) {
            System.out.print(abjadFromClassLocationApp[x] + ", ");
        }
        System.out.println();
        for (int y = 0; y < collectionFromClassLocationApp.length; y++) {
            for (int z = 0; z < collectionFromClassLocationApp[y].length; z++) {
                System.out.print(collectionFromClassLocationApp[y][z] + ", ");
            }
        }
        System.out.println("\nTest Location Class");
    }
}