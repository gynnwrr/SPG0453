package task2;

import java.util.Scanner;

public class Task2 {
    
    public static void main (String[] args) {
        
        String name,hobby, food;
        int age;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        name = input.nextLine();
        
        System.out.println("\nEnter your age: ");
        age=input.nextInt();
        input.nextLine();
        
        System.out.println("\nEnter your hobby: ");
        hobby = input.nextLine();
        
        System.out.println("\nEnter your favourite food: ");
        food = input.nextLine();
        input.close();
        
        System.out.println("\nName :"+name);
        System.out.println("Age :"+age);
        System.out.println("Hobby :"+hobby);
        System.out.println("Favourite Food :"+food);
    }
}