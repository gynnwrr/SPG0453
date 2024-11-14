package onlinebuy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Onlinebuy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // input - object name for scanner

        boolean keepOrdering = true; // Control variable for loop

        while (keepOrdering) {
            try {
                System.out.println("Welcome to aiBuys");
                System.out.println("\nPlease enter the number of the item that you want to purchase:");
                System.out.println("[1] Baju Kurung Sulam - RM80.00");
                System.out.println("[2] Baju Kebaya - RM75.00");
                System.out.println("[3] Abaya - RM80.00");
                System.out.println("[0] Exit");

                int menu = input.nextInt(); // Get input from user - input integer type (nextInt)

                switch (menu) {
                    case 1: // Baju Kurung Sulam
                        System.out.println("Enter the quantity: ");
                        int quantity1 = input.nextInt();

                        System.out.println("\n      Order Summary     ");
                        System.out.println("Item: Baju Kurung Sulam");
                        System.out.println("Price: RM80.00");
                        System.out.println("Quantity: " + quantity1);

                        double total1 = quantity1 * 80;
                        System.out.println("Total: RM " + total1);
                        System.out.println("\n  Please proceed to checkout  ");
                        break;

                    case 2: // Baju Kebaya
                        System.out.println("Enter the quantity: ");
                        int quantity2 = input.nextInt();

                        System.out.println("\n      Order Summary     ");
                        System.out.println("Item: Baju Kebaya");
                        System.out.println("Price: RM75.00");
                        System.out.println("Quantity: " + quantity2);

                        double total2 = quantity2 * 75;
                        System.out.println("Total: RM " + total2);
                        System.out.println("\n  Please proceed to checkout  ");
                        break;

                    case 3: // Abaya
                        System.out.println("Enter the quantity: ");
                        int quantity3 = input.nextInt();

                        System.out.println("\n      Order Summary     ");
                        System.out.println("Item: Abaya");
                        System.out.println("Price: RM80.00");
                        System.out.println("Quantity: " + quantity3);

                        double total3 = quantity3 * 80;
                        System.out.println("Total: RM " + total3);
                        System.out.println("\n  Please proceed to checkout  ");
                        break;

                    case 0: // Exit
                        System.out.println("Thank you for visiting aiBuys!");
                        keepOrdering = false;
                        break;

                    default:
                        System.out.println("Invalid option! Please select a valid item.");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input! Please enter a number.\n");
                input.nextLine();
            }
        }

        input.close();
    }
}