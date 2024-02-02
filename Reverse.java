/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
    public static void main(String[] args) {
        // Extract the input word from the command line arguments
        String word = args[0];
        int length = word.length() - 1;
        int length1 = word.length() - 1;
        System.out.print("Reversed word: ");
        for (int i = 0; i <= length1; i++) {
            char ch = word.charAt(length);
            System.out.print(ch);
            length = length - 1;
        }
        if (length1 % 2 == 0) {
            char ch2 = word.charAt(length1 / 2);
            System.out.println("\nThe middle character is: " + ch2);
        } else {
            char ch3 = word.charAt(length1 / 2 + 1);
            System.out.println("\nThe middle character is: " + ch3);
        }
    }
}