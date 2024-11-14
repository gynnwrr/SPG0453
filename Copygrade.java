
package copygrade;

import java.util.Scanner; //to use Scanner
import javax.swing.JOptionPane; //to use JOptionPane

public class Copygrade {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in); //read: an object for Scanner to get user input
        int program = 1; //to decide whether the program will continue or not; 1-continue, 2-exit
        
        do{
            System.out.print("\nTotal number of students: "); //instruction for instructor enter total number of students
            int num = read.nextInt(); //nextInt for int data type
        
            //initialize numbers of students for each grade
            int gA=0, gB=0, gC=0, gD=0, gF=0;
        
            //initialize numbers of students passed and fail
            int pass=0, fail=0;
        
            //insert marks
            for (int i = 0; i < num; i++) { //initialize i to 0, loop 'insert mark' section until total number of students reached (num) 
            
                System.out.print("\nStudent " + (i + 1) + " Marks: "); //for instructor insert student marks
                int markah = read.nextInt();
            
                //grades category
                if (markah >= 85) {
                    gA++; //grade A; increase number for student who got A by 1
                    pass++; //increase number for student who passed by 1
                
                } else if (markah >= 70) {
                    gB++; //grade B; increase number for student who got B by 1
                    pass++; //increase number for student who passed by 1
                
                } else if (markah>= 60) {
                    gC++; //grade C; increase number for student who got C by 1
                    pass++; //increase number for student who passed by 1
                
                } else if (markah >= 50) {
                    gD++; //grade D; increase number for student who got D by 1
                    pass++; //increase number for student who passed by 1
                    
                } else {
                    gF++; //grade F; increase number for student who got F by 1
                    fail++; //increase number for student who failed by 1
                }
            }
        
            StringBuilder result = new StringBuilder(); //to construct entire message; 'result' is an object for StringBuilder()
        
            //to know total number of students for each grade
            result.append("Total number of students who get:\n"); //append(): to add data to current content instead of create new StringBuilder
            result.append("Grade A (>=85): " + gA + "\n");
            result.append("Grade B (>=70): " + gB + "\n");
            result.append("Grade C (>=60): " + gC + "\n");
            result.append("Grade D (>=50): " + gD + "\n");
            result.append("Grade F (<50): " + gF + "\n");
        
            //to know total number of students who passed and failed
            result.append("\nTotal number of students who\n");
            result.append("Passed (>50): " + pass + "\n");
            result.append("Failed (<50): " + fail + "\n");

            // to check if the instructor gets a bonus
            if (pass > fail) {
                result.append("\nBonus to the instructor !!");
            
            } else /*fail>pass*/ {
                result.append("\nNo bonus to the instructor :((");
            }

            // display the result using JOption Pane
            JOptionPane.showMessageDialog(null, result.toString(), "Final Result", JOptionPane.INFORMATION_MESSAGE);
            //showMessageDialog to display the message in a dialog box
            //toString(): method to convert StringBuilder into string
            //INFORMATION_MESSAGE to indicate that it is an information message
            
            System.out.println("\nDo you want to continue?\n [1] Yes\n [2] No");
            int cont = read.nextInt(); //to read user input if they to exit or not
            
            if(cont !=1){
                program = 0; //the system will continue looping until user want to exit
            
            }
        } while(program == 1);
        System.out.println("\nThe system has ended."); //if user choose 1, the system ends
    }
    
}