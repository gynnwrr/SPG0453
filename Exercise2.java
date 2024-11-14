package exercise.pkg2;

import java.util.Scanner;

public class Exercise2 {
    
    public static void main (String[] args) {
        
        String name;
        int age;
        Scanner input = new Scanner(System.in);
        
        //Reads a single line from the console
        //and stores into name variable
        System.out.println("Enter your name: ");
        name = input.nextLine();
        
        //Reads a integer from the console
        //and stores into age variable
        System.out.println("\nEnter your age: ");
        age=input.nextInt();
        input.close();
        
        //Prints name and age to the console
        System.out.println("\nName :"+name);
        System.out.println("Age :"+age);
    }
}