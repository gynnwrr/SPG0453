
package loop8;

import java.util.Scanner;

public class Loop8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Base salary for the salesman
        double baseSalary = 600.00;
        double commissionRate = 0.05; // 5% commission

        // Prompt the user to enter the total sales amount for the week
        System.out.print("Enter the gross sales for the previous week (in RM): ");
        double grossSales = input.nextDouble();

        // Calculate the commission
        double commission = grossSales * commissionRate;

        // Calculate total earnings for the week
        double totalEarnings = baseSalary + commission;

        // Display the results
        System.out.println("\nSalesman's earnings for the week:");
        System.out.println("Base Salary: RM " + baseSalary);
        System.out.println("Commission (5% of RM " + grossSales + "): RM " + commission);
        System.out.println("Total Earnings: RM " + totalEarnings);

        input.close();
    }
}

