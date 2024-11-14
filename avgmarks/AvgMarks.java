
package avgmarks;

public class AvgMarks {

    public static void main(String[] args) {
        
        //create object - each class should have object
        std1 student1 = new std1(); //syntax: classsName object = new className()
        std2 student2 = new std2();
        std3 student3 = new std3();
        
        //user input for marks
        student1.std(); //std method
        student2.std();
        student3.std();
        
        //display average marks for all 3 students
        System.out.printf("\nAverage Marks for Student1: %.2f%%\n", student1.total()); //total method
        System.out.printf("Average Marks for Student2: %.2f%%\n", student2.total());
        System.out.printf("Average Marks for Student3: %.2f%%\n", student3.total());
        
        //display highest average mark
        double highestavg = Math.max(student1.total(), Math.max(student2.total(), student3.total()));
        
        System.out.println("\nHighest Average Marks: " + highestavg + "%");
    }
    
}
