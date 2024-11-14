package ifdemo;

import java.util.Scanner;

public class IfDemo{
    public static void main(String[] args){
        int grade;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the marks: ");
        grade = input.nextInt();
        input.close();
        
        if(grade>=60)
            System.out.println("\nPassed");
        
        else
            System.out.println("\nFailed");
    }
}