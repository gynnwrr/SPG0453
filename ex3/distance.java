
package ex3;

import java.util.Scanner;

//distance class
public class distance { //class name
    public static void distanceconv(){ //method name
        
        Scanner input = new Scanner(System.in);
        
        double m;
        System.out.print("Insert Amount/Quantity : ");
        m = input.nextDouble();
                
        double km = m/1000;
        System.out.printf("\n%.2f M = %.2f KM\n", m, km);
    }
}
