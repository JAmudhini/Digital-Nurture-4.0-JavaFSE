public class TestSingleton {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        log1.log("Logging first activity");
        Logger log2 = Logger.getInstance();
        log2.log("Logging second activity");
        if (log1 == log2) {
            System.out.println("Same logger used for both.");
        } else {
            System.out.println("Different loggers detected.");
        }
    }
}
