public class Apps {
    public static final int PROCESSORS;
    static int Runtime = 12;

    static {
        System.out.println("Mengakses Class Application");
        // PROCESSORS = Runtime.getRuntime().availableProcessors();
        PROCESSORS = Runtime;
    }
}
