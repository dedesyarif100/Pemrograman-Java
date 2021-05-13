import org.w3c.dom.TypeInfo;

public class App2 {
    public static void main(String[] args) throws Exception {
        byte initByte = 100;
        short iniShort = 1000;
        int integer = 1000000000;
        long longs = 10000000L;

        float iniFloat = 10.90F;
        double iniDouble = 10.30;

        // Kode Literals
        int decimalInt = 34;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101011;

        int amount = 1_000_000_000;

        // konversi Tipe Data / Casting
        byte iniByte = 10;
        short iniShort2 = iniByte;
        int iniInt = iniShort2;

        // TipeData Casting 
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;
        System.out.println(iniInt2);
        System.out.println(iniByte2);

        var a = 12;
        var b = 'A';
        var c = true;
        var d = 1.2;

        int e;

        final String apps = "Java";
    }
}
