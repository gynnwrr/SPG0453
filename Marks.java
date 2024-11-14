package marks;

import java.util.Scanner;

public class Marks{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int marks;
        System.out.println("Enter the marks: ");
        marks = input.nextInt();
        input.close();
        
        if(marks>100) //to make sure the full mark is only 100
            System.out.println("Invalid marks.");
        
        else if(marks>=80)
            System.out.println("Grade: A");
        
        else if(marks>=70)
            System.out.println("Grade: B");
        
        else if(marks>=60)
            System.out.println("Grade: C");
        
        else if(marks>=50)
            System.out.println("Grade: D");
        
        else if(marks>=40)
            System.out.println("Grade: E");
        
        else if(marks<0) //to make sure the lowest mark is only 0
            System.out.println("Invalid marks.");
        
        else //marks that below 40
            System.out.println("Failed!!!");
    }
}