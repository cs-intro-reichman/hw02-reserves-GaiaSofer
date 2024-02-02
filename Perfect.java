import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
        }

        int perfectNumber = Integer.parseInt(args[0]);
        String answer = "";
        boolean isPerfect = true;

        // Check if the number is a perfect number
        int sum = 0;
        for (int i = 1; i < perfectNumber; i++) {
            if (perfectNumber % i == 0) {
                sum += i;
                answer = answer + i;
                if (i < perfectNumber / 2) {
                    answer = answer + " + ";
                }
            }
        }

        // Check if the sum of divisors equals the original number
        if (sum * 2 == perfectNumber) {
            System.out.println(perfectNumber + " is a perfect number since " + perfectNumber + " = " + answer);
        } else {
            System.out.println(perfectNumber + " is not a perfect number");
        }
    }
}