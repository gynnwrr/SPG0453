package loop9;

import java.util.Scanner;

public class Loop9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            int evenCount = 0;
            int oddCount = 0;

            System.out.print("Enter the number of integers in the sequence: ");
            int n = input.nextInt();

            System.out.println("Enter the integers:");
            for (int i = 0; i < n; i++) {
                int num = input.nextInt();
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            System.out.println("\nNumber of even integers: " + evenCount);
            System.out.println("Number of odd integers: " + oddCount);

            // Prompt the user to continue or exit
            System.out.print("\nDo you want to continue? (yes/no): ");
            choice = input.next().toLowerCase();

        } while (choice.equals("yes"));

        System.out.println("Program exited.");
        input.close();
    }
}

