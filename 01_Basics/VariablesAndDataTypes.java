// This program demonstrates the use of variables, data types and constants in Java.

public class VariablesAndDataTypes {
    public static void main(String[] args) {

        // VARIABLES
        // A variable is a container (storage area) used to hold data,
        // Each variable should have a unique name (identifier).

        String name = "Akshat";  // String variable to store a name.
        int age = 20;  // Integer variable to store age.

        // Output:- "My name is Akshat and I'm 20 years old."
        System.out.println("My name is " + name + " and I'm " + age + " years old.");

        // Assigning one variable to another.
        String domain = "Full Stack Development";
        String interest = domain;  // Assigning the value of 'domain' to 'interest'.

        // Output:- "My interest as well as domain is Full Stack Development"
        System.out.println("My interest as well as domain is " + interest);


        // DATA TYPES
        // Data types defines the type and size of data that can be stored in a variable.

        /*
         * There are 2 types of data types in Java:
         * 
         * 1) Primitive Data Type : Stores simple values,
         * 2) Non-Primitive Data Type : Stores complex values.
         */

        
        // PRIMITIVE DATA TYPES (Fixed size)

        int myNum = 6;               // Integer (Whole numbers)
        float myFloatNum = 6.99f;   // Floating-point numbers
        char myLetter = 'a';       // Character (single letter)
        boolean myBool = true;    // Boolean (true/false);

        /*
         * Primitive Data Type Summary:
         * 
         * byte     ->    Stores whole numbers from -128 to 127 (1 byte),
         * short    ->    Stores whole numbers from -32,768 to 32,767 (2 bytes),
         * 
         * int      ->    Stores whole numbers from -2,147,483,648 to 2,147,483,647 (4 bytes),
         * long     ->    Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036854,775,807 (8 bytes),
         * 
         * float    ->    Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits (4 bytes),
         * double   ->    Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits (8 bytes),
         * 
         * boolean  ->    Stores true or false values (1 bit),
         * char     ->    Stores a single character/letter or ASCII values (2 byte, unicode supported).
         */


        // NON-PRIMITIVE DATA TYPE (Variable size)
        // These are more complex and often require the 'new' keyword when instantiated.

        String country = new String("India");  // String (text)

        // Array - Collection of integers.
        int nums[] = new int[] {6, 11, 13};  // Declaring an integer array of size 3.


        // CONSTANTS
        // A constant is a variable whose value cannot be changes once assigned,
        // Declared using the 'final' keyword.

        final double PI = 3.14;  // Constant value of PI


        // Example: Calculating the area of a circle
        double radius = 5;
        double area = PI * radius * radius;

        // Output:- "Area of circle with radius 5.0cm is : 78.5cm^2"
        System.out.print("\nArea of circle with radius " +radius+ "cm is : " +area+ "cm^2");
    }
}
