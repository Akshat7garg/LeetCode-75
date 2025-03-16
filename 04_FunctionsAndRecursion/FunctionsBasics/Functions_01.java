public class Functions_01 {

    /**
     * Calculates the product of two integer numbers.
     *
     * @param num1 The first integer number.
     * @param num2 The second integer number.
     * @return The product of num1 and num2.
     */
    public static int product(int num1, int num2) {
        // Return the product of the two input numbers
        return (num1 * num2);
    }

    public static void main(String[] args) {
        // Declare and initialize two integer variables
        int num1 = 20;
        int num2 = 12;

        // Call the product method to calculate the product of num1 and num2
        int result = product(num1, num2);
        System.out.print("Product of " +num1+ " and " +num2+ " : " +result);
    }
}