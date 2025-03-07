import java.util.Scanner; // Import Scanner class for user input

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // ****************************************
        // SWITCH STATEMENT (Alternative to if-else)
        // ****************************************
        // The 'switch' statement allows a variable to be tested for equality against multiple values.
        // Each value is called a 'case', and the code inside the matching case is executed.

        /*
         * Syntax:
         * switch (expression) {
         *      case value1:
         *          // Code to execute if expression == value1
         *          break; // Break exits the switch after executing the case
         *      case value2:
         *          // Code to execute if expression == value2
         *          break;
         *      ...
         *      default:
         *          // Code to execute if none of the cases match
         * }
         */


        int day = 6; // Example input: day number

        // Switch case to determine the day of the week
        switch (day) {
            case 1:
                System.out.println("Day number " + day + " is Monday");
                break;
            case 2:
                System.out.println("Day number " + day + " is Tuesday");
                break;
            case 3:
                System.out.println("Day number " + day + " is Wednesday");
                break;
            case 4:
                System.out.println("Day number " + day + " is Thursday");
                break;
            case 5:
                System.out.println("Day number " + day + " is Friday");
                break;
            case 6:
                System.out.println("Day number " + day + " is Saturday");
                break;
            case 7:
                System.out.println("Day number " + day + " is Sunday");
                break;
            default:
                System.out.println("Invalid day number"); // Executes if 'day' is not 1-7
        }

        // Output : Day number 6 is Saturday

        System.out.println("\n---------------------------------\n");


        // ****************************************
        // REAL-LIFE EXAMPLE: SIMPLE CALCULATOR
        // ****************************************
        // This switch case demonstrates performing basic arithmetic operations
        

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt(); // Get first number from user
        
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt(); // Get second number from user

        // Display menu for arithmetic operations
        System.out.println("\nChoose an operation:");
        System.out.println("Enter '+' for Addition (a + b)");
        System.out.println("Enter '-' for Subtraction (a - b)");
        System.out.println("Enter '*' for Multiplication (a * b)");
        System.out.println("Enter '/' for Division (a / b)");
        System.out.println("Enter '%' for Remainder calculation (a % b)");

        System.out.print("\nEnter your choice: ");
        String ch = sc.next(); // Get the operation choice from user

        // Switch case to perform the selected operation
        switch (ch) {
            case "+":
                System.out.println("Addition (" +a+ " + " +b+ ") = " + (a + b));
                break;

            case "-":
                System.out.println("Subtraction (" +a+ " - " +b+ ") = " + (a - b));
                break;

            case "*":
                System.out.println("Multiplication (" +a+ " * " +b+ ") = " + (a * b));
                break;

            case "/":
                if (b == 0) {
                    System.out.println("Division is not possible as denominator is '0'");
                } else {
                    System.out.println("Division (" +a+ " / " +b+ ") = " + ((double) a / b));
                }
                break;

            case "%":
                if (b == 0) {
                    System.out.println("Remainder calculation is not possible as denominator is '0'");
                } else {
                    System.out.println("Remainder (" +a+ " % " +b+ ") = " + (a % b));
                }
                break;

            default:
                System.out.println("Invalid choice! Please enter a valid operator.");
        }

        sc.close(); // Close Scanner to prevent memory leaks
    }
}