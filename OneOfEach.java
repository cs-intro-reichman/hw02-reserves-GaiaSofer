
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		int children = 0;
        boolean hasBoy = false;
        boolean hasGirl = false;

        while (!hasBoy || !hasGirl) {
            if (Math.random() < 0.5) {
                System.out.print("g ");
                hasGirl = true;
            } else {
                System.out.print("b ");
                hasBoy = true;
            }

            children++;
        }

        System.out.println("\nYou made it... and you now have " + children + " children.");
    }
}