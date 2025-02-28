// Importing the Scanner class for user input.
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        // Creating a Scanner object to take input from the user.
        Scanner sc = new Scanner(System.in);

        
        // INPUT SYSTEM IN JAVA
        /*
         * Java provides multiple ways to take user input:
         * 
         * 1) Scanner class (java.util.Scanner) - Simple and commonly used for console input,
         * 2) BufferedReader class (java.io.BufferedReader) - Efficient for large input data,
         * 
         * 3) Console class (java.io.Console) - Used in secure environments,
         * 4) Command line arguments - Pass values when running the program.
         * 
         * Here, we are using Scanner class.
         */


        // Taking a single-word input (like a name).
        System.out.print("Enter you name : ");
        String name = sc.next();  // Reads only one word (stops at space).

        // Taking an integer input (like age).
        System.out.print("Enter your age : ");
        int age = sc.nextInt();  // Reads an integer value.

        // Handling a common issue: When we use nextInt(), it does not consume the newline character,
        // So, we add an extra nextLine() to "clear" it before taking a full line input.
        sc.nextLine();

        // Taking a full sentence input (like hobbies).
        System.out.print("Enter you hobbies in one line : ");
        String desc = sc.nextLine();  // Reads the whole line, including spaces.


        // OUTPUT SYSTEM IN JAVA
        /*
         * Java provides multiple ways to display output:
         * 
         * 1) System.out.print() - Prints output without a new line,
         * 2) System.out.println() - Prints output ans moves to a new line,
         * 3) System.out.printf() - Allows formatted output (similar to C/C++).
         * 
         * Here, we are using System.out.print() for inline output.
         */


        // Displaying user input with formatted output.
        System.out.print("Your name is '" +name+ "', you are '" +age+ "' years old and you hobby is '" +desc+ "'");

        // Closing the Scanner object to prevent resource leaks.
        sc.close();
    }
}
