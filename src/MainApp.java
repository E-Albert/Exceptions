//used to capture user input
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PasswordVerify[] accounts = new PasswordVerify[4]; // We'll store 4 accounts here
        int validCount = 0; // Track how many valid accounts we've created

        System.out.println("Welcome to Account Creation!");
        System.out.println("Please follow the username and password rules.");
        System.out.println("Username: 10 characters with 4 vowels, or at least 5 characters and 3 digits.");
        System.out.println("Password: Must be 20 characters long, with 3 special characters, and 10 of those characters must be 'E'.");

        // Loop until we've got 4 valid accounts
        while (validCount < 4) {
            System.out.println("Enter a username:");
            String username = scanner.nextLine();

            System.out.println("Enter a password:");
            String password = scanner.nextLine();

            try {
                // Try to create a new account (PasswordVerify object)
                accounts[validCount] = new PasswordVerify(username, password);
                System.out.println("Account successfully created!"); // If no exception, it worked!
                validCount++; // Only increment if it was valid
            } catch (PasswordVerifyException e) {
                // Catch any issues with the username or password
                System.out.println(e.getMessage()); // Tell the user what went wrong
            }
        }

        // Once we've got 4 valid accounts, print them out
        System.out.println("Here are your valid accounts:");
        for (PasswordVerify account : accounts) {
            System.out.println("Username: " + account.getUsername());
        }

        // Close the scanner
        scanner.close();
    }
}
