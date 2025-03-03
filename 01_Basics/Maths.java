// Implement Maths.java, demonstrating Math class functions (max, min, sqrt, abs, random, pow, etc.)

public class Maths {
    public static void main(String[] args) {

        // ****************************************
        // MATH OPERATIONS IN JAVA (Math class)
        // ****************************************

        /*
         * Java provides the Math class, which contains useful mathematical functions.
         * These functions can perform calculations like min/max values, power, square root, absolute values, etc.
         */
        
        //  Finding the Maximum value
        int maximum = Math.max(5, 10);  // Returns the larger number between 5 and 10
        System.out.println("Maximum : " +maximum);  // Output:- "10"

        //  Finding the Minimum value
        int minimum = Math.min(3, -3);  // Returns the smaller number between 3 and -3
        System.out.println("Minimum : " +minimum);  // Output:- "-3"

        // Calculating the Square Root
        double squareRoot = Math.sqrt(16);  // Returns the square root of 16
        System.out.println("Square Root : " +squareRoot);  // Output:- "4.0"

        // Getting the Absolute Value (Positive value)
        int positive = Math.abs(-56);  // Converts -56 to positive (absolute value)
        System.out.println("Absolute Value : " +positive);  // Output:- "56"

        // Generating a Random Number (Between 0 to 100)
        int random = (int) (Math.random() * 101);
        // Math.random() generates a decimal value between 0.0 to 1.0
        // Multiplying by 101 scales it to the range [0, 100], and (int) converts it to an integer
        System.out.println("Random number : " +random);

        // Calculating Power (Exponentiation)
        int power = (int)Math.pow(2, 10);  // Raise 2 to the power of 10 (2^10)
        System.out.println("2 with power 10 : " +power);  // Output:- "1024"

        // Math class contains many other useful methods for mathematical operations.
        // Reference: https://www.w3schools.com/java/java_ref_math.asp
    }
}
