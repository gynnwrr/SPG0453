package compoundprog;

import java.util.Scanner;

public class CompoundProg {
    
    public static void main (String[] args) {
        int a = 5;
        int b = 5;
        int c = 5;
        int d = 5;

        // Post-increment
        System.out.println("Post-increment - Increases the value of the variable by 1, "
                + "but the original value is used in the expression before the increment takes effect.");
        System.out.println("Initial value of a: " + a);
        System.out.println("Post-increment of a: " + (a++));
        System.out.println("Value of a after post-increment: " + a);

        // Pre-increment
        System.out.println("Pre-increment - Increases the value of the variable by "
                + "1 before it is used in the expression.");
        System.out.println("\nInitial value of b: " + b);
        System.out.println("Pre-increment of b: " + (++b));
        System.out.println("Value of b after pre-increment: " + b);

        // Post-decrement
        System.out.println("Post-decrement - Decreases the value of the variable"
                + "by 1, but the original value is used in the expression before the decrement takes effect."); 
        System.out.println("\nInitial value of c: " + c);
        System.out.println("Post-decrement of c: " + (c--));
        System.out.println("Value of c after post-decrement: " + c);

        // Pre-decrement
        System.out.println("Pre-decrement - decreases the value of the variable by 1"
                + " before it is used in the expression.");
        System.out.println("\nInitial value of d: " + d);
        System.out.println("Pre-decrement of d: " + (--d));
        System.out.println("Value of d after pre-decrement: " + d);
    }
}