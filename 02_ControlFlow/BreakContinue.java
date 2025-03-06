public class BreakContinue {
    public static void main(String[] args) {
        
        // ****************************************
        // BREAK STATEMENT
        // ****************************************
        // The 'break' statement is used to **exit** a loop prematurely.
        // When 'break' is encountered, the loop terminates immediately, and execution moves to the next statement after the loop.
        
        /*
         * Syntax:
         * for (initialization; condition; update) {
         *     if (condition_to_break) {
         *         break; // Exits the loop immediately
         *     }
         *     // Other statements
         * }
         */

        
        System.out.println("Demonstration of 'break' statement:");

        for (int i = 1; i <= 10; i++) {
            if (i == 4) { // When i reaches 4, exit the loop
                break;
            }
            System.out.print(i + " "); // Prints numbers before break condition
        }

        System.out.println("\nLoop exited when i = 4");
        // Output: 1 2 3
        
        System.out.println("\n------------------------------------------\n");

        
        // ****************************************
        // CONTINUE STATEMENT
        // ****************************************
        // The 'continue' statement **skips the current iteration** and moves to the next iteration of the loop.
        // It does not terminate the loop, but rather skips the remaining code for that iteration.
        
        /*
         * Syntax:
         * for (initialization; condition; update) {
         *     if (condition_to_skip) {
         *         continue; // Skips remaining code and moves to the next iteration
         *     }
         *     // Other statements
         * }
         */

        
        System.out.println("Demonstration of 'continue' statement:");

        for (int i = 1; i <= 10; i++) {
            if (i == 6) { // When i is 6, skip printing and move to next iteration
                continue;
            }
            System.out.print(i + " "); // Prints numbers except 6
        }

        System.out.println("\nNumber 6 was skipped using continue statement");
        // Output: 1 2 3 4 5 7 8 9 10
    }
}
