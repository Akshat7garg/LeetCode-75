import java.util.Scanner;

public class CalculatePower {

    /**
     * Calculates the power of a base number using the Math.pow() method.
     *
     * @param base The base number (integer).
     * @param pwr  The power to raise the base to (integer).
     * @return The result of base raised to the power of pwr (as a long).  Note the cast to `long` to prevent potential overflow with large results.
     */
    public static long power1(int base, int pwr) {
        // Use Math.pow() to calculate the power.  Math.pow() returns a double, so cast it to long.
        return (long) Math.pow(base, pwr);
    }

    /**
     * Calculates the power of a base number using a loop (iterative method).
     * This approach avoids using Math.pow()
     *
     * @param base The base number (integer).
     * @param pwr  The power to raise the base to (integer).
     * @return The result of base raised to the power of pwr (as a long).
     */
    public static long power2(int base, int pwr) {
        // Initialize the result to 1 (base^0 = 1)
        long result = 1;

        // Multiply the result by the base 'pwr' times
        for (int i = 1; i <= pwr; i++) {
            result *= base; // result = result * base;
        }

        // Return the final result
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base value : ");  // Prompt the user to enter the base value
        int base = sc.nextInt();
        System.out.print("Enter power of the base : ");  // Prompt the user to enter the power value
        int pwr = sc.nextInt();

        // Print the result calculated using method-1 (Math.pow())
        System.out.println(base+ " to the power of " +pwr+ " using method-1 : " +power1(base, pwr));

        // Print the result calculated using method-2 (iterative method)
        System.out.print(base+ " to the power of " +pwr+ " using method-2 : " +power2(base, pwr));
        sc.close();
    }
}
