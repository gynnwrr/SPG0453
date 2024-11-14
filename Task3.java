package task3;

import java.util.Scanner;

public class Task3 {
    
    public static void main (String[] args) {
        
        int year, birth, age;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your birth year: ");
        birth = input.nextInt();
        
        System.out.println("Enter the year now: ");
        year = input.nextInt();
        input.close();
        
        age=year-birth;
        System.out.println("Your age: "+age);
    }}
