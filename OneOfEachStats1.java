/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
        int T = Integer.parseInt(args[0]);
        int totalChildren = 0;
        int familiesWith2Children = 0;
        int familiesWith3Children = 0;
        int familiesWith4OrMoreChildren = 0;
        int mostCommonNumber = 0;

        for (int t = 0; t < T; t++) {
            boolean hasBoy = false;
            boolean hasGirl = false;
            int children = 0;

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

            totalChildren += children;

            if (children == 2) {
                familiesWith2Children++;
            } else if (children == 3) {
                familiesWith3Children++;
            } else if (children >= 4) {
                familiesWith4OrMoreChildren++;
            }

            // Update most common number
            mostCommonNumber = Math.max(mostCommonNumber, children);
        }

        double average = (double) totalChildren / T;

        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + familiesWith2Children);
        System.out.println("Number of families with 3 children: " + familiesWith3Children);
        System.out.println("Number of families with 4 or more children: " + familiesWith4OrMoreChildren);

        if (mostCommonNumber >= 4) {
            System.out.println("The most common number of children is 4 or more.");
        } else if (mostCommonNumber == 3) {
            System.out.println("The most common number of children is 3.");
        } else {
            System.out.println("The most common number of children is 2.");
        }
    }
}