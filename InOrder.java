/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int r_number = (int) (Math.random() * 10);
		System.out.print(r_number);
		
		for (int i = 0; i < 10; i++) {
			int r_number1 = (int) (Math.random() * 10);

			if (r_number1 > r_number) {
				System.out.print(" " + r_number1);
				r_number = r_number1;}
				
			else { 
				break; }
		}	
	}
}
