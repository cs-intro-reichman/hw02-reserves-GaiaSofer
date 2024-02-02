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

        for (int t = 0; t < T; t++) {
            int children = 0;
            boolean hasBoy = false;
            boolean hasGirl = false;

            while (!hasBoy || !hasGirl) {
                if (Math.random() < 0.5) {
                    hasGirl = true;
                } else {
                    hasBoy = true;
                }
                children++;}

                if (children == 2) {
                    familiesWith2Children++;
                } else if (children == 3) {
                    familiesWith3Children++;
                } else if (children >= 4) {
                    familiesWith4OrMoreChildren++;
                }
            

            totalChildren = children;
        }

        double average = (double) (familiesWith2Children * 2 + familiesWith3Children * 3 + familiesWith4OrMoreChildren * 4);
        double average1 = average / (9 * T);
        double average2 = average1 * 10; 

        System.out.println("Average: " + average2 + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + familiesWith2Children);
        System.out.println("Number of families with 3 children: " + familiesWith3Children);
        System.out.println("Number of families with 4 or more children: " + familiesWith4OrMoreChildren);

        int mostCommonNumber = Math.max(familiesWith3Children, familiesWith2Children);
        int mostCommonNumber1 = Math.max(familiesWith4OrMoreChildren, mostCommonNumber);

        if (mostCommonNumber1 == 4) {
            System.out.println("The most common number of children is 4 or more.");
        } else if (mostCommonNumber1 == 3) {
            System.out.println("The most common number of children is 3.");
        } else {
            System.out.println("The most common number of children is 2.");
        }
    }
}