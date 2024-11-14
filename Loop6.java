package loop6;

import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to Hogwarts! Please log in to your page :D\n");
        // Set the correct password
        String correctPassword = "aidap4wtter";
        int maxAttempts = 3; // Maximum number of attempts allowed
        boolean Authentic = false;
        
        // Loop to allow the user to try entering the password up to maxAttempts
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("\nEnter your password (Attempt " + attempt + " of " + maxAttempts + "): ");
            String enteredPassword = input.nextLine();
            
            // Check if the entered password is correct
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Access Granted! Welcome.");
                Authentic = true;
                break;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        }
        
        // If not authenticated after max attempts
        if (!Authentic) {
            System.out.println("\nThe system is locked for 2 minutes.");
        }
        
        input.close();
    }
}

