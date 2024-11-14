package loop7;

import java.util.Scanner; 
public class Loop7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int passed = 0;
        int failed = 0;

        // Loop to input test results for each student
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.print("Enter result for student " + i + " (1 = Pass, 0 = Fail): ");
            int result = input.nextInt();

            switch (result) {
                case 1:
                    passed++;
                    break;
                case 0:
                    failed++;
                    break;
                default:
                    System.out.println("Invalid input! Please enter 1 for Pass or 0 for Fail.");
                    i--; // Decrease counter to re-enter result for the same student
                    break;
            }
        }

        // Display the number of students who passed and failed
        System.out.println("\nNumber of students who passed: " + passed);
        System.out.println("Number of students who failed: " + failed);

        // Check if more than 50% of the students passed
        if (passed > numberOfStudents / 2) {
            System.out.println("Bonus to instructor");
        }

        input.close();
    }
}
