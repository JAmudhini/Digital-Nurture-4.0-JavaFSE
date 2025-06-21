//Logger.java

public class Logger {
    private static Logger obj;
    private Logger() {
        System.out.println("Logger is up and running.");
    }
    public static Logger getInstance() {
        if (obj == null) {
            obj = new Logger();
        }
        return obj;
    }
    public void log(String msg) {
        System.out.println(msg);
    }
}


//TestSingleton.java

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

