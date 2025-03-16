import java.util.Scanner;

public class Functions_02 {

    /**
     * Checks if a given integer is even or odd.
     *
     * @param num The integer to check.
     * @return true if the number is even, false otherwise.
     */
    public static boolean evenOrOdd(int num) {
        // Use the modulo operator (%) to check if the number is divisible by 2
        if (num % 2 == 0) {
            // If the remainder is 0, the number is even
            return true;
        } 
        else {
            // Otherwise, the number is odd
            return false;
        }
        //ALTERNATIVE (more concise): return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        // Call the evenOrOdd function to check if the number is even
        if (evenOrOdd(number)) {
            System.out.print("Given number is 'Even'");
        } 
        else {
            System.out.print("Given number is 'Odd'");
        }

        sc.close();
    }
}