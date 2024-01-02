/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		int max = Math.max(a,b);
		int min = Math.min(a,b);
		
		int minus = max - min;
		int minimal = max;
		
		for (int i = 0 ; i < 3 ; i ++) {
			int random = (int)((Math.random()) * (minus)) + min;
			System.out.println(random);

			// #feedback: why do you need this loop? - it will itterate only once anyway since at the next itteration random = minimal
			// you might use if instead or math.min
			// if (random < minimal) {
			// 	minimal = random;
			// }
			minmal = Math.min(minimal, random);
		}
		
		System.out.println("The minimal generated number was " + minimal);	
	}
}
