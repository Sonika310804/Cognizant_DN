package DesignPatterns_And_Principles.SingletonPattern_Example;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("App started");

        Logger logger2 = Logger.getInstance();
        logger2.log("App running");

        if (logger1 == logger2) {
            System.out.println("Singleton confirmed: Both loggers are the same instance.");
        } else {
            System.out.println("Singleton FAILED: Different instances found.");
        }
    }
}