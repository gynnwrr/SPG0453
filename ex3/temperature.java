
package ex3;

import java.util.Scanner;

public class temperature { //class name
    public static void temperatureconv(){ //method name
        
        Scanner input = new Scanner(System.in);
        
        double c;
        System.out.print("Insert Amount/Quantity : ");
        c = input.nextDouble();
                
        double f = (c*9/5)+32;
        System.out.printf("\n%.2f Celcius = %.2f Fahrenheit\n", c, f);
    }
}
