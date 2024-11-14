//ain nur aida
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input your first name: ");
        String fname = input.nextLine();
        
        System.out.print("Input your last name: ");
        String lname = input.nextLine();
        input.close();
        
        System.out.println();
        System.out.println("\nHello\n" +fname +" "+lname);
    }
    
}
