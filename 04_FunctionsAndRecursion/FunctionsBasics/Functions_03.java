import java.util.Scanner;

public class Functions_03 {

    /**
     * Prints the multiplication table of a given number up to 10.
     *
     * @param n The number for which to print the multiplication table.
     */
    public static void printTable(int n) {
        // Iterate from 1 to 10 (inclusive) to generate the table
        for (int i = 1; i <= 10; i++) {

            // Print the current row of the table in the format "n x i = n * i"
            System.out.println(n+ " x " +i+ " = " +(n * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        sc.close();

        // Call the printTable function to print the multiplication table of the entered number
        printTable(num);
    }
}
