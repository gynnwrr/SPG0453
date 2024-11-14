package loop1;

public class Loop1 { //4 types of loop

    public static void main(String[] args) {
        
        //while - satu satu display
        /*int count=10; //start from 10
        System.out.println("Printing Numbers from 10 to 0");
        while (count>=0){ //loop condition
            System.out.println(count--); //output statement
        }*/
        
        /*int count=0; //start from 0
        System.out.println("Printing Numbers from 0 to 10");
        while (count<=10){ //loop condition
            System.out.println(count++); //output statement
        }*/
        
        //DoWhile
        /*int count=1;
        System.out.println("Printing Numbers from 1 to 10");
        do{
            System.out.println(count++);} //loop body
        while(count<=10); //loop condition*/
        
        /*int count=10;
        System.out.println("Printing Numbers from 10 to 0");
        do{
            System.out.println(count--);} //loop body
        while(count>=0); //loop condition*/
        
        //For - sekali gus display
        /*System.out.println("Printitng Numbers from 11 to 50");
        for (int count=11; count<=50; count++){
            System.out.println(count);
        }*/
        
        //For in a While
        System.out.println("Printing Numbers from 1 to 10");
        int count=1;
        while (count<=10){
            System.out.println(count);
            count++;
        }
    }
}
