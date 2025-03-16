import java.util.Scanner;

public class GreaterValue {

    /**
     * Finds the greatest of three integers using the ternary operator.
     *
     * The ternary operator is a shorthand for an if-else statement. While concise, it can be less readable
     * for complex conditions.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @param num3 The third integer.
     * @return The greatest of the three integers.
     */
    public static int greater1(int num1, int num2, int num3) {
        // This line uses nested ternary operators to find the greatest number.
        // It's equivalent to the if-else logic in greater2(), but more compact.
        // Be careful using deeply nested ternary operators as they can become difficult to read.
        return (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        // BREAKDOWN of the ternary operator:
        // (num1 > num2) ?  ... : ...  // if num1 > num2, execute the first part, otherwise execute the second part
        // ((num1 > num3) ? num1 : num3) // if num1 > num2 is true, then if num1 > num3 return num1, else return num3
        // ((num2 > num3) ? num2 : num3) // if num1 > num2 is false, then if num2 > num3 return num2, else return num3
    }

    /**
     * Finds the greatest of three integers using traditional if-else statements.
     * This method is generally more readable than using nested ternary operators.
     *
     * @param num1 The first integer.
     * @param num2 The second integer.
     * @param num3 The third integer.
     * @return The greatest of the three integers.
     */
    public static int greater2(int num1, int num2, int num3) {
        // Check if num1 is greater than num2
        if (num1 > num2) {

            if (num1 > num3) {
                return num1;  // num1 is the greatest
            } 
            else {
                return num3;  // num3 is the greatest
            }
        } 
        else {
            if (num2 > num3) {
                return num2;  // num2 is the greatest
            } 
            else {
                return num3;  // num3 is the greatest
            }
        }
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

        // Print the greatest value calculated using method-1 (ternary operator)
        System.out.println("Greater value between " +num1+ ", " +num2+ " & " +num3+ " using method-1 : " +greater1(num1, num2, num3));

        // Print the greatest value calculated using method-2 (if-else statements)
        System.out.print("Greater value between " +num1+ ", " +num2+ " & " +num3+ " using method-2 : " +greater2(num1, num2, num3));
    }
}
