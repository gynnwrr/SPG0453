package task4;

import java.util.Scanner;

public class Task4 {
    
    public static void main (String[] args) {
        
        String name, id, sub;
        int t1, t2;
        float avg;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        name = input.nextLine();
        
        System.out.println("Enter your ID: ");
        id = input.nextLine();
        
        System.out.println("Enter your subject: ");
        sub = input.nextLine();
        
        System.out.println("Enter your marks for Test 1 (/100): ");
        t1 = input.nextInt();
        
        System.out.println("Enter your marks for Test 2 (/100): ");
        t2 = input.nextInt();
        input.close();
        
        avg= (t1+t2)/2;
                
        System.out.println("\nName: "+name);
        System.out.println("ID: "+id);
        System.out.println("Subject: "+sub);
        System.out.println("Average Mark: "+avg);
    }}
