import java.util.Scanner;

public class FibonacciSeries {

    /**
     * Generates and prints the Fibonacci series up to the given number of terms.
     *
     * The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones,
     * starting from 0 and 1.
     * Example: 0, 1, 1, 2, 3, 5, 8, 13, ...
     *
     * @param n The number of terms to generate in the Fibonacci series.
     */
    public static void fibonacci(int n) {
        // Initialize the first two terms of the series
        int a = 0; // First term
        int b = 1; // Second term

        // Handle special cases where n is 0 or 1
        if (n == 0 || n == 1) {
            // If n is 0 or 1, print the first term (0) and return.
            System.out.print(a);
            return;
        } 
        else {
            // If n is 2 or greater, print the first two terms (0 and 1)
            System.out.print(a + " " + b);

            // If n is exactly 2, we've printed the whole series so return
            if (n == 2) return;
        }

        // Initialize a counter to keep track of how many terms we've printed
        int count = 2; // We've already printed the first two terms

        // Generate the remaining terms of the series
        while (count < n) {
            // Calculate the next term by summing the previous two terms
            int c = a + b;
            System.out.print(" " +c);

            // Update a and b to prepare for the next iteration
            a = b;
            b = c;
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the fibonacci series : ");
        int size = sc.nextInt();
        
        // Call the fibonacci() method to generate and print the series
        fibonacci(size);
        sc.close();
    }
}
