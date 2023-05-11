import java.util.Scanner;

public class PreventBufferOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password (up to 20 characters): ");
        String password = scanner.nextLine();

        // Validate the input to prevent buffer overflow
        if (password.length() > 20) {
            System.out.println("Error: Input exceeds maximum length of 20 characters.");
            return; // Exit the program if input is invalid
        }

        System.out.println("Your password is, " + password + "!");
        scanner.close();
    }
}
