
public class Logger {
    // Private static instance of the class
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {}

    // Public method to provide access to the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Example method to use the Logger
    public void log(String message) {
        System.out.println(message);
    }
}
