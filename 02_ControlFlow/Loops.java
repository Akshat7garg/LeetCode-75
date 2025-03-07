import java.util.Scanner; // Import Scanner class for user input

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input


        // ****************************************
        // FOR LOOP (Entry-Controlled Loop)
        // ****************************************
        // A for-loop is used when the number of iterations is known beforehand.

        // It consists of 3 parts:
        // 1. Initialization: A variable is initialized.
        // 2. Condition: The loop runs until this condition is false.
        // 3. Update: The loop variable is updated after each iteration.
        
        /*
         * Syntax:
         * for(initialization; condition; update) {
         *      // Code to execute repeatedly
         * }
         */


        System.out.println("For Loop Example (Printing numbers 1 to 5):");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        // Output: 1 2 3 4 5

        System.out.println("\n------------------------------------------\n");


        // ****************************************
        // WHILE LOOP (Entry-Controlled Loop)
        // ****************************************
        // The while loop is used when the number of iterations is **not known** beforehand.
        // The condition is checked before executing the loop body.
        
        /*
         * Syntax:
         * while(condition) {
         *      // Code to execute repeatedly
         * }
         */


        System.out.println("While Loop Example (Printing numbers 1 to 5):");

        int idx = 1;
        while (idx <= 5) {
            System.out.print(idx + " ");
            idx++;
        }
        // Output: 1 2 3 4 5

        System.out.println("\n------------------------------------------\n");


        // ****************************************
        // DO-WHILE LOOP (Exit-Controlled Loop)
        // ****************************************
        // The do-while loop ensures that the block executes **at least once**, even if the condition is false.
        // It is useful when we want to guarantee one-time execution.
        
        /*
         * Syntax:
         * do {
         *      // Code executes first
         * } while (condition);
         */


        System.out.println("Do-While Loop Example (Printing numbers 1 to 5):");

        idx = 1;
        do {
            System.out.print(idx + " ");
            idx++;
        } while (idx <= 5);
        // Output: 1 2 3 4 5

        System.out.println("\n------------------------------------------\n");


        // ****************************************
        // FOR-EACH LOOP (Enhanced for-loop)
        // ****************************************
        // The for-each loop is used for iterating over arrays and collections.
        // It simplifies iteration without using an index variable.
        
        /*
         * Syntax:
         * for(dataType variable : collection/array) {
         *      // Code executes for each element
         * }
         */

         
        System.out.println("For-Each Loop Example (Iterating through car brands):");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.print(car + " ");
        }
        // Output: Volvo BMW Ford Mazda

        System.out.println("\n------------------------------------------\n");


        // ****************************************
        // NESTED LOOPS (Loop inside another loop)
        // ****************************************
        // Nested loops are useful when working with matrices or repeated patterns.
        
        /*
         * Syntax:
         * for(initialization; condition; update) {
         *      for(initialization; condition; update) {
         *          // Code executes inside inner loop
         *      }
         * }
         */


        System.out.println("Nested Loop Example (Outer loop with inner counting 1-5):");

        for (int i = 1; i <= 3; i++) {
            System.out.print("Outer " + i + " : ");

            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        // Output:
        // Outer 1 : 1 2 3 4 5
        // Outer 2 : 1 2 3 4 5
        // Outer 3 : 1 2 3 4 5

        System.out.println("\n------------------------------------------\n");


        // ****************************************
        // REAL-LIFE EXAMPLES USING LOOPS
        // ****************************************

        // Example 1: Check if a number is PRIME
        System.out.print("Enter a number to check if prime: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is NOT a prime number");
        } 
        else {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            System.out.println(num + (isPrime ? " is a PRIME number" : " is NOT a prime number"));
        }

        System.out.println("\n------------------------------------------\n");


        // Example 2: Print all EVEN numbers up to 'n'
        System.out.print("Enter a number to print all even numbers up to: ");
        int n = sc.nextInt();
        System.out.println("Even numbers up to " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close(); // Close scanner to prevent resource leak
    }
}