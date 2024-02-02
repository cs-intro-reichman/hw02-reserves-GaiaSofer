/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
    public static void main(String[] args) {
        // Extract the input number from the command line arguments
        int number = Integer.parseInt(args[0]);
        
        // Print divisors of the given number
        System.out.println("Divisors of " + number + ":");
        
        // Iterate from 1 to the given number
        for (int i = 1; i <= number; i++) {
            // Check if 'i' is a divisor of the given number
            if (number % i == 0) {
                // If 'i' is a divisor, print it
                System.out.println(i);
            }
        }
    }
}

