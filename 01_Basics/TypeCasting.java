// Implement type casting in Java (implicit & explicit conversions) with example

public class TypeCasting {
    public static void main(String[] args) {

        // ***********************************
        // TYPE CASTING IN JAVA
        // ***********************************
        // Type casting is the process of converting a variable from one data type to another.

        /*
         * In Java, there are two main types of casting:
         * 
         * 1) Implicit (Widening) casting - Done automatically by Java,
         * 2)Explicit (Narrowing) casting - Done manually by the programmer.
         */


        // ***********************************************
        // IMPLICIT (WIDENING) CASTING (Automatic)
        // ***********************************************
        // When we assign a smaller data type value to a larger data type, Java automatically converts it without data loss.

        /*
         * Conversion happens in the following order:
         * byte -> short -> char -> int -> long -> float -> double
         */

        int myInt = 6;  // Integer (smaller)
        double myDouble = myInt;  // Automatically converted to double (larger)

        System.out.println("Integer : " +myInt);  // Output:- "Integer : 6"
        System.out.println("Double (converted) : " +myDouble);  // Output:- "Double (converted) : 6.0"


        // ***********************************************
        //  EXPLICIT (NARROWING) CASTING (Manual)
        // ***********************************************
        // When we assign larger data type value to a smaller data type, we need to perform manual type casting, and there me be **data loss**.
        
        /*
         * Conversion happens in the following order:
         * double -> float -> long -> int -> char -> short -> byte
         */

        double num1 = 3.88d;  // Double (larger)
        int num2 = (int) num1;  // Manually converted to int (smaller), decimal part is lost

        System.out.println("Double : " +num1);  // Output:- "Double : 3.88"
        System.out.println("Integer (converted) : " +num2);  // Output:- "Integer (converted) : 3"


        // ***********************************************
        // REAL-LIFE EXAMPLE: calculating Percentage
        // ***********************************************
        // In the real-world application, type casting is useful in mathematical calculation.
        // Example: Converting integer division into floating-point division to get accurate percentage.

        int maxScore = 500;
        int userScore = 423;

        // Without type casting: Integer division will round off the result
        int percentage1 = userScore / maxScore * 100;
        System.out.println("User's percentage (without casting) is " +percentage1);  // Output:- "User's percentage (without casting) is 0"
        // Here, decimal part 846 lost before multiplication with 100.

        // With type casting: Converting int to float for accurate division
        float percentage2 = (float) userScore / maxScore * 100.0f;
        System.out.println("User's percentage (with casting) is " +percentage2);  // Output:- "User's percentage (with casting) is 84.6"

        // Best Practice: Always use type casting when performing division with integer to avoid incorrect results.
    }
}