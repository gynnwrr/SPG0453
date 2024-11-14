package task.pkg5;

import java.util.Scanner;

public class Task5 {
    
    public static void main (String[] args) {
        
        String name;
        int rm, qt, discr;
        double trm;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your item name: ");
        name = input.nextLine();
        
        System.out.println("Enter the price: ");
        rm = input.nextInt();
        
        System.out.println("Enter the quantity: ");
        qt = input.nextInt();
        trm = rm * qt;
        
        int menu;
        System.out.println("\nChoose the discount rate: ");
        System.out.println("[1] RED = 25"+"%");
        System.out.println("[2] BLUE = 50"+"%");
        System.out.println("[3] BLACK = 75"+"%");
        menu = input.nextInt();
        input.close();
        
        switch(menu){
            case 1: //red
                System.out.println("\nItem Name: " + name);
                System.out.println("Price: RM " + rm);
                System.out.println("Quantity: " + qt);
                System.out.println("Total Price: RM " + trm);
                System.out.println("Discount Rate: 25"+"%");
                double red = trm -(0.25*trm);
                System.out.println("Price After Discount: RM " +red);
                break;
                
            case 2: //blue
                System.out.println("\nItem Name: " + name);
                System.out.println("Price: RM " + rm);
                System.out.println("Quantity: " + qt);
                System.out.println("Total Price: RM " + trm);
                System.out.println("Discount Rate: 50"+"%");
                double blue = trm -(0.50*trm);
                System.out.println("Price After Discount: RM " +blue);
                break;
                
            case 3: //black
                System.out.println("\nItem Name: " + name);
                System.out.println("Price: RM " + rm);
                System.out.println("Quantity: " + qt);
                System.out.println("Total Price: RM " + trm);
                System.out.println("Discount Rate: 70"+"%");
                double black = trm -(0.75*trm);
                System.out.println("Price After Discount: RM " +black);
                break;
                
            default: System.out.println("Invalid option"); break;
        }
    }}
