/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// #Feedback: better to not do calculation in print commands
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);
	}
}
