import java.util.Scanner;

public class PrimeNumber {

    /**
     * Checks if a given number is a prime number.
     *
     * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
     *
     * This method optimizes the primality test by:
     * 1. Handling the case of 2 separately (as it's the only even prime number).
     * 2. Eliminating even numbers greater than 2 immediately.
     * 3. Only checking odd divisors up to the square root of the number.
     *
     * @param num The integer to check for primality.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        // 2 is the only even prime number
        if (num == 2)
            return true;
        // Even numbers greater than 2 are not prime
        else if (num % 2 == 0)
            return false;

        // Assume the number is prime initially
        boolean flag = true;

        // Iterate through odd numbers starting from 3 up to the square root of num
        // We only need to check up to the square root because if a number has a divisor greater than its square root,
        // it must also have a divisor smaller than its square root.
        for (int i = 3; i * i <= num; i += 2) {
            // If num is divisible by i, it's not prime
            if (num % i == 0) {
                // Set flag to false to indicate that num is not prime
                flag = false;
                // Exit the loop since we've found a divisor
                break;
            }
        }

        // Return the flag indicating whether the number is prime or not
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        sc.close();

        // Handle special cases:
        if (num == 1) {
            System.out.print("Given number is a co-prime number");
        }
        else if (num < 1) {
            System.out.print("Invalid input");
        }
        else if (isPrime(num)) {  // Check if the number is prime
            System.out.print("Given number is a prime number");
        }
        else {
            System.out.print("Given number is not a prime number");
        }
    }
}
