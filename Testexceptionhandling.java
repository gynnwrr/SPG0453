
package testexceptionhandling;

public class Testexceptionhandling {

    public static void main(String[] args) {
        
        int y=0, x=4;
        
        try{
            int z=x/y;
            System.out.println("after division\n");
            System.out.println("x = " +x + " and y = " +y);
            System.out.println("x/y = " +z);
        }
        
        catch(ArithmeticException ae){
            System.out.println("attempt to divide by 0");
        }
        System.out.println("\nafter catch");
    }
    
}
