import java.util.Scanner;

public class Factorial {

    /**
     * Calculates the factorial of a given integer.
     *
     * The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
     * For example, 5! = 5 * 4 * 3 * 2 * 1 = 120.
     * By definition, 0! = 1.
     *
     * @param num The integer for which to calculate the factorial.  Should be non-negative.
     * @return The factorial of the given number (as a long). Returns 1 if the input is 0 or 1.
     */
    public static long fact(int num) {
        // Base case: if the number is 0 or 1, the factorial is 1
        if (num == 0 || num == 1)
            return 1;

        long ans = 1;  // Initialize the result (factorial) to 1

        // Iterate from 2 to the given number (inclusive)
        for (int i = 2; i <= num; i++) {
            // Multiply the current result by the current number in the iteration
            ans *= i;
        }

        // Return the final factorial result
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        // Print the factorial of the entered number
        System.out.print("Factorial of " +num+ " : " +fact(num));
        sc.close();
    }
}
