package loop4;

public class Loop4 {
    public static void main(String[] args) {
        int sum = 0;

        System.out.println("sum for the power of two(n^2) of integers 1-10:");
        for (int i = 1; i <= 10; i++) /*range 1 until 10*/ {
            int square = i * i;
            System.out.println(i + "^2 = " + square);
            sum += square;
        }

        System.out.println("\nSum of the power of two (n^2) of integers 1-10: " + sum);
    }
}