import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
        int perfectNumber = Integer.parseInt(args[0]);
        String answer = "";
        boolean isPerfect = true;

        // Check if the number is a perfect number
        for (int i = 1; i <= perfectNumber / 2; i++) {
            if (perfectNumber % i == 0) {
                answer = answer + i;
                if (i < perfectNumber / 2) {
                    answer = answer + " + ";
                } else {
                    isPerfect = false;
                    System.out.println(perfectNumber + " is not a perfect number");
                }
            }
        }

        if (isPerfect) {
            System.out.println(perfectNumber + " is a perfect number since " + perfectNumber + " = " + answer);
        }
    }
}