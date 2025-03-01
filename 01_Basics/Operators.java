/*
 * Operators in Java
 * -----------------
 * This program demonstrates different types of operators in Java, including:
 * 
 * 1) Arithmetic Operators: Perform basic mathematical operations.
 * 2) Increment & Decrement Operators: Increase or Decrease value.
 * 3) Relational (Comparison) Operator: Compare two values.
 * 4) Logical Operators: Perform logical operations.
 * 5) Assignment Operators: Assign and modify values.
 * 
 * Each section contains examples to illustrate the use of these operators in Java.
 */

public class Operators {
    public static void main(String[] args) {

        // ****************************************
        // ARITHMETIC OPERATORS
        // ****************************************
        // These operators perform basic mathematical operations.

        int num1 = 12, num2 = 5;

        System.out.println("Arithmetic Operators: \n");

        // Addition (+) -> Adds two numbers
        System.out.println("Addition: " + (num1 + num2)); // 12 + 5 = 17

        // Subtraction (-) -> Subtracts two numbers
        System.out.println("Subtraction: " + (num1 - num2)); // 12 - 5 = 7

        // Multiplication (*) -> Multiply two numbers
        System.out.println("Multiplication: " + (num1 * num2)); // 12 * 5 = 60

        // Division (/) -> Divides the first number by the second
        System.out.println("Division: " + (float) num1 / num2); // 12 / 5 = 2.4

        // Modulus (%) -> Returns the remainder of the division
        System.out.println("Modulus: " + (num1 % num2)); // 12 % 5 = 2
        System.out.println("\n----------------------------------\n");


        // ****************************************
        // INCREMENT AND DECREMENT OPERATORS
        // ****************************************
        // These operators increase or decrease a value by 1.

        int a = 5;

        System.out.println("Increment & Decrement Operators: \n");

        // Post-Increment (a++) -> Returns the value first, then increments
        System.out.println("Post-Increment: " + (a++)); // Output: 5
        System.out.println("After Post-Increment: " + a); // Output: 6

        // Pre-Increment (++a) -> Increments first, then returns the value
        System.out.println("Pre-Increment: " + (++a)); // Output: 7

        // Post-Decrement (a--) -> Returns the value first, then decrements
        System.out.println("Post-Decrement: " + (a--)); // Output: 7
        System.out.println("After Post-Decrement: " + a); // Output: 6

        // Pre-Decrement (--a) -> Decrements first, then returns the value
        System.out.println("Pre-Decrement: " + (--a)); // Output: 5
        System.out.println("\n----------------------------------\n");


        // ****************************************
        // 3. RELATIONAL (COMPARISON) OPERATORS
        // ****************************************
        // These operators compare values and return true or false.

        int x = 10, y = 20;

        System.out.println("Relational (Comparison) Operator: \n");

        // Equal to (==) -> Returns true if both values are equal
        System.out.println("x == y: " + (x == y)); // false

        // Not equal to (!=) -> Returns true if values are different
        System.out.println("x != y: " + (x != y)); // true

        // Greater than (>) -> Returns true if left value is greater
        System.out.println("x > y: " + (x > y)); // false

        // Less than (<) -> Returns true if left value is smaller
        System.out.println("x < y: " + (x < y)); // true

        // Greater than or equal to (>=)
        System.out.println("x >= y: " + (x >= y)); // false

        // Less than or equal to (<=)
        System.out.println("x <= y: " + (x <= y)); // true
        System.out.println("\n----------------------------------\n");


        // ****************************************
        // 4. LOGICAL OPERATORS
        // ****************************************
        // These operators are used for decision-making and combining conditions.

        boolean bool1 = true, bool2 = false;

        System.out.println("Logical Operator: \n");

        // Logical AND (&&) -> Returns true if both conditions are true
        System.out.println("bool1 AND bool2: " + (bool1 && bool2)); // false

        // Logical OR (||) -> Returns true if at least one condition is true
        System.out.println("bool1 OR bool2: " + (bool1 || bool2)); // true

        // Logical NOT (!) -> Reverses the boolean value
        System.out.println("NOT bool1: " + (!bool1)); // false
        System.out.println("\n----------------------------------\n");


        // ****************************************
        // 6. ASSIGNMENT OPERATORS
        // ****************************************
        // These operators assign values to variables.

        int value = 10;
        
        System.out.println("Assignment Operator: ");
        System.out.println("Initial value: " + value); // 10

        // += (Addition Assignment) -> Adds and assigns the value
        value += 5;  // value = value + 5
        System.out.println("After += : " + value); // 15

        // -= (Subtraction Assignment) -> Subtracts and assigns the value
        value -= 3;  // value = value - 3
        System.out.println("After -= : " + value); // 12

        // *= (Multiplication Assignment) -> Multiplies and assigns the value
        value *= 2;  // value = value * 2
        System.out.println("After *= : " + value);// 24

        // /= (Division Assignment) -> Divides and assigns the value
        value /= 4;  // value = value / 4
        System.out.println("After /= : " + value); // 6

        // %= (Modulus Assignment) -> Assigns the remainder of division
        value %= 5;  // value = value % 5
        System.out.println("After %= : " + value); // 1
    }
}
