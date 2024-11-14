
package avgmarks;

import java.util.Scanner;

public class std1 {
    
    int mrk1, mrk2, mrk3; //global variable
    
    public void std(){ //method name
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Student 1");
        System.out.print("\nInsert mark 1: ");
        mrk1 = input.nextInt();
        
        System.out.print("Insert mark 2: ");
        mrk2 = input.nextInt();
        
        System.out.print("Insert mark 3: ");
        mrk3 = input.nextInt();
    }
    
    public double total(){
        double total = (mrk1 + mrk2 + mrk3)/3;
        
        return (total);
    }  
}
