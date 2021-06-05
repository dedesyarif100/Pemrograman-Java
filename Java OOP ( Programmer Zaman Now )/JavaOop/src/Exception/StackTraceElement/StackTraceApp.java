package StackTraceElement;

public class StackTraceApp {
    public static void main(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {
                "Eko", "Kurniawan", "Khannedy"
            };

            System.out.println(names[1]); 
        } catch (Throwable throwable) {
            // StackTraceElement[] stackTraceElements = throwable.getStackTrace();
            // throwable.printStackTrace();
            throw new RuntimeException(throwable);
        }
    }
}
