import java.util.Scanner; // Import Scanner class for user input

public class IfElseStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object for user input

        // ****************************************
        // IF STATEMENT (Single Condition)
        // ****************************************
        // The 'if' statement executes a block of code **only if** the condition is true.
        // If the condition is false, nothing happens.

        /*
         * Syntax:
         * if (condition) {
         *    // Code executes **only when** condition is true
         * }
         */


        int x = 18; // Declare an integer variable with value 18

        if (x > 6) { // Check if x is greater than 6
            System.out.println(x + " is greater than 6");
        }

        System.out.println("\n---------------------------------\n");


        // ****************************************
        // IF-ELSE STATEMENT (Two-way Decision)
        // ****************************************
        // The 'if-else' statement executes one block **if the condition is true**, 
        // otherwise, the **else** block is executed when the condition is false.

        /*
         * Syntax:
         * if (condition) {
         *     // Executes if condition is true
         * } else {
         *     // Executes if condition is false
         * }
         */


        int y = 7; // Declare another integer variable

        if (y > x) { // Check if y is greater than x
            System.out.println(y + " is greater than " + x);// Executes if condition is true
        } 
        else {
            System.out.println(y + " is smaller than " + x); // Executes if condition is false
        }

        System.out.println("\n---------------------------------\n");


        // ****************************************
        // IF-ELSE-IF LADDER (Multiple Conditions)
        // ****************************************
        // The 'if-else-if' ladder is used to check **multiple conditions**.
        // If one condition is **true**, its block executes, and the rest are skipped.
        // If none of the conditions are true, the **else** block executes.

        /*
         * Syntax:
         * if (condition1) {
         *     // Executes if condition1 is true
         * } else if (condition2) {
         *     // Executes if condition2 is true
         * } else {
         *     // Executes if none of the above conditions are true
         * }
         */


        if (x > 20) { // Condition 1: x is greater than 20
            System.out.println(x + " is greater than 20");
        } 
        else if (x > 15 && x < 20) { // Condition 2: x is between 15 and 20
            System.out.println(x + " is greater than 15 but smaller than 20");
        } 
        else { // Default case (if none of the above conditions are met)
            System.out.println(x + " is smaller than 15");
        }

        System.out.println("\n---------------------------------\n");


        // ****************************************
        // REAL-LIFE EXAMPLES USING IF-ELSE
        // ****************************************

        
        // EXAMPLE 1: Check if a number is EVEN or ODD
        System.out.println("Example 1: Check Even or Odd");
        System.out.print("Enter a number : ");
        int num = sc.nextInt(); // Take user input

        // A number is even if it is **divisible by 2** (i.e., remainder is 0)
        if (num % 2 == 0) {
            System.out.println(num + " is even"); // Executes if the number is even
        } 
        else {
            System.out.println(num + " is odd"); // Executes if the number is odd
        }
        
        System.out.println("\n---------------------------------\n");


        // EXAMPLE 2: Determine a person's age group
        System.out.println("Example 2: Determine Age Group");
        System.out.print("Enter your age : ");
        int age = sc.nextInt(); // Take user input

        // Check the age group based on different ranges
        if (age > 0 && age <= 4) { // Age is between 1-4
            System.out.println("You are a baby");
        } 
        else if (age >= 5 && age <= 10) { // Age is between 5-10
            System.out.println("You are a kid");
        } 
        else if (age >= 11 && age <= 18) { // Age is between 11-18
            System.out.println("You are a teenager");
        } 
        else if (age >= 19 && age <= 44) { // Age is between 19-44
            System.out.println("You are an adult");
        } 
        else if (age >= 45) { // Age is 45 or older
            System.out.println("You are a senior citizen");
        } 
        else { // If the age entered is invalid (negative numbers)
            System.out.println("INVALID INPUT: Age cannot be negative or zero");
        }

        sc.close(); // Close the scanner object to prevent resource leak
    }
}
