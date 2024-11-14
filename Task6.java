package task.pkg6;

import java.util.Scanner;

public class Task6 {
    
    public static void main (String[] args) {
        
        double height, weight, bmi;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your height (m): ");
        height = input.nextDouble();
        
        System.out.println("Enter your weight (kg): ");
        weight = input.nextDouble();
        input.close();
        
        bmi=weight/(height*height);
        
        String output;
        output= String.format("Your BMI is %.2f",+bmi);
        System.out.println(output);
        
    }}
