
package ex3;

import java.util.Scanner;

//class to convert currency
public class currency { //class name
    public static void currencyconv(){ //method name
        
        Scanner input = new Scanner(System.in);
        
        double myr;
        System.out.print("Insert Amount/Quantity : RM ");
        myr = input.nextDouble();
                
        double gbp = myr/5.71;
        System.out.printf("\nRM %.2f = %.2f GBP\n", myr, gbp);
    }
}
