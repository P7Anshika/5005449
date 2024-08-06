public class Main {
    public static void main(String[] args) {
        // Get the single instance of Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both instances are the same
        System.out.println("Logger 1 and Logger 2 are the same instance: " + (logger1 == logger2));

        // Use the logger
        logger1.log("This is a message.");
    }
}
