package SuperKeyword;

public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println(shape.getCorner());
        // System.out.println(shape.getString("Dede", "Surabaya"));

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());

        System.out.println(shape.getString());
        System.out.println(rectangle.getString());
        System.out.println(rectangle.getParentString());

        System.out.println(shape.getNameString("Surabaya", "JATIM"));
        System.out.println(rectangle.getNameString("Semarang", "JATENG"));
        System.out.println(rectangle.getParentNameString("Jakarta", "Jakarta"));
    }
}
