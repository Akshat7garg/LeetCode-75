import java.util.Scanner;

public class GreatestCommonDivisor {

    /**
     * Calculates the Greatest Common Divisor (GCD) of two integers using the subtraction method.
     * This method repeatedly subtracts the smaller number from the larger number until both numbers are equal.
     * The final equal number is the GCD.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The Greatest Common Divisor of 'a' and 'b'.
     */
    public static int GCD1(int a, int b) {
        // Continue looping as long as 'a' and 'b' are not equal
        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        // When the loop finishes, 'a' and 'b' are equal, and their value is the GCD
        return a;
    }

    /**
     * Calculates the Greatest Common Divisor (GCD) of two integers using Euclid's algorithm (the modulo operator method).
     * This method is generally more efficient than the subtraction method, especially for larger numbers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The Greatest Common Divisor of 'a' and 'b'.
     */
    public static int GCD2(int a, int b) {
        // Continue looping as long as 'b' is not zero
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // When the loop finishes, 'b' is zero, and 'a' contains the GCD
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        // Print the GCD calculated using method-1 (subtraction method)
        System.out.println("Greatest Common Divisor of " +num1+ " & " +num2+ " using method-1 : " +GCD1(num1, num2));

        // Print the GCD calculated using method-2 (Euclid's algorithm - modulo operator)
        System.out.print("Greatest Common Divisor of " +num1+ " & " +num2+ " using method-2 : " +GCD2(num1, num2));

        sc.close();
    }
}
