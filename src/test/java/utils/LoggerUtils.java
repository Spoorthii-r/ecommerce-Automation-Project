package utils;

public class LoggerUtils {

    public static void info(String message) {

        System.out.println("[INFO] : " + message);
    }

    public static void error(String message) {

        System.out.println("[ERROR] : " + message);
    }

    public static void warning(String message) {

        System.out.println("[WARNING] : " + message);
    }
}