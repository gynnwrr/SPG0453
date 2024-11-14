package ex3;

import java.util.Scanner;

public class Convertor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int menu;
        System.out.println("Converter available :");
        System.out.println("1. Currency (MYR to GBP)");
        System.out.println("2. Distance (M to KM)");
        System.out.println("3. Temperature (Celcius  to Fahrenheit)");
        System.out.print("Choose your converter : ");
        menu = input.nextInt();
        
        switch(menu){
            case 1: //currency
                currency.currencyconv(); //className.methodName()
                break;
                
            case 2: //distance    
                distance.distanceconv(); //className.methodName()
                break;
                
            case 3: //temperature  
                temperature.temperatureconv(); //className.methodName()
                break;   
                
            default: System.out.println("Invalid option"); break;
        }
        
        input.close();
    }
    
}
