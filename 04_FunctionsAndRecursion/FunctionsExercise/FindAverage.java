import java.util.Scanner;

public class FindAverage {

    /**
     * Calculates the average of three integers.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @param c The third integer.
     * @return The average of the three integers (as a double).
     */
    public static double average(int a, int b, int c) {
        // Calculate the sum of the three numbers and divide by 3.0 (not 3) to ensure double precision
        // Casting (a + b + c) to double ensures the result is a double even if a, b, and c are integers.
        return (double) (a + b + c) / 3;

        // ALTERNATIVE (more readable):
        // double sum = (double) a + b + c;
        // return sum / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number : ");
        int num3 = sc.nextInt();

        sc.close();

        // Calculate the average of the three numbers
        double avg = average(num1, num2, num3);  // store the double result first

        // Format the result to two decimal places using String.format()
        String result = String.format("%.2f", avg);
        
        System.out.print("Average of " +num1+ ", " +num2+ " & " +num3+ " : " +result);
    }
}
