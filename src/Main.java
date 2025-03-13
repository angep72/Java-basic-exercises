import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for number of rows for the pyramid and triangles
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();





        // Print the Right-Angled Star Triangle (Right-aligned)
        System.out.println("\nRight-Angled Star Triangle (Right-aligned):");
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
