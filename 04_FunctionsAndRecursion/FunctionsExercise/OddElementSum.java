import java.util.Scanner;

public class OddElementSum {

    /**
     * Calculates the sum of all odd numbers from 1 up to a given number (inclusive).
     *
     * @param num The upper limit for the range of numbers (inclusive).
     * @return The sum of all odd numbers from 1 to num.
     */
    public static int oddSum(int num) {
        int sum = 0;  // Initialize the sum to 0

        // Iterate from 1 to the given number (inclusive)
        for (int i = 1; i <= num; i++) {
            // Check if the current number (i) is odd
            if (i % 2 != 0) {
                // If the number is odd, add it to the sum
                sum += i;
            }
        }

        // Return the final sum of all odd numbers
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        // Print the sum of all odd numbers from 1 to the entered number
        System.out.print("Sum of all odd numbers from '1' to '" +num+ "' : " +oddSum(num));
    }
}
