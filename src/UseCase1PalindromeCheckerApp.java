/*
 * UseCase1: Application Entry & Welcome Message
 * Displays application name and version at startup.
 */

public class UseCase1PalindromeCheckerApp {

    // Application details as constants
    static final String APP_NAME = "Palindrome Checker Application";
    static final String APP_VERSION = "Version 1.0";

    // Main Method - Entry point of the program
    public static void main(String[] args) {

        // Display welcome message
        System.out.println("========================================");
        System.out.println("Welcome to " + APP_NAME);
        System.out.println(APP_VERSION);
        System.out.println("========================================");

        // Application flow continues or exits
        System.out.println("Application started successfully.");
        System.out.println("Ready to proceed to the next use case...");
    }
}
