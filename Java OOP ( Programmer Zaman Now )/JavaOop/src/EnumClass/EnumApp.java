// import Map.EnumHashMapApp.Level;
// import Level;
public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Eko");
        customer.setLevel(EnumLevel.PREMIUM);
        // customer.getNameLevel();

        ClassLevel classLevel = new ClassLevel();
        classLevel.getNameLevel();
        classLevel.getNumberLevel();

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = EnumLevel.VIP.name();
        System.out.println(levelName);

        // EnumLevel level = EnumLevel.valueOf("SALAH"); // Error, karna velua yang dicari di class EnumLevel tidak ada
        EnumLevel StandardLevel = EnumLevel.valueOf("STANDARD");
        System.out.println(StandardLevel);

        EnumLevel PremiumLevel = EnumLevel.valueOf("PREMIUM");
        System.out.println(PremiumLevel);

        EnumLevel VipLevel = EnumLevel.valueOf("VIP");
        System.out.println(VipLevel);
    }
}
