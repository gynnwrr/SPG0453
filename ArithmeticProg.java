package ArithmeticProg;

import java.util.Scanner;

public class ArithmeticProg {
    
    public static void main (String[] args) {
        
        int num1,num2, menu;
        int sum, minus, multiply, divide, modulus;
        Scanner input = new Scanner(System.in);
        
        //user insert numbers
        System.out.println("Enter first integer: ");
        num1 = input.nextInt();
        
        System.out.println("Enter second integer: ");
        num2 = input.nextInt();
        
        //menu option
        System.out.println("        \n\nMENU\n        ");
        System.out.println("[1] Addition");
        System.out.println("[2] Subtraction");
        System.out.println("[3] Multiplication");
        System.out.println("[4] Division");
        menu = input.nextInt();
        
        //calculation
        sum = num1 + num2;
        minus = num1 - num2;
        multiply = num1 * num2;
        divide = num1/num2;
        
        switch (menu){
            case 1: System.out.println("\nAddition = "+sum); break;
            case 2: System.out.println("\nSubtraction = "+minus); break;
            case 3: System.out.println("\nMultiplication = "+multiply); break;
            case 4: System.out.println("\nDivision = "+divide); break;
            default: System.out.println("Invalid option"); break;
            
        }
        
    }}