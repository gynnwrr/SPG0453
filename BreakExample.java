
package breakexample;

public class BreakExample {

    public static void main(String[] args) {
        
        /*System.out.println("Numbers 1-10");
        for (int i=1; i<=10; i++){
            if(i==5){
                System.out.println("Broke out of loop at i = " +i);
                break;}//break loop when i is 5
            System.out.println(i + "\t");}*/
        
        System.out.println("Numbers 1-10");
        for (int i=1;i<=10;i++){
            if(i==5)
                continue;//skip remaining code in loop when i is 5
            System.out.println(i+"\t");}
        System.out.println("Skip printing 5");
        }
    }
    
