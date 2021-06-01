public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        Byte iniByte = 12;
        double doubleValue = (double) iniByte;
        doubleValue = 12.4;
        System.out.println(doubleValue);

        int iniInt = 100;
        Integer iniObject = iniInt;
        System.out.println(iniInt);

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
        double iniDouble = iniObject.doubleValue();

        System.out.println(iniDouble);
    }
}
