package loop10;

import java.util.Scanner;

public class Loop10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the limit for the Fibonacci series
        System.out.print("Enter the limit up to which you want to display the Fibonacci series: ");
        int limit = input.nextInt();

        // Variables to store the first two Fibonacci numbers
        int first = 0, second = 1;

        System.out.println("Fibonacci series up to " + limit + ":");

        // Check if the limit is less than or equal to 0
        if (limit <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (limit == 1) {
            System.out.print(first);
        } else {
            System.out.print(first + " " + second + " ");

            // Loop to generate the Fibonacci series iteratively
            int next;
            for (int i = 3; i <= limit; i++) {
                next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }

        input.close();
    }
}

