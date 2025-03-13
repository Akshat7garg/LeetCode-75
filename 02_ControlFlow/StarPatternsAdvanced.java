/**
 * This Java program demonstrates advanced star patterns using nested loops.
 * It prints various complex patterns involving symmetry, numbers, and spacing.
 * 
 * The patterns include:
 * 
 * 1. Butterfly pattern
 * 2. Palindromic number pyramid
 * 3. Diamond star pattern
 * 4. Hollow butterfly pattern
 * 5. Hollow diamond pattern
 * 6. Hollow pyramid pattern
 * 7. Hollow inverted diamond pattern
 */

public class StarPatternsAdvanced {
    public static void main(String[] args) {
        int row = 5;  // Number of rows (also columns in most cases)
        
        // 1. Butterfly pattern
        /*
         *  *                 *
         *  * *             * * 
         *  * * *         * * * 
         *  * * * *     * * * * 
         *  * * * * * * * * * * 
         *  * * * * * * * * * * 
         *  * * * *     * * * * 
         *  * * *         * * * 
         *  * *             * * 
         *  *                 *
         */
        System.out.println("1. Butterfly pattern\n");

        // Upper part of the butterfly
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 2. Palindromic number pyramid
        /*
         *          1 
         *        2 1 2 
         *      3 2 1 2 3 
         *    4 3 2 1 2 3 4 
         *  5 4 3 2 1 2 3 4 5 
         */
        System.out.println("2. Palindromic number pyramid\n");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j+ " ");
            }
            
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 3. Diamond star pattern
        /*
         *            * 
         *          * * * 
         *        * * * * * 
         *      * * * * * * * 
         *    * * * * * * * * * 
         *  * * * * * * * * * * *
         *    * * * * * * * * * 
         *      * * * * * * * 
         *        * * * * * 
         *          * * * 
         *            * 
         */
        System.out.println("3. Diamond star pattern\n");
         
        // Upper part of the diamond
        for (int i = 1; i <= row + 1; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
         
        // Lower part of the diamond
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");

        
        // 4. Hollow butterfly pattern
        /*
         *  *                 *
         *  * *             * * 
         *  *   *         *   * 
         *  *     *     *     * 
         *  *       * *       * 
         *  *       * *       * 
         *  *     *     *     * 
         *  *   *         *   * 
         *  * *             * * 
         *  *                 *
         */
        System.out.println("4. Hollow butterfly pattern\n");

        // Upper part of the hollow butterfly
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower part of the hollow butterfly
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print("  ");
            }
            
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 5. Hollow diamond pattern
        /*
         *            * 
         *          *   * 
         *        *       * 
         *      *           * 
         *    *               * 
         *  *                   * 
         *    *               * 
         *      *           * 
         *        *       * 
         *          *   * 
         *            * 
         */
        System.out.println("5. Hollow diamond pattern\n");
         
        // Upper part of the hollow diamond
        for (int i = 1; i <= row + 1; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j == 1 || j == (2 * i) - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
         
        // Lower part of the hollow diamond
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (j == 1 || j == (2 * i) - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");


        // 6. Hollow pyramid pattern
        /*
         *          * * * * *
         *        *       *
         *      *       *
         *    *       *
         *  * * * * *
         */
        System.out.println("6. Hollow pyramid pattern\n");

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= row; j++) {
                if (i == 1 || j == 1 || i == row || j == row) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        
        System.out.println("\n---------------------------------\n");
        

        // 7. Hollow inverted diamond pattern
        /*
         *  * * * * * * * * * 
         *    *           *  
         *      *       *  
         *        *   *  
         *          * 
         *        *   * 
         *      *       * 
         *    *           * 
         *  * * * * * * * * * 
         */
        System.out.println("7. Hollow inverted diamond pattern\n");

        // Upper part of the hollow inverted diamond
        for (int i = row; i >= 1; i--) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (i == row || j == 1 || j == (2 * i) - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Lower part of the hollow inverted diamond
        for (int i=2; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                if (i == row || j == 1 || j == (2 * i) - 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
