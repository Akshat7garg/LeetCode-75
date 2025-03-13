/*
 * This Java program demonstrates various star and number patterns using nested loops.
 * It covers common patterns like squares, triangles, pyramids, and numeric sequences to illustrate the use of loops in Java for beginners.
 */

public class StarPatternsBasics {
    public static void main(String[] args) {
        int row = 5;  // Number of rows (also columns in most cases)

        // 1. Solid Square Pattern
        // This pattern prints a full square of '*' characters.
        /*
         *  * * * * *
         *  * * * * *
         *  * * * * *
         *  * * * * *
         *  * * * * *
         */
        System.out.println("1. Solid Square Pattern\n");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 2. Hollow Square Pattern
        // This pattern prints a square with only the border filled with '*'.
        /*
         *  * * * * *
         *  *       *
         *  *       *
         *  *       *
         *  * * * * *
         */
        System.out.println("2. Hollow Square Pattern\n");
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if (i == 1 || i == row || j == 1 || j == row) {
                    System.out.print("* ");
                } 
                else {
                    System.out.print("  "); // Prints space for the hollow area
                }
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 3. Right-Angled Triangle Pattern
        // Prints a triangle with a right angle at the bottom-left.
        /*
         *  *
         *  * *
         *  * * *
         *  * * * *
         *  * * * * *
         */
        System.out.println("3. Right-Angled Triangle Pattern\n");
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 4. Inverted Right-Angled Triangle
        // Prints a right-angled triangle inverted.
        /*
         *  * * * * *
         *  * * * *
         *  * * *
         *  * *
         *  *
         */
        System.out.println("4. Inverted Right-Angled Triangle\n");
        
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 5. Left-Aligned Pyramid
        // Prints a pyramid pattern aligned to the left.
        /*
         *          *
         *        * *
         *      * * *
         *    * * * *
         *  * * * * *
         */
        System.out.println("5. Left-Aligned Pyramid\n");
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  "); // Print spaces for alignment
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        

        System.out.println("\n---------------------------------\n");


        // 6. Number Pyramid
        // Prints a number pyramid where each row contains numbers increasing sequentially.
        /*
         *  1
         *  1 2
         *  1 2 3
         *  1 2 3 4
         *  1 2 3 4 5
         */
        System.out.println("6. Number Pyramid\n");
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 7. Inverted Number Pyramid
        // Prints an inverted number pyramid where numbers decrease per row.
        /*
         *  1 2 3 4 5
         *  1 2 3 4
         *  1 2 3
         *  1 2
         *  1
         */
        System.out.println("7. Inverted Number Pyramid\n");
        
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 8. Continuous Number Pyramid
        // Prints a pyramid with continuous incrementing numbers.
        /*
         *  1
         *  2 3
         *  4 5 6
         *  7 8 9 10
         *  11 12 13 14 15
         */
        System.out.println("8. Continuous Number Pyramid\n");
        
        int num = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 9. Binary Pyramid Pattern
        // Prints a pyramid with alternating 1s and 0s.
        /*
         *  1
         *  0 1
         *  1 0 1
         *  0 1 0 1
         *  1 0 1 0 1
         */
        System.out.println("9. Binary Pyramid Pattern\n");
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(((i + j) % 2 == 0 ? "1 " : "0 "));
            }
            System.out.println();
        }
    }
}
