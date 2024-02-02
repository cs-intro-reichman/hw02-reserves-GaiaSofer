/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        // Iterate through square rows
        for (int i = 0; i < n; i++) {
            // Iterate through each row element
            for (int j = 0; j < n * 2; j++) {
                // Check if it's an even column to print '*'
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    // Print a space for odd columns
                    System.out.print(" ");
                }
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}